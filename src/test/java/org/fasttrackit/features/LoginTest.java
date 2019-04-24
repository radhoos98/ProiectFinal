package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("cosmin@fasttrackit.org","123456");
        loginSteps.checkUserIsLoggedIn();
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("cosmin@fasttrackit.org","123adsda");
        loginSteps.checkUserNotLoggedIn();
    }

    @Test
    public void loginWithIncorrectEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("cosmaasdn@fasttrackit.org","123adsda");
        loginSteps.checkUserNotLoggedIn();
    }
    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser("cosminfasttrackit.org","123adsda");
        loginSteps.userStillOnLoginPage();
    }

}
