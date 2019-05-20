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

    }

    @Step
    public void loginUser(String username, String userpass){
        loginPage.setEmailField(username);
        loginPage.setPassField(userpass);
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
