package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.Credentials;


public class CartSteps {
    ProductPage productPage;
    SearchResultPage searchResultPage;
    CartPage cartPage;

    @Step
    public void navigateToCartPage() {
        cartPage.open();
    }
    @Step
    public void goToCalculateShipping(){
        cartPage.clickCalculateShippingButton();
    }
    @Step
    public void goToQuantityField(){
        cartPage.doubleQuantity();
    }
    @Step
    public void updateCart(){
        cartPage.clickUpdateCartButton();
    }
    @Step
    public void goToCheckout(){
        cartPage.clickCheckoutButton();
    }
    @Step
    public void goToCart(){
        cartPage.clickCartButton();
    }
    @Step
    public void verifyProceedToCheckout(){
        cartPage.verifyProceedToCheckout();
    }

   @Step
    public void waitAbit(){
        waitAbit();
   }
   @Step
    public void close(){
        close();
   }
    }

