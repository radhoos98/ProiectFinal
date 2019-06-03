package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.utils.Credentials;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Before
    public void maximiseWindow(){
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        loginSteps.confirmationMessage(Credentials.USER_NAME);
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("rserbanescu@yahoo.com","123asdasd");
        loginSteps.checkUserNotLoggedIn();
    }

    @Test
    public void loginWithIncorrectEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("rsrbanescu@yahoo.com","USER_PASS");
        loginSteps.checkUserNotLoggedIn();
    }
    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("rserbanescu.yahoo.com","USER_PASS");
        loginSteps.userStillOnLoginPage();
    }

}
