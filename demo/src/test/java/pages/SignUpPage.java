package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//input[@id='userName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='pass_confirmation']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//span[normalize-space()='Male']")
    public WebElement genderMale;

    @FindBy(xpath = "//span[normalize-space()='Female']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@id='emailAddress']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='mobileNumber']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dob;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//select[@id='securityQuestion']")
    public WebElement securityQuestion;

    @FindBy(xpath = "//input[@id='answer']")
    public WebElement answer;

    @FindBy(xpath = "//input[@name='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@name='Cancel']")
    public WebElement cancelButton;

    //Actions
    
    public void enterUserName(String name){
        filltextfields(userName, name);
    }
    public void enterFirstName(String fName){
        filltextfields(firstName, fName);
    }
    public void enterLName(String lName){
        filltextfields(lastName, lName);
    }
    public void enterPassword(String pass){
        filltextfields(password, pass);
    }
    public void confPassword(String confPass){
        filltextfields(confirmPassword, confPass);
    }
    public void selectMaleButton(){
        clickElement(genderMale);
    }
    public void selectFemaleButton(){
        clickElement(genderFemale);
    }
    public void enterEmail(String emailadd){
        filltextfields(email, emailadd);
    }
    public void enterMobileNumber(String mobileNo){
        filltextfields(mobileNumber, mobileNo);
    }
    public void enterDOB(String dateOfBirth){
        filltextfields(dob, dateOfBirth);
    }
    public void enterAddress(String userAddress){
        filltextfields(address, userAddress);
    }
    public void fillSecurityQuestion(int idx){
        selectDropdownElementByIndex(securityQuestion, idx);
    }
    public void enterSecurityAnswer(String securityAns){
        filltextfields(securityQuestion, securityAns);
    }
    public void clickCancelButton(){
        clickElement(cancelButton);
    }
    public void clickSubmitButton(){
        clickElement(submitButton);
    }
    

    

    




    





}
