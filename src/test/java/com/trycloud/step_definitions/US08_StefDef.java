package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_StefDef {

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        LoginPage.setUpURL();
        LoginPage.login(ConfigReader.getProperty("username2"), ConfigReader.getProperty("password2"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string)  {
        public void the_user_clicks_the_module(String string) {
            basePage.file.click();
        }

    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    }
}




