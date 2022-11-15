package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.RemoveFromFavPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class RemoveFromFavoriteStepDef extends BrowserUtils {

    LoginPage loginPage = new LoginPage();
    RemoveFromFavPage removeFromFavPage = new RemoveFromFavPage();


    @Given("user already on the page he or she inputs  {string} and {string} on the page")
    public void userAlreadyOnThePageHeOrSheInputsAndOnThePage(String userName, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));

        loginPage.userNameBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginButton.click();

    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String files) {
        removeFromFavPage.filesButton.click();

    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        BrowserUtils.sleep(4);
        //removeFromFavPage.actionsButtons.click();
        //removeFromFavPage.addToFavorites.click();


    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String removeFromFavorites) {


    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String favoriteSubModule) {



        
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
    }



    }



