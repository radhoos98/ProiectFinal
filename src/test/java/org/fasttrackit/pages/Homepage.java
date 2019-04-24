package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class Homepage extends PageObject {

    @FindBy(css = "a.skip-account .label")
    private WebElementFacade myAccountButton;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    public void clickMyAccount(){
        clickOn(myAccountButton);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

}
