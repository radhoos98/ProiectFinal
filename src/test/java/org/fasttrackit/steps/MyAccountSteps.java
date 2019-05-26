package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class MyAccountSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToMyAccountPage() {
        myAccountPage.open();
    }

    @Step
    public void goToDashboard() {
        myAccountPage.clickODashboard();
    }

    @Step
    public void goToOrders() {
        myAccountPage.clickOrders();
    }

    @Step
    public void goToAdresses() {
        myAccountPage.clickAdresses();
    }

    @Step
    public void goToAccountDetails() {
        myAccountPage.clickAccountDetails();
    }

    @Step
    public void goToDownloads() {
        myAccountPage.clickDownloads();
    }

    @Step
    public void goToLogout() {
        myAccountPage.clickLogOut();
    }

    @Step
    public void checkOrders(){
        myAccountPage.checkOrders();
    }

    @Step
    public void checkAdresses(){
        myAccountPage.checkAdressesMessage();
    }
    @Step
    public void goToEditBillingButton(){
        myAccountPage.clickEditBillingButton();
    }
    @Step
    public void setBillingFirstNameField(){
        myAccountPage.setBillingFirstNameField();
    }
    @Step
    public void setBillingLastNameField(){
        myAccountPage.setBillingLastNameField();
    }
    @Step
    public void setBillingSelectCountry(){
        myAccountPage.setBillingSelectCountry();
    }
    @Step
    public void setDropdownBillingSelectCountry(){
        myAccountPage.setDropdownBillingSelectCountry();
    }
    @Step
    public void setBillingAddressField(){
        myAccountPage.setBillingAddressField();
    }
    @Step
    public void setBillingAddressField2(){
        myAccountPage.setGetBillingAddressField2();
    }
    @Step
    public void setBillingCity(){
        myAccountPage.setBillingCity();
    }
    @Step
    public void clickSaveAddress(){
        myAccountPage.clickSaveAddressButton();
    }
    @Step
    public void changeAddressMessage(){
        myAccountPage.checkAdressesMessage();
    }
}
