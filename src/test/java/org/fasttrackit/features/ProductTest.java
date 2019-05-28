package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ProductTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        ProductSteps productSteps;

        @Steps
        LoginSteps loginSteps;

        @Before
        public void maximiseWindow(){
            driver.manage().window().maximize();
        }

        @Test
        public void checkProductWithValidQuantity(){
            loginSteps.navigateToHomepage();
            productSteps.goToSearchIcon();
            productSteps.goToSearchProduct();
            productSteps.goToSearchButton();
            productSteps.goToBeanieButton();
            productSteps.setQuantityField("1");
            productSteps.goToAddToCartButton();
            productSteps.checkConfirmationMessage();
        }

        @Test
        public void checkProductWithInvalidQuantity(){
            loginSteps.navigateToHomepage();
            productSteps.goToSearchIcon();
            productSteps.goToSearchProduct();
            productSteps.goToSearchButton();
            productSteps.goToBeanieButton();
            productSteps.setQuantityField("-11");
            productSteps.goToAddToCartButton();
            productSteps.checkConfirmationMessageIsNotDisplayed();
        }

        @Test
        public void checProductWithAlphabeticCharactersQuantity(){
            loginSteps.navigateToHomepage();
            productSteps.goToSearchIcon();
            productSteps.goToSearchProduct();
            productSteps.goToSearchButton();
            productSteps.goToBeanieButton();
            productSteps.setQuantityField("e");
            productSteps.goToAddToCartButton();
            productSteps.checkConfirmationMessageIsNotDisplayed();
        }

        }




