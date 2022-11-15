package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalksModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    TalksModulePage talksModulePage = new TalksModulePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page()
    {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("I login as a User10")
    public void i_login_as_a_user10() {
        loginPage.Username.sendKeys(ConfigReader.getProperty("user10"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.talkModuleTitle.click();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expectedURL ="dashboard";

        wait.until(ExpectedConditions.urlContains(expectedURL));

        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL",actualURL.contains(expectedURL));

    }

    @When("I login as a User40")
    public void i_login_as_a_student() {
        loginPage.Username.sendKeys(ConfigReader.getProperty("user40"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.talkModuleTitle.click();
    }

    @When("I enter username {string}")
    public void i_enter_username(String username)
    {loginPage.Username.sendKeys(username);}
    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.password.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.talkModuleTitle.click();
    }

//    @When("there should be {string} users")
//    public void there_should_be_users(String expectedUserCount) {
//
//      BrowserUtils.waitForVisibility(landingPage.userCount,10);
//      String actualUserCount = landingPage.userCount.getText();
//      Assert.assertEquals("User count is failing!",expectedUserCount,actualUserCount);
//
//    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String username, String password) {
        loginPage.Username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.talkModuleTitle.click();
    }

}
