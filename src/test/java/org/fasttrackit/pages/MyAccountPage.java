package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade helloMessage;


    public void checkLoggedIn(String userName) {
        helloMessage.shouldContainText("Hello, " + userName + "!");
    }
}
