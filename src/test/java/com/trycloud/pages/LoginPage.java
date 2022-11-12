package com.trycloud.pages;

import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement txt_username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement txt_password;


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement btn_login;


    public void login(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
    }


    public void login() {
        login(ConfigReader.getProperty("username1"), ConfigReader.getProperty("password"));
        btn_login.click();
    }

// don't forget to add not just elements here
    // but also the login method








}
