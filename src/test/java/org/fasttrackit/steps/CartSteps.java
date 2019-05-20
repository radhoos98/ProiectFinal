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
    public void goToCalculateShipping(){
        cartPage.clickCalculateShippingButton();
    }
    public void goToQuantityField(){
        cartPage.doubleQuantity();
    }
    public void updateCart(){
        cartPage.clickUpdateCartButton();
    }
    public void goToCheckout(){
        cartPage.clickCheckoutButton();
    }
}
