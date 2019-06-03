package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;



public class CartSteps {
    CartPage cartPage;

    @Step
    public void navigateToCartPage() {
        cartPage.open();
    }

    @Step
    public void goToCalculateShipping() {
        cartPage.clickCalculateShippingButton();
    }

    @Step
    public void goToQuantityField() {
        cartPage.doubleQuantity();
    }

    @Step
    public void updateCart() {
        cartPage.clickUpdateCartButton();
    }

    @Step
    public void goToCheckout() {
        cartPage.clickCheckoutButton();
    }

    @Step
    public void goToCart() {
        cartPage.clickCartButton();
    }

    @Step
    public void verifyProceedToCheckout() {
        cartPage.verifyProceedToCheckout();
    }



    @Step
    public void removeObjects() {
        cartPage.clickRemoveButton();
    }

    @Step
    public void checkEmptyCart() {
        if (!cartPage.isCartEmpty()) {
            cartPage.open();
            cartPage.clickRemoveButton();
        }

    }


}

