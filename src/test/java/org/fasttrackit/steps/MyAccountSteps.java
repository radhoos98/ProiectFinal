package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class MyAccountSteps {

    Homepage homepage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

 @Step
 public void navigateToMyAccountPage(){
     myAccountPage.open();
 }

@Step
    public void goToDashboard(){
    myAccountPage.clickODashboard();
}
@Step
    public void goToOrders(){
     myAccountPage.clickOrders();
}
@Step
    public void goToAdresses(){
     myAccountPage.clickAdresses();
}
@Step
    public void goToAccountDetails(){
     myAccountPage.clickAccountDetails();
}
@Step
    public void goToDownloads(){
     myAccountPage.clickDownloads();
}

@Step
    public void goToLogout(){
     myAccountPage.clickLogOut();
}

}
