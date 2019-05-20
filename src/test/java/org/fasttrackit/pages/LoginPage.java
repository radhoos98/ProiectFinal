package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.fasttrackit.utils.Credentials;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class LoginPage extends PageObject {


    @FindBy(css = ".woocommerce-form-row  #username")
    private WebElementFacade emailField;

    @FindBy(css = ".woocommerce-form-row  #password")
    private WebElementFacade passField;

    @FindBy(css = "button.woocommerce-Button.button[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = "ul.woocommerce-error")
    private WebElementFacade errorMessage;

    public void setEmailField(String USER_NAME){
        typeInto(emailField, USER_NAME);
    }

    public void setPassField(String USER_PASS){
        typeInto(passField,USER_PASS);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }


    public void checkErrorMessage(){
        errorMessage.shouldContainText("Lost your password?");
    }

    public void checkUserIsOnLoginPage(){
        loginButton.shouldBeVisible();
    }
}
