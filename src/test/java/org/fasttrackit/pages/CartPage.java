package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class CartPage extends PageObject {

    @FindBy (css = "i.fa.fa-shopping-cart")
    private WebElementFacade cartButton;

    @FindBy (css = "a.checkout-button.button.alt.wc-forward")
    private WebElementFacade checkoutButton;

    @FindBy (css = "a.shipping-calculator-button")
    private WebElementFacade calculateShippingButton;

    @FindBy (css ="input#quantity_5ce2cfdfcb52f.input-text.qty.text" )
    private WebElementFacade quantityField;

    @FindBy(css = "td.actions button.button")
    private WebElementFacade updateCartButton;

    @FindBy (css = "a i.fa.fa-search")
    private WebElementFacade searchIcon;

    public void clickCartButton(){
        clickOn(cartButton);
    }
    public void clickCalculateShippingButton(){
        clickOn(calculateShippingButton);
    }

    public void doubleQuantity(){
        typeInto(quantityField,"2");
    }
    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }
    public  void clickCheckoutButton(){
        clickOn(checkoutButton);
    }
}
