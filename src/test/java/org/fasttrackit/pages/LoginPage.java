package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.fasttrackit.utils.Credentials;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class LoginPage extends PageObject {


    @FindBy(id = "username.woodcommerce-Input.woodcommerce-Input--text.input-text")
    private WebElementFacade emailField;

    @FindBy(id = "password.woodcommerce-Input.woodcommerce-Input--text.input-text")
    private WebElementFacade passField;

    @FindBy(css = "button.woodcommerce-Button.button")
    private WebElementFacade loginButton;

    @FindBy(css = "ul.woodcommerce-error")
    private WebElementFacade errorMessage;

    public void setEmailField(String USER_NAME){
        typeInto(emailField, Credentials.USER_NAME);
    }

    public void setPassField(String USER_PASS){
        typeInto(passField,Credentials.USER_PASS);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }


    public void checkErrorMessage(){
        errorMessage.shouldContainText("Invalid login or password.");
    }

    public void checkUserIsOnLoginPage(){
        loginButton.shouldBeVisible();
    }
}
