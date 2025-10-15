package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")
    WebElement signUp;

    @FindBy(xpath = "//*[@id=\'menu3\']/li[1]/a/span")
    WebElement home;

    
    //common

    public void clickElement(WebElement element){
        element.click();
    }

    public void filltextfields(WebElement element,String text){
        element.sendKeys(text);
    }

    public void selectDropdownElementByIndex(WebElement wb,int index){
        Select select= new Select(wb);
        select.selectByIndex(index);
    }
    
    public void clickSignIn(){
        clickElement(signIn);
    }

    public void clicksignUp(){
        clickElement(signUp);
    }

    public void clickHome(){
        clickElement(home);
    }


}
