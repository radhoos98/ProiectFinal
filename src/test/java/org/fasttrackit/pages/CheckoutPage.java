package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.NoSuchElementException;
import java.util.List;


@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=6")
public class CheckoutPage extends PageObject{

    @FindBy(css = "a[class='showlogin']")
    private WebElementFacade showLoginButton;
    @FindBy(css = "form.woocommerce-form.woocommerce-form-login.login[style*='block']")
    private WebElementFacade loginBlock;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = "h1.entry-title")
    private WebElementFacade confirmationMessage;
    @FindBy(css = "p.form-row.form-row-first input[name=username")
    private WebElementFacade emailField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameField;


    public void goToShowLoginButton(){
        clickOn(showLoginButton);
    }
    public void goToPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void getConfirmationMessage(){
        confirmationMessage.shouldContainText("Checkout");
    }
    public void goToEmailField(String Email){
        waitFor(emailField);
        typeInto(emailField,Email);
    }
    public void goToPasswordField (String Password){
        typeInto(passwordField,Password);
    }
    public void loginBlock(){
        loginBlock.shouldBePresent();
    }
    public void setBillingFirstName(String FirstName){
        typeInto(billingFirstNameField,FirstName);
    }
    public void setBillingLastName (String LastName){
        typeInto(billingLastNameField,LastName);
    }



}
