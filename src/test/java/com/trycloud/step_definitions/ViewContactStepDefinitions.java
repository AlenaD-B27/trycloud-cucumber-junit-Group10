package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.ViewContactPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewContactStepDefinitions {

    LoginPage loginPage = new LoginPage();
   ViewContactPage viewContactPage = new ViewContactPage();

    @Given("{string} on the dashboard page")
    public void onTheDashboardPage(String user) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.inputUsername.sendKeys(user);
        loginPage.inputPassword.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        System.out.println(user);
    }

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        viewContactPage.contactsModuleButton.click();

    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

        viewContactPage.verifyContact();



    }



}
