package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.BlueRentalLoginPage;
import pages.HW_BlueRentalHomePage;
import utilities.Driver;

public class HW_BlueRentalLogin {
    HW_BlueRentalHomePage blueRentalHomePage = new HW_BlueRentalHomePage();

    @Then("user click on the login page")
    public void user_click_on_the_login_page() {
        blueRentalHomePage.login.click();
    }
    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    @Then("user enter username {string}")
    public void user_enter_username(String string) {
       blueRentalLoginPage.email.sendKeys(string);
    }
    @Then("user enter password {string}")
    public void user_enter_password(String string) {
       blueRentalLoginPage.password.sendKeys(string);
    }
    @Then("click on the login button")
    public void click_on_the_login_button() {
       blueRentalLoginPage.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
      blueRentalLoginPage.profile.isDisplayed();
    }


}

