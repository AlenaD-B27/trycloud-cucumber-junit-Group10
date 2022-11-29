package com.trycloud.pages;

import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_TalkPage {

    public Login_TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@id='appmenu']/li/a)[5]")
    public WebElement talkBtnPage;

    @FindBy(xpath = "/html/head/title")
    public WebElement talkTryCloudQA;




    public void login(){
        usernameBox.sendKeys(ConfigReader.getProperty("username"));
        passwordBox.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
        talkBtnPage.click();

    }

    public void login(String username,String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }


}
