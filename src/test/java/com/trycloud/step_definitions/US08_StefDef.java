package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeletePage;
import com.trycloud.pages.TryCloudLoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US08_StefDef extends BasePage
{
    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();

    DeletePage deletePage = new DeletePage();
    String expect = "";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        tryCloudLoginPage.setUpURL();
        tryCloudLoginPage.login(ConfigReader.getProperty("username2"), ConfigReader.getProperty("password"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string)  {

            DeletePage.filesTab.click();
            BrowserUtils.sleep(3);
            expect = deletePage.allRowOfTheTable.get(1).getAttribute("data-file");BrowserUtils.waitFor(2);
        }


    @When("user click action-icon  from any file on the page")
   public void user_click_action_icon_from_any_file_on_the_page() {
        deletePage.iconTab.click();
       // Actions actions = new Actions(Driver.getDriver());
     //  actions.contextClick(DeletePage.iconTab).build().perform();BrowserUtils.waitFor(2);
      BrowserUtils.sleep(5);
  }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        deletePage.deleteFile.click();
        BrowserUtils.sleep(4);
    }


    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
        DeletePage.DeletedModule.click();
        BrowserUtils.sleep(4);
    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

        String actual = "";


        for (WebElement each : deletePage.allRowOfTheTable){
            if (each.getAttribute("data-path").contains(expect)) {
                actual = each.getAttribute("data-path");
                break;
            }
        }
        System.out.println(expect + " "+ actual);

        Assert.assertEquals( expect,actual);


    }

    }





