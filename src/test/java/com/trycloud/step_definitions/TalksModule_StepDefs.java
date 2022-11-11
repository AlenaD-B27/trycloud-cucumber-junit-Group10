package com.trycloud.step_definitions;


import com.trycloud.pages.TalksModulePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class TalksModule_StepDefs {
    TalksModulePage talksModulePage = new TalksModulePage();
    private WebElement talkButton;

    @Given("User on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/");
    }

    @When("The user clicks the \"Talk\" module")
    public void the_user_clicks_the_talk_module() {talkButton.click();}

    @Then("Verify the page title is \"Talk - Trycloud QA\"")
    public void user_should_see_page_title() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Trycloud QA"));


    }

}
