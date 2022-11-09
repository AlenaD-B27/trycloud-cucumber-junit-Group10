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

    @FindBy(id="user")
    public WebElement inputUsername;

    @FindBy(id="password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement loginButton;

   public void login1(String userName, String password){
        inputUsername.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement message;

    public void login (String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
    }
    public void login (){
        inputUsername.sendKeys(ConfigReader.getProperty("username3"));
        inputPassword.sendKeys(ConfigReader.getProperty("password"));
    }
    public void goToLoginPage(){
        Driver.getDriver().get(ConfigReader.getProperty("login"));
    }


}
