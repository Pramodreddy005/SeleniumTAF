package actions;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.SignInPage;
import steps.Hooks;

public class SignInActions {
    WebDriver driver;
    SignInPage sp;
    BasePage bp;
    
    public SignInActions(){
    this.driver = Hooks.getDriver();
        sp = PageFactory.initElements(driver,SignInPage.class);
        bp = PageFactory.initElements(driver,BasePage.class);
    }

    public void checkLoginFunctionality(String testCase) {
        bp.clickSignIn();
        sp.enterName("admin");
        sp.enterPassword("password");
        sp.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(sp.errorMsg.getText(), "Username or Password is wrong here!!!");
    
    }

}
