package actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;
import pages.SignUpPage;
import steps.Hooks;
import static utils.JsonUtils.getValueFromJson;

import java.io.File;

public class SignUpActions {
    WebDriver driver;
    SignUpPage sup;
    BasePage bp;
    
    public SignUpActions(){
    this.driver = Hooks.getDriver();
        sup = PageFactory.initElements(driver,SignUpPage.class);
        bp = PageFactory.initElements(driver,BasePage.class);
    }

    public void testsignUpfunctionality(String testCase) {
        bp.clicksignUp();
        sup.enterUserName(getValueFromJson(testCase, "userName"));
        sup.enterFirstName(getValueFromJson(testCase,"firstName"));
        sup.enterLName(getValueFromJson(testCase,"lastName"));
        sup.enterPassword(getValueFromJson(testCase,"password"));
        sup.confPassword(getValueFromJson(testCase,"confirmPassword"));
        sup.selectMaleButton();
        sup.enterEmail(getValueFromJson(testCase,"email"));
        sup.enterMobileNumber(getValueFromJson(testCase,"mobileNumber"));
        sup.enterDOB(getValueFromJson(testCase,"dob"));
        sup.enterAddress(getValueFromJson(testCase,"address"));
        sup.fillSecurityQuestion(0);
        sup.enterSecurityAnswer(getValueFromJson(testCase,"securityAnswer"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", sup.submitButton);
        sup.clickSubmitButton();
    }


}
