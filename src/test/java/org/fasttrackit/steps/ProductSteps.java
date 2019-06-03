package org.fasttrackit.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.yecht.Data;

public class ProductSteps {

    Homepage homepage;
    LoginPage loginPage;
    ProductPage productPage;

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void goToLoginPage() {
        homepage.clickMyAccount();

    }

    @Step
    public void loginUser(String username, String userpass) {
        loginPage.setEmailField(username);
        loginPage.setPassField(userpass);
        loginPage.clickLoginButton();
    }

    @Step
    public void goToSearchIcon() {
        productPage.clickSearchIcon();
    }

    @Step
    public void goToSearchProduct(String Search) {
        productPage.searchProduct(Search);
    }

    @Step
    public void goToSearchButton() {
        productPage.clickSearchButton();
    }

    @Step
    public void goToBeanieButton() {
        productPage.clickBeanieButton();
    }

    @Step
    public void goToBeanieWithLogo(){
        productPage.clickBeanieWithLogoButton();
    }

    @Step
    public void setQuantityField(String Quantity) {
        productPage.setQuantityField(Quantity);
    }

    @Step
    public void goToAddToCartButton() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkConfirmationMessage() {
        productPage.checkConfirmationMessage("Beanie");
    }

    @Step
    public void checkConfirmationMessageIsNotDisplayed() {
        productPage.checkConfirmationMessageIsNotDisplayed();
    }
    @Step
    public void goToBeltButton(){
        productPage.clickBeltButton();
    }
    @Step

    public void goToVNeckTSirtButton(){
        productPage.clickVNeckTSirtButton();
    }
    @Step
    public void selectColor(String Color){
        productPage.selectColor(Color);
    }
    @Step
    public void selectSize(String Size){
        productPage.selectSize(Size);
    }



}
