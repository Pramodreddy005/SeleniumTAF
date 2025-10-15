package actions;

import static org.testng.Assert.assertTrue;
import static utils.JsonUtils.getValueFromJson;
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
        sp.enterName(getValueFromJson(testCase, "userName"));
        sp.enterPassword(getValueFromJson(testCase, "password"));
        sp.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertTrue(sp.signOutButton.isDisplayed());
    
    }

}
