package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkSendMsg_StepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    loginPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }
    @And("user search user from the search box")
    public void user_search_user_from_the_search_box() {

    }
    @And("user write a message")
    public void user_write_a_message() {

    }
    @And("user clicks to submit button")
    public void user_clicks_to_submit_button() {

    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {

    }
}
