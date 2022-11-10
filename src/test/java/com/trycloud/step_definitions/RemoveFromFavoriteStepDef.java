package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.RemoveFromFavPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RemoveFromFavoriteStepDef{

    LoginPage loginPage = new LoginPage();
    RemoveFromFavPage removeFromFavPage = new RemoveFromFavPage();



    @Given("user already on the page he or she inputs  {string} and {string} on the page")
    public void userAlreadyOnThePageHeOrSheInputsAndOnThePage(String userName, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.userNameBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginButton.click();

    }

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        removeFromFavPage.filesButton.click();


    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {


    }
}

