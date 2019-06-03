package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.time.temporal.ValueRange;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {

    @FindBy(css = "#post-7 >div >div>div p:nth-child(1) >strong:nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='7&orders']")
    private WebElementFacade ordersButton;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='address']")
    private WebElementFacade adressesButton;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='account']")
    private WebElementFacade accountDetailsButton;

    @FindBy(id = "account_first_name")
    private WebElementFacade accountFirstNameFied;

    @FindBy(id = "account_last_name")
    private WebElementFacade accountLastNameField;

    @FindBy(id = "password_current")
    private WebElementFacade currentPasswordField;

    @FindBy(css = "button[value='Save changes'")
    private WebElementFacade acountSaveChanges;


    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href*='logout&_wpnonce']")
    private WebElementFacade logOutButton;

    @FindBy(css = "a.woocommerce-Button.button")
    private WebElementFacade goShopButton;

    @FindBy(css = "tr[class*='woocommerce-orders-table']")
    private WebElementFacade ordersTable;

    @FindBy(css = "div.u-column1 h3")
    private WebElementFacade addressesMesage;

    @FindBy(css = "button[value='Save changes']")
    private WebElementFacade addressesSaveChangesButton;

    @FindBy(css = "a[href*='address=billing']")
    private WebElementFacade editBillingButton;

    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstNameField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameField;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneField;

    @FindBy(id = "billing_country")
    private WebElementFacade countryDropdown;

    @FindBy(css = "billing_country_field span.select2-selection__arrow [role='presentation']")
    private WebElementFacade countryField;

    @FindBy(css = "input[name='billing_address_1']")
    private WebElementFacade billingAddressField;

    @FindBy(css = "input[name='billing_address_2']")
    private WebElementFacade getBillingAddressField2;

    @FindBy(css = "input[name='billing_city']")
    private WebElementFacade billingCity;

    @FindBy(css = "select[name='billing_state']")
    private WebElementFacade stateDropdown;

    @FindBy(id = "select2-billing_state-container")
    private WebElementFacade billingStatefield;

    @FindBy(css = "button[name='save_address']")
    private WebElementFacade saveAddressButton;

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade changesMessage;

    @FindBy(id = "password_1")
    private WebElementFacade newPasswordField;

    @FindBy(id = "password_2")
    private WebElementFacade confirmNewPasswordField;

    @FindBy(css = "div[aria-live='polite']")
    private WebElementFacade weakPasswordMessage;

    @FindBy(css = "input[name='billing_postcode']")
    private WebElementFacade zipField;

    @FindBy(css = "input[name='billing_email']")
    private WebElementFacade emailField;

    @FindBy(css = "ul.woocommerce-error")
    private WebElementFacade errorZipCode;

    public void checkLoggedIn(String userName) {
        helloMessage.shouldContainText(userName);
    }

    public void clickOrders() {
        clickOn(ordersButton);
    }

    public void clickAdresses() {
        clickOn(adressesButton);
    }

    public void clickAccountDetails() {
        clickOn(accountDetailsButton);
    }

    public void setAccountFirstNameFied() {
        typeInto(accountFirstNameFied, "Io");
    }

    public void setAccountLastNameField() {
        typeInto(accountLastNameField, "Acelasi");
    }

    public void setCurrentPasswordField() {
        typeInto(currentPasswordField, "");
    }

    public void enterCurrentPassword() {
        typeInto(currentPasswordField, "CBa4567890&Z");
    }

    public void clickAccountSaveChanges() {
        clickOn(acountSaveChanges);
    }

    public void clickLogOut() {
        clickOn(logOutButton);
    }

    public void checkNoOrders() {
        goShopButton.shouldBeVisible();
    }

    public void checkOrders() {
        ordersTable.shouldBeVisible();
    }

    public void checkAdressesMessage() {
        addressesMesage.shouldContainText("Billing address");
    }

    public void checkAccountDetails() {
        addressesSaveChangesButton.shouldBeVisible();
    }

    public void clickEditBillingButton() {
        clickOn(editBillingButton);
    }

    public void setBillingFirstNameField(String FirstName) {
        typeInto(billingFirstNameField, FirstName);
    }

    public void setBillingLastNameField(String LastName) {
        typeInto(billingLastNameField, LastName);
    }

    public void selectCountry() {
        countryDropdown.selectByValue("RO");
    }

    public void selectState() {
        stateDropdown.selectByValue("CJ");

    }

    public void setBillingPhoneField(String Number) {
        typeInto(billingPhoneField, Number);
    }

    public void setBillingAddressField(String Adresa) {
        typeInto(billingAddressField, Adresa);
    }

    public void setGetBillingAddressField2(String Adresa2) {
        typeInto(getBillingAddressField2, Adresa2);
    }

    public void setBillingCity(String Localitate) {
        typeInto(billingCity, Localitate);
    }


    public void clickSaveAddressButton() {
        clickOn(saveAddressButton);
    }

    public void changeAddressMessage() {
        changesMessage.shouldContainText("Address changed successfully");

    }

    public void changeAccountDetailsMessage() {
        changesMessage.shouldContainText("Account details changed successfully");
    }

    public void setNewPasswordField(String NewPassword) {
        typeInto(newPasswordField, NewPassword);
    }

    public void setConfirmNewPasswordField(String NewPassword) {
        typeInto(confirmNewPasswordField, NewPassword);
    }

    public void setWeakPassword() {
        typeInto(newPasswordField, "1234");
    }

    public void weakPasswordMessage() {
        weakPasswordMessage.shouldContainText("Very weak");
    }

    public void setZipField(String Value) {
        typeInto(zipField, Value);
    }

    public void completeEmailField(String Email) {
        typeInto(emailField, Email);
    }

    public void errorZipcodeMessage() {
        errorZipCode.shouldContainText("Please enter a valid postcode / ZIP.");

    }


}