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
import org.openqa.selenium.WebElement;

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
//        loginPage.userNameBox.sendKeys(userName);
//        loginPage.passwordBox.sendKeys(password);
//        loginPage.loginButton.click();

    }



    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        removeFromFavPage.filesButton.click();
    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        BrowserUtils.waitFor(3);
        file = filesPage.clickGetFileURL();

    }

//    @And("user choose the Remove from favorites option")
//    public void userChooseTheRemoveFromFavoritesOption() {
//        BrowserUtils.waitFor(3);
//        removeFromFavPage.removeFavorButton.click();
//
//    }

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

}









