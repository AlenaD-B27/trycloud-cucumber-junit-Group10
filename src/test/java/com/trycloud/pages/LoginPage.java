package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "user")
    public WebElement inputUsername;

    @FindBy (name = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    public void login(String userName, String passWord){
        inputUsername.sendKeys(userName);
        inputPassword.sendKeys(passWord);


    }

    public void login() {
        login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        BrowserUtils.clickElement(loginButton);
    }
}
