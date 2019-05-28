package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.Credentials;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    LoginSteps loginSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    ProductSteps productSteps;

    @Before
    public void maximiseWindow() {
        driver.manage().window().maximize();
    }



    @Test
    public void loginAddProductGoToCartModifyQuantity() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        productSteps.goToSearchIcon();
        productSteps.goToSearchProduct();
        productSteps.goToSearchButton();
        productSteps.goToBeanieWithLogo();
        productSteps.setQuantityField("2");
        productSteps.goToAddToCartButton();
        cartSteps.goToCart();
        productSteps.setQuantityField("6");
        cartSteps.updateCart();
        cartSteps.goToCheckout();
        cartSteps.verifyProceedToCheckout();



    }

}
