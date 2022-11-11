package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksModulePage {

    public TalksModulePage() {PageFactory.initElements(Driver.getDriver(),this);}
    public WebElement talksButton;


    public void login(String username1, String password) {
    }
}
