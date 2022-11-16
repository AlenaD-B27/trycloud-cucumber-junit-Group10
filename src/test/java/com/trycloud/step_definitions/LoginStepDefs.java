package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page(){
        Driver.getDriver().get(ConfigReader.getProperty("env_try"));
    }

    @When("user enter username {string} and passcode {string}")
    public void user_enter_username_and_passcode(String username, String password) {

        loginPage.login(username,password);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        BrowserUtils.clickElement(loginPage.btn_login);
    }

    @Then("Verify the user should be at the dashboard page")
    public void Verify_the_user_should_be_at_the_dashboard_page() {
       BrowserUtils.verifyTitle("Dashboard");
    }
}
