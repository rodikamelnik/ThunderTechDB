package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPageForSchool {

    public LoginPageForSchool(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void loginPageForSchool() {
        Driver.getDriver().get("http://cybertektraining.com/");
    }


}
