package runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
    public static void main(String[] args) throws IOException {
    // String timeStamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")).toString();
    // System.out.println(timeStamp);
    // Test obj =new Test();
    // System.out.print(obj.getClass());

         System.setProperty("webdriver.chrome.driver", "src/test/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser started" );
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm#");

        // File f=driver.findElement(By.xpath("//span[contains(text(),'All')]")).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(f, new File("C:\\Users\\bairi.pramod\\AutomationSelenium\\demo\\target\\testresults\\passedScreenshots\\test.png"));
        WebElement wb =driver.findElement(By.xpath("//span[contains(text(),'All')]"));
        WebElement wb2= driver.findElement(RelativeLocator.with(By.xpath("//a[@href='fetchcat.htm']")).toLeftOf(wb));
        File f=wb2.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("C:\\Users\\bairi.pramod\\AutomationSelenium\\demo\\target\\testresults\\passedScreenshots\\test.png"));
        driver.close();
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(2));
        w.until(ExpectedConditions.visibilityOf(wb2));


    }

}
