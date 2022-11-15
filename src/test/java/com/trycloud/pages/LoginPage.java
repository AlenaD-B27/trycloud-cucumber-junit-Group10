package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(id = "inputUsername")
    public WebElement Username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//*")
    public WebElement talkModuleTitle;

    // No page elements added

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

// don't forget to add not just elements here
    // but also the login method







