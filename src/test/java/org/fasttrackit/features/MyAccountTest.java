package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.MyAccountSteps;
import org.fasttrackit.utils.Credentials;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class MyAccountTest {


    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    MyAccountSteps myAccountSteps;


    @Before
    public void maximiseWindow() {
        driver.manage().window().maximize();
    }


    @Test
    public void logoutMyAccount() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME, Credentials.USER_PASS);
        myAccountSteps.goToLogout();
        loginSteps.userStillOnLoginPage();

    }

    @Test
    public void checkOrders() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME, Credentials.USER_PASS);
        myAccountSteps.goToOrders();
        myAccountSteps.checkOrders();
    }

    @Test
    public void checkAdresses() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME, Credentials.USER_PASS);
        myAccountSteps.goToAdresses();
        myAccountSteps.checkAdresses();
    }

    @Test
    public void AdressesChangeBillingNameAndAddress() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME, Credentials.USER_PASS);
        myAccountSteps.goToAdresses();
        myAccountSteps.goToEditBillingButton();
        myAccountSteps.setBillingFirstNameField();
        myAccountSteps.setBillingLastNameField();
//        myAccountSteps.clickCountryField();
//        myAccountSteps.selectDropdownValues();
//        myAccountSteps.setBillingAddressField();
//        myAccountSteps.setBillingAddressField2();
//        myAccountSteps.setBillingCity();
//        myAccountSteps.clickSaveAddress();
//        myAccountSteps.changeAddressMessage();
    }
    @Test
    public void changeAccountFirstNameAndLastName(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        myAccountSteps.goToAccountDetails();
        myAccountSteps.setAccountFirstName();
        myAccountSteps.setAccountLastName();
        myAccountSteps.setCurrentPassword();
        myAccountSteps.clickAccountSaveChanges();
        myAccountSteps.changeAccountDetailsMessage();


    }
    @Test
    public void changeAccountFirstAndLastNameAndPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        myAccountSteps.goToAccountDetails();
        myAccountSteps.setAccountFirstName();
        myAccountSteps.setAccountLastName();
        myAccountSteps.enterCurrentPassword();
        myAccountSteps.setNewPassword();
        myAccountSteps.confirmNewPassword();
        myAccountSteps.clickAccountSaveChanges();
        myAccountSteps.changeAccountDetailsMessage();

    }
    @Test
    public void changeAccountWeakPassword(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        myAccountSteps.goToAccountDetails();
        myAccountSteps.setAccountFirstName();
        myAccountSteps.setAccountLastName();
        myAccountSteps.setWeakPassword();
        myAccountSteps.weakPasswordMessage();

    }

}

