package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    WebDriver driver;

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name="Login")
    WebElement login;
  
    @FindBy(name="Cancel")
    WebElement cancel;

    @FindBy(xpath ="(//*[@id='errormsg'])[2]")
    public WebElement errorMsg;

    @FindBy(xpath = "//a[normalize-space()='SignOut']")
    public WebElement signOutButton;

    public void enterName(String text){
        filltextfields(userName,text);
    }

    public void enterPassword(String text){
        filltextfields(password,text);
    }

    public void clickLogin(){
        clickElement(login);
    }
}
