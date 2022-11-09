package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddToFavs_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    String dummyFile = "";

    @Given("{string} on the dashboard page")
    public void on_the_dashboard_page(String user) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        loginPage.login(user);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
        dashboardPage.clickModule(module);
    }


    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        filesPage.anyActionsIcon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String option) {
        filesPage.chooseOption(option);
        dummyFile = Driver.getDriver().findElement(By.xpath("(//table//span[@class='nametext'])[1]")).getText();
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the {string} is listed on the table")
    public void verify_the_is_listed_on_the_table(String string) {

    }




}
