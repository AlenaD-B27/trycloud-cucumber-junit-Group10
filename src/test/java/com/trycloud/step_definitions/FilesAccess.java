package com.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesAccess {

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {


        System.out.println("Given user on the dashboard page");
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        System.out.println("when the user clicks the module");

    }


    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String arg0) {
        System.out.println("Then the page it verified ");
    }
}
