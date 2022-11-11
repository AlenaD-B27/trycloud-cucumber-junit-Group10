package com.trycloud.step_definitions;


import com.trycloud.pages.TalksModulePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class TalksModule_StepDefs extends TalksModulePage {
    TalksModulePage talksModulePage = new TalksModulePage();
    private WebElement talkButton;

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username1, String password) {

        talksModulePage.login(username1,password);

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {talksButton.click();}

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Trycloud QA"));


    }

}
