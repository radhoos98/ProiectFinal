package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;


public class LoginSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToMayAccountPage(){
        myAccountPage.open();

    }

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
    public void confirmationMessage(String Username){
        myAccountPage.confirmationMessage(Username);
    }

    @Step
    public void checkUserNotLoggedIn(){
        loginPage.checkErrorMessage();
    }

    @Step
    public void userStillOnLoginPage(){
        loginPage.checkUserIsOnLoginPage();
    }
    @Step
    public void ErrorAlreadyRegisteredMessage(){
        loginPage.checkErrorAlreadyRegistered();
    }
    @Step
    public void invalidAddressMessage(){
        loginPage.checkErrorInvalidAdress();
    }

}
