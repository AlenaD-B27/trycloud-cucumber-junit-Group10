package com.trycloud.step_definitions;

import com.trycloud.pages.Login_TalkPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginTalk_StepDefs {

    Login_TalkPage login_TalkPage = new Login_TalkPage();


    @Given("user on the dashboard page {string}")
    public void user_on_the_dashboard_page(String string){
        String url = ConfigReader.getProperty("env");

        Driver.getDriver().get(url);
    }

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        login_TalkPage.login(username, password);

    }

    @And("user clicks the login button")
    public void user_clicks_the_login_button() {
        login_TalkPage.loginButton.click();
    }

    @And("user clicks the {string} module")
    public void user_clicks_the_module(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }

    @And("user clicks {string} button")
    public void user_clicks_button(String string) {
        login_TalkPage.talkBtnPage.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        System.out.println(string);
       // Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Talk - Trycloud QA"))

           // String actualModule = login_TalkPage.talkTryCloudQA.getText();

           // Assert.assertEquals(expectedModule,actualModule);

    }
}