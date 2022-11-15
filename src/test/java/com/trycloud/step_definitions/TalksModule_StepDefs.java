package com.trycloud.step_definitions;


import com.trycloud.pages.TalksModulePage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class TalksModule_StepDefs extends TalksModulePage {
    TalksModulePage talksModulePage = new TalksModulePage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Trycloud QA"));


    }

}

