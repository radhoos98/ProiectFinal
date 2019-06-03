package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=5")
public class CartPage extends PageObject {

    @FindBy(css = "i.fa.fa-shopping-cart")
    private WebElementFacade cartButton;

    @FindBy(css = ".wc-forward")
    private WebElementFacade checkoutButton;

    @FindBy(css = "a.shipping-calculator-button")
    private WebElementFacade calculateShippingButton;

    @FindBy(css = "input[class='input-text qty text'")
    private WebElementFacade quantityField;

    @FindBy(css = "td.actions button.button")
    private WebElementFacade updateCartButton;

    @FindBy(css = "a i.fa.fa-search")
    private WebElementFacade searchIcon;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".blockOverlay")
    List<WebElementFacade> overlayElements;

    @FindBy(css = "a.remove")
    private WebElementFacade removeButton;

    @FindBy(css = "span.cart-count")
    private WebElementFacade cartCount;




    public void clickCartButton() {
        clickOn(cartButton);
    }

    public void clickCalculateShippingButton() {
        clickOn(calculateShippingButton);
    }

    public void doubleQuantity() {
        typeInto(quantityField, "2");
    }

    public void clickUpdateCartButton() {
        clickOn(updateCartButton);
    }

    public void clickCheckoutButton() {
        waitABit(1500);
        clickOn(checkoutButton);
    }

    public void verifyProceedToCheckout() {
        placeOrderButton.shouldBePresent();
    }

    public void clickRemoveButton() {
        waitFor(removeButton);
        try {
            while (removeButton.isDisplayed()) {
                clickOn(removeButton);
                waitABit(500);
                getDriver().navigate().refresh();
            }
        }catch (NoSuchElementException e){
            System.out.println("No products in cart");
        }

    }

    public boolean isCartEmpty() {
        if (cartCount.containsText("0")) {
            return true;
        }
        return false;
    }

}
