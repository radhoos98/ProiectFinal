package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class MyAccountPage extends PageObject {

    @FindBy(css = "#post-7 >div >div>div p:nth-child(1) >strong:nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy(css="li.woocommerce-MyAccount-navigation-link a[href$='page_id=7]")
    private WebElementFacade dashboardButton;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='7&orders']")
    private WebElementFacade ordersButton;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='7&downloads']")
    private WebElementFacade downloadsButton;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link a[href$='address']")
    private WebElementFacade adressesButton;

    @FindBy(css="li.woocommerce-MyAccount-navigation-link a[href$='account']")
    private WebElementFacade accountDetailsButton;

    @FindBy(css="li.woocommerce-MyAccount-navigation-link a[href*='logout&_wpnonce']")
    private WebElementFacade logOutButton;

    @FindBy(css="p a[href*='page_id=7&edit-address']")
    private WebElementFacade dashboardMessage;

    @FindBy(css = "a.woocommerce-Button.button")
    private WebElementFacade goShopButton;

    @FindBy(css = "tr[class*='woocommerce-orders-table']")
    private WebElementFacade ordersTable;

    @FindBy(css = "div.u-column1 h3")
    private WebElementFacade addressesMesage;

    @FindBy(css = "button[value='Save changes']")
    private WebElementFacade saveChangesButton;

    @FindBy(css = "a[href*='address=billing']")
    private WebElementFacade editBillingButton;

    @FindBy(id="billing_first_name")
    private WebElementFacade billingFirstNameField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameField;

    @FindBy(id = "billing_country")
    private WebElementFacade billingSelectCountry;

    @FindBy(css ="input[aria-activedescendant='select2-billing_country-result-rcbo-RO']")
    private WebElementFacade dropdownBillingSelectCountry;

    @FindBy(id = "billing_address_1.input-text")
    private WebElementFacade billingAddressField;

    @FindBy(id = "billing_address_2.input-text")
    private WebElementFacade getBillingAddressField2;

    @FindBy(id="billing_city.input-text")
    private WebElementFacade billingCity;

    @FindBy(id = "select2-billing_state-container")
    private WebElementFacade billingState;

    @FindBy(id="select2-billing_state-container")
    private WebElementFacade dropdownBillingState;

    @FindBy(css = "button[name='save_address']")
    private WebElementFacade saveAddressButton;

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade changeAddressMessage;


    public void checkLoggedIn(String userName) {
        helloMessage.shouldContainText  ( userName );
    }
    public void clickODashboard(){
        clickOn(dashboardButton);
    }
    public void clickOrders(){
        clickOn(ordersButton);
    }
    public void clickAdresses(){
        clickOn(adressesButton);
    }
    public void clickAccountDetails(){
        clickOn(accountDetailsButton);
    }
    public void clickLogOut(){
        clickOn(logOutButton);
    }
    public void clickDownloads(){
        clickOn(downloadsButton);
    }

    public void checkDashboardMessage(){
        dashboardMessage.shouldContainText("shipping and billing addresses");

    }
    public void checkNoOrders(){
        goShopButton.shouldBeVisible();
    }
    public void checkOrders(){
        ordersTable.shouldBeVisible();
    }
    public void checkAdressesMessage(){
        addressesMesage.shouldContainText("Billing address");
    }
    public void checkAccountDetails(){
        saveChangesButton.shouldBeVisible();
    }
    public void clickEditBillingButton(){
        clickOn(editBillingButton);
    }
    public void setBillingFirstNameField(){
        typeInto(billingFirstNameField,"Serbanescu");
    }
    public void setBillingLastNameField() {
        typeInto(billingLastNameField, "Radu");
    }
    public void setBillingSelectCountry(){
        clickOn(billingSelectCountry);
    }
    public void setDropdownBillingSelectCountry(){
        clickOn(dropdownBillingSelectCountry);
    }
    public void setBillingAddressField(){
        typeInto(billingAddressField,"o alta adresa");
    }
    public void setGetBillingAddressField2(){
        typeInto(getBillingAddressField2,"alt apartament");
    }
    public void setBillingCity(){
        typeInto(billingCity,"Ciudad de Cornesti");
    }
    public void setBillingState(){
        clickOn(billingState);
    }
    public void setDropdownBillingState(){
        clickOn(dropdownBillingState);
    }
    public void clickSaveAddressButton(){
        clickOn(saveAddressButton);
    }
    public void changeAddressMessage(){
        changeAddressMessage.shouldContainText("Address changed successfully");

    }







}
