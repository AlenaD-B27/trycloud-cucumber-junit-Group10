package com.trycloud.step_definitions;

import com.trycloud.pages.Pages;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginValidStepDefinitionsExample {
    Pages pages = new Pages();
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        pages.loginPage().goToLoginPage();
    }
    @When("user enter username {string} and passcode {string}")
    public void user_enter_username_and_passcode(String username, String password) {
        pages.loginPage().login(username,password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        pages.loginPage().loginButton.click();
    }
    @Then("Verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        BrowserUtils.verifyTitleContains("Dashboard");
    }

    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("login"));
        pages.loginPage().login(username,password);

    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String message) {

        Assert.assertEquals("Actual message is not as expected",message,pages.loginPage().message.getText());
    }
}

