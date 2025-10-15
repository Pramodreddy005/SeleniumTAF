package steps;

import org.openqa.selenium.WebDriver;

import actions.CommonActions;
import actions.SignInActions;
import actions.SignUpActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.SignInPage;
import utils.JsonUtils;

public class CommonSteps { 
    
    WebDriver driver;
    SignInPage sp;
    BasePage bp;
    CommonActions commonActions;
    SignInActions signInActions;
    SignUpActions signUpActions;


    public CommonSteps(){
        commonActions=new CommonActions();
        signInActions=new SignInActions();
        signUpActions=new SignUpActions();

    }   

    @When("the user navigates to url {string}")
    public void iNavigateTo(String testCase) {
        String url =JsonUtils.getValueFromJson(testCase, "url");
        commonActions.openUrl(url);
    }

    @Then("user checks the login Functionality")
    public void checkLoginFunctionality(String testCase){
        signInActions.checkLoginFunctionality(testCase);

    }

    @Then("user tests the SignUp Functionality {string}")
    public void checksignUpFunctionality(String testCase){
        signUpActions.testsignUpfunctionality(testCase);

    }

    
    @Then("user tests the SignIn Functionality {string}")
    public void checkSignInFunctionality(String testCase){
        signInActions.checkLoginFunctionality(testCase);

    }


}
