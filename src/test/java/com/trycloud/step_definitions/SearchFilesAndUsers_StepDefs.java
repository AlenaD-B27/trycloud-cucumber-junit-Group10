package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;
import java.util.List;


public class SearchFilesAndUsers_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SearchPage searchPage = new SearchPage();
String depo = "";

    @Given("<user> on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        new LoginPage().login();
    }
 @When("User can click the magnifying glass icon")
 public void user_can_click_the_magnifying_glass_icon() {
searchPage.searchIcon.click();
  BrowserUtils.waitFor(2);

 }


 @And("User can write {string} into the text box")
 public void userCanWriteIntoTheTextBox(String searchKey) {

     searchPage.searchBox.sendKeys(searchKey + Keys.ENTER);


     BrowserUtils.waitFor(2);
 }




 @Then("verify the app displays the {string} option")
 public void verifyTheAppDisplaysTheOption(String keyword) {


     Assert.assertTrue(" Element is  not displayed", BrowserUtils.getElementsText(searchPage.searchResults).contains(keyword));

 }



}

