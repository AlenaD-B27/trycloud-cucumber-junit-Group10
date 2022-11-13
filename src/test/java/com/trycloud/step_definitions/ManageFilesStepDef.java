package com.trycloud.step_definitions;


import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.github.javafaker.Faker;


public class ManageFilesStepDef  {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    FilesPage FilesPage = new FilesPage();



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

      // String Files = FilesPage.FilesIcon.getText();
        FilesPage.FilesIcon.click();



        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

        FilesPage.addIconButton.click();
        BrowserUtils.waitFor(1);
        throw new io.cucumber.java.PendingException();
    }

    @When("user click \"new folder”")
    public void user_click_new_folder() {

        BrowserUtils.waitFor(1);
        FilesPage.newFolder.click();
        BrowserUtils.waitFor(1);
        throw new io.cucumber.java.PendingException();
    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        FilesPage.inputFolderName.sendKeys("ElenaB");
        BrowserUtils.waitFor(1);
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        FilesPage.submitFolderName.click();
        BrowserUtils.waitFor(3);
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(FilesPage.newCreated.getText().contains("ElenaB"));
        System.out.println(FilesPage.newCreated.getText());
        throw new io.cucumber.java.PendingException();
    }

}
