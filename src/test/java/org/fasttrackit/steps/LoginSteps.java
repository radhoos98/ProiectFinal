package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.utils.Credentials;

public class LoginSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToLoginPage(){
        homepage.clickMyAccount();
        homepage.clickLoginButton();
    }

    @Step
    public void loginUser(String USER_NAME, String USER_PASS){
        loginPage.setEmailField(Credentials.USER_NAME);
        loginPage.setPassField(Credentials.USER_PASS);
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(){
        myAccountPage.checkLoggedIn("rserbanescu");
    }

    @Step
    public void checkUserNotLoggedIn(){
        loginPage.checkErrorMessage();
    }

    @Step
    public void userStillOnLoginPage(){
        loginPage.checkUserIsOnLoginPage();
    }

}
