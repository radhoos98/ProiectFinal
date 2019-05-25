package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class MyAccountTest {
    @RunWith(SerenityRunner.class)
    public class LoginTest {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        LoginSteps loginSteps;

        @Before
        public void maximiseWindow(){
            driver.manage().window().maximize();
        }

    }

}

