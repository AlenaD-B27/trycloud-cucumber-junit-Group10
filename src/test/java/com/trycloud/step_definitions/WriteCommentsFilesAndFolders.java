package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WriteCommentsFilesAndFolders {

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("login"));
        new LoginPage().login();
    }

    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {


    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

    }

    @When("user choose the Details option")
    public void user_choose_the_details_option() {

    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

    }

}
