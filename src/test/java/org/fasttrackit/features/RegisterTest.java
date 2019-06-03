package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.steps.MyAccountSteps;

@RunWith(SerenityRunner.class)


public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;
    @Steps
    MyAccountSteps myAccountSteps;
    @Before
    public void maximiseWindow(){
        driver.manage().window().maximize();
    }

    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.registerNewUser("nobody@anybody.com", "!213&45mnbvc!@]");
        myAccountSteps.confirmationMessage("anybody");
    }
    @Test
    public void registerWithInvalidEmail(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.registerNewUser("anybody@nobody", "1!23hsa@pietr[");
        loginSteps.invalidAddressMessage();
    }
    @Test
    public void registerWithAlreadyRegisteredAddress(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.registerNewUser("cineva@undeva.com" , "@1dgvc6&8£vnb.");
        loginSteps.ErrorAlreadyRegisteredMessage();
    }
    @Test
    public void registerWithWeakPassword(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setRegEmailField("cineva@undeva.com");
        registerSteps.setRegPasswordField("123asd");
        registerSteps.weakPasswordMessage();
    }

}
