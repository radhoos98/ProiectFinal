package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class Register extends PageObject {


    @FindBy(id = "reg_email")
    private WebElementFacade regEmailField;
    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordField;
    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;
    @FindBy(css = "div.woocommerce-password-strength.bad")
    private WebElementFacade weakPassword;

    public void setRegEmailField(String Email){
        typeInto(regEmailField,Email);
    }
    public void setRegPasswordField(String Password){
        typeInto(regPasswordField,Password);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public void weakPasswordMessage(){
        weakPassword.shouldContainText("Weak - Please enter a stronger password.");
    }


}
