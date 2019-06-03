package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
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
    MyAccountSteps myAccountSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    CheckoutSteps checkoutSteps;

    @Before
    public void maximiseWindow() {
        driver.manage().window().maximize();
    }



    @Test
    public void loginAddProductGoToCartModifyQuantity() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLoginPage();
        loginSteps.loginUser(Credentials.USER_NAME,Credentials.USER_PASS);
        cartSteps.checkEmptyCart();
        productSteps.goToSearchIcon();
        productSteps.goToSearchProduct("Beanie");
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
    @Test
    public void searchProductAddTocartDoCheckout(){
        loginSteps.navigateToHomepage();
        productSteps.goToSearchIcon();
        productSteps.goToSearchProduct("Be");
        productSteps.goToSearchButton();
        productSteps.goToBeltButton();
        productSteps.setQuantityField("3");
        productSteps.goToAddToCartButton();
        cartSteps.goToCart();
        cartSteps.goToCheckout();
        myAccountSteps.setBillingFirstNameField("Radu");
        myAccountSteps.setBillingLastNameField("Valentin");
        myAccountSteps.selectCountry();
        myAccountSteps.setBillingAddressField("O straduta");
        myAccountSteps.setBillingAddressField2("Ingustuta");
        myAccountSteps.setBillingCity("Undeva");
        myAccountSteps.selectState();
        myAccountSteps.setZipcodeField("4000000");
        myAccountSteps.setBillingPhoneField("09090909090");
        myAccountSteps.completeEmailField("ceva@altceva.com");
        checkoutSteps.goToPlaceOrderButton();
        checkoutSteps.getConfirmationMessage();

    }

    @Test
    public void searchProductAddToCartModifyBillingDetails(){
        loginSteps.navigateToHomepage();
        productSteps.goToSearchIcon();
        productSteps.goToSearchProduct("Sh");
        productSteps.goToSearchButton();
        productSteps.goToVNeckTSirtButton();
        productSteps.setQuantityField("4");
        productSteps.selectColor("green");
        productSteps.selectSize("medium");
        productSteps.goToAddToCartButton();
        cartSteps.goToCart();
        cartSteps.goToCheckout();
        checkoutSteps.setBillingFirstName("Primul");
        checkoutSteps.setBillingLastName("Intaiul");
        myAccountSteps.selectCountry();
        myAccountSteps.setBillingAddressField("Acolo");
        myAccountSteps.setBillingAddressField2("Dincolo");
        myAccountSteps.setBillingCity("Hanoi");
        myAccountSteps.selectState();
        myAccountSteps.setZipcodeField("4000000");
        myAccountSteps.setBillingPhoneField("0800800800800");
        myAccountSteps.completeEmailField("cineva@undeva.com");
        checkoutSteps.goToPlaceOrderButton();
        checkoutSteps.getConfirmationMessage();

    }
}
