package com.trycloud.step_definitions;


import com.github.javafaker.Faker;
import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ManageFilesStepDef  {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();

Faker faker = new Faker();
String searchName = faker.name().firstName();

    @Given("user on the dashboard page")
 public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login();
        filesPage.filesButton.click();
    }


    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule(){filesPage.filesButton.click();
        BrowserUtils.waitFor(1);

      // String Files = FilesPage.FilesIcon.getText();
      // filesPage.FilesIcon.click();
        //BrowserUtils.waitFor(1);

    }


    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        filesPage.addIconButton.click();
        BrowserUtils.waitFor(1);

    }

    @When("user click new folder")
    public void user_click_new_folder() {
        BrowserUtils.waitFor(1);
        filesPage.newFolder.click();
        BrowserUtils.waitFor(1);

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
       filesPage.inputFolderName.sendKeys(searchName);
        BrowserUtils.waitFor(1);

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitFolderName.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(filesPage.newCreated.getText().contains(searchName));
        System.out.println(filesPage.newCreated.getText());

    }

}
