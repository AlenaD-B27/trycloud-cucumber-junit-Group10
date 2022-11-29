package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        dashboardPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));

    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {
        DashboardPage.dashboardButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
        DashboardPage.filesButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("files"));
        DashboardPage.photosButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("photos"));
        DashboardPage.activityButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("activity"));
        DashboardPage.talkButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("spreed"));
        DashboardPage.contactsButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contacts"));
        DashboardPage.circlesButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("circles"));
        DashboardPage.calendarButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("calendar"));
        DashboardPage.deckButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("deck"));

    }
}
