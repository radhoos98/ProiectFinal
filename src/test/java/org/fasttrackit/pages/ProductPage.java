package org.fasttrackit.pages;

        import net.serenitybdd.core.annotations.findby.FindBy;
        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.core.pages.WebElementFacade;
        import org.openqa.selenium.WebElement;

public class ProductPage extends PageObject {

    @FindBy(css ="a i.fa.fa-search")
    private WebElementFacade searchIcon;

    @FindBy(css="input.search-field")
    private WebElementFacade inputSearchField;

    @FindBy(css = "button i.fa.fa-search")
    private WebElementFacade searchButton;

    @FindBy (css= "a[href$='product=beanie']")
    private WebElementFacade beanieButton;

    @FindBy (css="input#quantity_5ce27ff45fb33")
    private WebElementFacade quantityField;

    @FindBy (css = "button.single_add_to_cart_button.button.alt")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade confirmationMessage;


    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void searchProduct(String Beanie){
        typeInto(inputSearchField, "Beanie");
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickBeanieButton(){
        clickOn(beanieButton);
    }
    public void setQuantityField(String Quantity){
       typeInto(quantityField,"1");
    }

    public void clickAddToCartButton(){
       clickOn(addToCartButton);
    }

    public void checkConfirmationMessage(){
       confirmationMessage.shouldContainText("Beanie"+"has been added to your cart");
    }

}