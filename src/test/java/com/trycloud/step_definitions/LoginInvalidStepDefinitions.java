package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginInvalidStepDefinitions {
    LoginPage loginPage = new LoginPage();
    @When("user enter invalid {string} username and {string} password")
    public void user_enter_invalid_username_and_password(String username, String password) {
        loginPage.goToLoginPage();
        loginPage.login(username,password);
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String warningMessage) {
       Assert.assertEquals("Actual message is not as expected", warningMessage, loginPage.message.getText());
    }
}
