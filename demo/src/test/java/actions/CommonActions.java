package actions;

import org.openqa.selenium.WebDriver;

import steps.Hooks;

public class CommonActions {
    
    WebDriver driver;

    public CommonActions(){
        driver=Hooks.getDriver();
    }

    public void openUrl(String url) {
        driver.get(url);
    }


    
}
