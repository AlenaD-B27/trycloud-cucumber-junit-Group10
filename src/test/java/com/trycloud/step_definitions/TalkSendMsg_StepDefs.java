package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.Login_TalkPage;
import com.trycloud.pages.TalkSendMsgPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TalkSendMsg_StepDefs {
    Login_TalkPage login_TalkPage = new Login_TalkPage();
    TalkSendMsgPage searchBox1 = new TalkSendMsgPage();
    Faker faker = new Faker();
    private String str = faker.buffy().quotes();




//    @FindBy(id = "user")
//    public WebElement usernameBox;
//
//    @FindBy(id = "password")
//    public WebElement passwordBox;
//
//    @FindBy(id = "submit-form")
//    public WebElement loginButton;
//
//    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]")
//    public WebElement talkBtnPage;
//
//    @FindBy(xpath = "/html/head/title")
//    public WebElement talkTryCloudQA;


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page(String string){
        String url = ConfigReader.getProperty("env");

        Driver.getDriver().get(url);
    }
//    @When("the user clicks the {string} module")
//    public void the_user_clicks_the_module(String string) {
//        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
//    }
    @Given("{string} on the dashboard page")
    public void on_the_dashboard_page(String user) {
    Driver.getDriver().get(ConfigReader.getProperty("env"));
    login_TalkPage.login(user,ConfigReader.getProperty("password"));
}
    @When("the user clicks the Talk module")
    public void the_user_clicks_the_talk_module() {
        login_TalkPage.talkBtnPage.click();
    }
    @And("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        BrowserUtils.waitFor(3);
        searchBox1.searchBox.sendKeys("user16");
        BrowserUtils.waitFor(1);
        searchBox1.user16.click();
        BrowserUtils.waitFor(1);
    }
    @And("user write a message")
    public void user_write_a_message() {
        searchBox1.sendMsgBox.sendKeys(str);
        BrowserUtils.waitFor(1);
    }

    @And("user clicks to submit button")
    public void user_clicks_to_submit_button() {
            searchBox1.submitMsg.click();
            BrowserUtils.waitFor(5);
    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {
        searchBox1.verifyMsg(str);
    }
}
