package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.ProductSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class ProductTest {
    @RunWith(SerenityRunner.class)
    public class productTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        ProductSteps productSteps;

        @Before
        public void maximiseWindow(){
            driver.manage().window().maximize();
        }

        @Test
        public void checkProductWithValidQuantity(){
            productSteps.goToSearchIcon();
            productSteps.goToSearchProduct();
            productSteps.goToSearchButton();
            productSteps.goToBeanieButton();
            productSteps.setQuantityField();
            productSteps.goToAddToCartButton();
            productSteps.checkConfirmationMessage();
        }

    }

}
