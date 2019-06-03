package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.MyAccountPage;

public class MyAccountSteps {

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
    public void checkOrders() {
        myAccountPage.checkOrders();
    }

    @Step
    public void checkAdresses() {
        myAccountPage.checkAdressesMessage();
    }

    @Step
    public void goToEditBillingButton() {
        myAccountPage.clickEditBillingButton();
    }

    @Step
    public void setBillingFirstNameField(String FirstName) {
        myAccountPage.setBillingFirstNameField(FirstName);
    }

    @Step
    public void setBillingLastNameField(String LastName) {
        myAccountPage.setBillingLastNameField(LastName);
    }

    @Step
    public void selectCountry() {
        myAccountPage.selectCountry();
    }

    @Step
    public void selectState() {
        myAccountPage.selectState();
    }

    @Step
    public void setBillingAddressField(String Adresa) {
        myAccountPage.setBillingAddressField(Adresa);
    }

    @Step
    public void setBillingAddressField2(String Adresa2) {
        myAccountPage.setGetBillingAddressField2(Adresa2);
    }

    @Step
    public void setBillingCity(String Localitate) {
        myAccountPage.setBillingCity(Localitate);
    }

    @Step
    public void clickSaveAddress() {
        myAccountPage.clickSaveAddressButton();
    }

    @Step
    public void changeAddressMessage() {
        myAccountPage.checkAdressesMessage();
    }

    @Step
    public void setAccountFirstName() {
        myAccountPage.setAccountFirstNameFied();
    }

    @Step
    public void setAccountLastName() {
        myAccountPage.setAccountLastNameField();
    }

    @Step
    public void setCurrentPassword() {
        myAccountPage.setCurrentPasswordField();
    }

    @Step
    public void clickAccountSaveChanges() {
        myAccountPage.clickAccountSaveChanges();
    }

    @Step
    public void changeAccountDetailsMessage() {
        myAccountPage.changeAccountDetailsMessage();
    }

    @Step
    public void setNewPassword(String NewPassword) {
        myAccountPage.setNewPasswordField(NewPassword);
    }

    @Step
    public void confirmNewPassword(String NewPassword) {
        myAccountPage.setConfirmNewPasswordField(NewPassword);
    }

    @Step
    public void enterCurrentPassword() {
        myAccountPage.enterCurrentPassword();
    }

    @Step
    public void setWeakPassword() {
        myAccountPage.setWeakPassword();

    }

    @Step
    public void weakPasswordMessage() {
        myAccountPage.weakPasswordMessage();

    }

    @Step
    public void setZipcodeField(String Value) {
        myAccountPage.setZipField(Value);
    }

    @Step
    public void zipcodeErrorMessage() {
        myAccountPage.errorZipcodeMessage();
    }

    @Step
    public void setBillingPhoneField(String Number) {
        myAccountPage.setBillingPhoneField(Number);
    }

    @Step
    public void completeEmailField(String Email) {
        myAccountPage.completeEmailField(Email);
    }

}
