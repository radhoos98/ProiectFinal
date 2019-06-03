package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;

public class CheckoutSteps {
    CheckoutPage checkoutPage;

    @Step
    public void navigateToCheckoutPage(){
        checkoutPage.open();
    }
    @Step
    public void goToShowLoginButton(){
        checkoutPage.goToShowLoginButton();
    }
    @Step
    public void goToPlaceOrderButton(){
        checkoutPage.goToPlaceOrderButton();
    }
    @Step
    public void getConfirmationMessage(){
        checkoutPage.getConfirmationMessage();
    }
    @Step
    public void setEmailField(String Email){
        checkoutPage.goToEmailField(Email);
    }
    @Step
    public void setPasswordField(String Password){
        checkoutPage.goToPasswordField(Password);
    }
    @Step
    public void loginBlock(){
        checkoutPage.loginBlock();
    }
    @Step
    public void setBillingFirstName(String FirstName){
        checkoutPage.setBillingFirstName(FirstName);
    }
    @Step
    public void setBillingLastName(String LastName){
        checkoutPage.setBillingLastName(LastName);
    }
}
