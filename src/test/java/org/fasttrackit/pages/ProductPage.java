package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class ProductPage extends PageObject {

    @FindBy(css = "a i.fa.fa-search")
    private WebElementFacade searchIcon;

    @FindBy(css = "input.search-field")
    private WebElementFacade inputSearchField;

    @FindBy(css = "button i.fa.fa-search")
    private WebElementFacade searchButton;

    @FindBy(css = "a[href$='product=beanie']")
    private WebElementFacade beanieButton;

    @FindBy(css = "a[href$='logo'")
    private WebElementFacade beanieWithLogoButton;

    @FindBy(css = "article.post-20 [rel=bookmark" )
    private WebElementFacade beltButton;

    @FindBy(css = "input[id^='quantity']")
    private WebElementFacade quantityField;

    @FindBy(css = "button.single_add_to_cart_button.button.alt")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade confirmationMessage;

    @FindBy(css = "article.post-15 [rel=bookmark")
    private WebElementFacade vNeckTShirtButton;

    @FindBy (css = "select[name='attribute_pa_color']")
    private WebElementFacade colorDropdown;

    @FindBy (css = "td.value [name='attribute_pa_color'")
    private WebElementFacade colorDropdownField;

    @FindBy(css = "select[name='attribute_pa_size']")
    private WebElementFacade sizeDropDown;

    public void clickSearchIcon() {
        clickOn(searchIcon);
    }

    public void searchProduct(String Search) {
        typeInto(inputSearchField,Search);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void clickBeanieButton() {
        clickOn(beanieButton);
    }
    public void clickBeltButton(){
        clickOn(beltButton);

    }
    public void clickBeanieWithLogoButton(){
        clickOn(beanieWithLogoButton);
    }

    public void setQuantityField(String Quantity) {
        typeInto(quantityField,Quantity);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void checkConfirmationMessage(String productName) {
        confirmationMessage.shouldContainText("“" + productName + "” has been added to your cart");
    }
    public void checkConfirmationMessageIsNotDisplayed(){
        confirmationMessage.shouldNotBePresent();
    }
    public void clickVNeckTSirtButton(){
        clickOn(vNeckTShirtButton);
    }
    public void selectColor(String Color){
        colorDropdown.selectByValue(Color);
    }
    public void selectSize(String Size){
        sizeDropDown.selectByValue(Size);
    }

}