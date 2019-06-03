package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.Register;

public class RegisterSteps {
    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    Register registerPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void navigateToMyAccountPage() {
        myAccountPage.open();
    }
    @Step
    public void setRegEmailField(String Email){
        registerPage.setRegEmailField(Email);
    }
    @Step
    public void setRegPasswordField(String Password){
        registerPage.setRegPasswordField(Password);
    }
    @Step
    public void registerNewUser(String Email,String Password){
        registerPage.setRegEmailField(Email);
        registerPage.setRegPasswordField(Password);
        registerPage.clickRegisterButton();
    }
    @Step
    public void weakPasswordMessage(){
        registerPage.weakPasswordMessage();}
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }


}