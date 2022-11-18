package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidStepDefinitions {
    LoginPage loginPage = new LoginPage();
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        loginPage.goToLoginPage();
    }
    @When("user enter username {string} and passcode {string}")
    public void user_enter_username_and_passcode(String username, String password) {
        loginPage.login(username,password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("Verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        BrowserUtils.verifyTitleContains("Dashboard");
    }


    }

