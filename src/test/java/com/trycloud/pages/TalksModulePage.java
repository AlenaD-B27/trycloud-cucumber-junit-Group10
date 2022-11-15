package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksModulePage {
    public TalksModulePage(WebElement inputUsername, WebElement inputPassword, WebElement loginButton) {
        this.inputUsername = inputUsername;
        this.inputPassword = inputPassword;
        this.loginButton = loginButton;
    }

    public TalksModulePage() {PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(name="Username")
    public WebElement inputUsername;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement loginButton;


    /**
     * This method will accept username and password and login to app
     * @param username
     * @param password
     */
    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }


}