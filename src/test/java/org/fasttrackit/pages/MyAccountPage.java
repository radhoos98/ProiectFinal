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



}
