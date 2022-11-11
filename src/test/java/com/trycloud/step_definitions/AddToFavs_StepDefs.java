package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddToFavs_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    String searchFile = "";


    @Given("{string} on the dashboard page")
    public void on_the_dashboard_page(String user) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login(user);
        System.out.println(user);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
        dashboardPage.clickModule(module);
    }


    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        BrowserUtils.waitForVisibility(filesPage.recommendedFiles, 10);
        searchFile = filesPage.clickActionGetFileURL();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String option) {
        //filesPage.chooseActionOption(option);
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String submodule) {
        //filesPage.clickSubModule(submodule);
    }
    @Then("Verify the {string} is listed on the table")
    public void verify_the_is_listed_on_the_table(String searchFile) {

    }




}
