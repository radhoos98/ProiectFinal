package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;

public class ProductSteps {

    Homepage homepage;
    LoginPage loginPage;
    ProductPage productPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToLoginPage(){
        homepage.clickMyAccount();

    }

    @Step
    public void loginUser(String username, String userpass){
        loginPage.setEmailField(username);
        loginPage.setPassField(userpass);
        loginPage.clickLoginButton();
    }

    @Step
    public void goToSearchIcon(){
        productPage.clickSearchIcon();
    }

    @Step
    public void goToSearchProduct(){
        productPage.searchProduct("Beanie");
    }

    @Step
    public void goToSearchButton(){

        productPage.clickSearchButton();
    }

    @Step
    public void goToBeanieButton(){

        productPage.clickBeanieButton();
    }

    @Step
    public void setQuantityField(){
        productPage.setQuantityField("1");
    }

    @Step
    public void goToAddToCartButton(){

        productPage.clickAddToCartButton();
    }

    @Step
    public void checkConfirmationMessage(){

        productPage.checkConfirmationMessage();
    }

}