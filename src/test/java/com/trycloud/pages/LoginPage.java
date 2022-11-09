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



    @FindBy(css = "input#user")
    public WebElement inputUserBox;

    @FindBy(css = "input#password")
    public WebElement inputPasswordBox;

    @FindBy(css = "input#submit-form")
    public WebElement submitButton;


    public void login(String username){
        inputUserBox.sendKeys(username);
        inputPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        submitButton.click();
    }








}
