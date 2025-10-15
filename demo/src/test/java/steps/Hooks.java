package steps;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
   
    private static WebDriver driver;
    
    @Before
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "src/test/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser started" );
    }


    @After(order = 998)
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }

    @After(order = 999)
    public void captureResults(Scenario scenario) throws IOException{
       File f= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
       String scenarioName=scenario.getName();
       String timeStamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm")).toString();
       if(scenario.isFailed()){
        FileUtils.copyFile(f, new File("target/testresults/failedScreenshots/"+scenarioName+timeStamp+".png"));
       } 
       else{
        FileUtils.copyFile(f, new File("target/testresults/passedScreenshots/"+scenarioName+timeStamp+".png"));
       } 
    }
    public static WebDriver getDriver() {
        return driver;
    }

}
