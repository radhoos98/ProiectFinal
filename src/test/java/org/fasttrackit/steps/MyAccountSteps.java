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
    public void selectDropdownValues(){
        myAccountPage.selectDropdownValues();
    }
    @Step
    public void clickCountryField(){
        myAccountPage.clickCountryField();
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
    @Step
    public void setAccountFirstName(){
        myAccountPage.setAccountFirstNameFied();
    }
    @Step
    public void setAccountLastName(){
        myAccountPage.setAccountLastNameField();
    }
    @Step
    public void setCurrentPassword(){
        myAccountPage.setCurrentPasswordField();
    }
    @Step
    public void clickAccountSaveChanges(){
        myAccountPage.clickAccountSaveChanges();
    }
    @Step
    public void changeAccountDetailsMessage(){
        myAccountPage.changeAccountDetailsMessage();
    }
    @Step
    public void setNewPassword(){
        myAccountPage.setNewPasswordField();
    }
    @Step
    public void confirmNewPassword(){
        myAccountPage.setConfirmNewPasswordField();
    }
    @Step
    public void enterCurrentPassword(){
        myAccountPage.enterCurrentPassword();
    }
    @Step
    public void setWeakPassword(){
        myAccountPage.setWeakPassword();

    }
    @Step
    public void weakPasswordMessage(){
        myAccountPage.weakPasswordMessage();

    }
}
