package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewContactStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("{string} on the dashboard page")
    public void onTheDashboardPage(String user) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.inputUsername.sendKeys(user);
        loginPage.inputPassword.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {

    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

    }



}
