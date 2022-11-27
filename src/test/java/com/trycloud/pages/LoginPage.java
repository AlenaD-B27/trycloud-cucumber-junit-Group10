package com.trycloud.pages;

import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="user")
    public WebElement enterUsername;
    @FindBy(name="password")
    public WebElement enterPassword;
    @FindBy(id="submit-form")
    public WebElement loginButton;

    public void login(String username,String password){
        enterUsername.sendKeys(username);
        enterPassword.sendKeys(password);
        //  loginButton.click();
    }

}
