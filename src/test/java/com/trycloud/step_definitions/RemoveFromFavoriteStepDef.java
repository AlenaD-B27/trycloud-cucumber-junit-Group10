package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.RemoveFromFavPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RemoveFromFavoriteStepDef{

    LoginPage loginPage = new LoginPage();
    RemoveFromFavPage removeFromFavPage = new RemoveFromFavPage();
    FilesPage filesPage = new FilesPage();


    //  Scenario 1
    String file = " ";

    @Given("user already on the page he or she inputs  {string} and {string} on the page")
    public void userAlreadyOnThePageHeOrSheInputsAndOnThePage(String userName, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
            loginPage.login(userName,password);

    }@When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        removeFromFavPage.filesButton.click();
    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        BrowserUtils.waitFor(3);
        file = filesPage.clickGetFileURL();
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String removeOption) {
        filesPage.chooseActionOption(removeOption);
    }
    @And("user click the {string} sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide(String favoriteButton) {
        BrowserUtils.waitFor(3);
        filesPage.clickSubModule(favoriteButton);
    }


    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
    String actualLink = Driver.getDriver().getCurrentUrl();
    for (WebElement eachDoc : filesPage.filesInTable) {
        if(eachDoc.getAttribute("href").equals(file)){
            actualLink = eachDoc.getAttribute("href");
        }

    }

    Assert.assertFalse(actualLink,false);

    }

  //  Scenario 2

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        BrowserUtils.waitFor(1);
        filesPage.addIcon.click();
    }

    @And("users uploads file with the upload file option")
    public void usersUploadsFileWithTheOption() {
        BrowserUtils.waitFor(2);
        filesPage.uploadButton.click();
        BrowserUtils.waitFor(2);
        filesPage.hiddenUploadBar.sendKeys("/Users/olhasoroka/Desktop/Cydeo/Sellenium/ClassNotes.txt");
        BrowserUtils.waitFor(2);

    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        WebElement fileName = Driver.getDriver().findElement(By.xpath("//a[@class='name']//span[.='ClassNotes']"));
        BrowserUtils.waitFor(2);
        Assert.assertTrue(fileName.isDisplayed());


    }
}










