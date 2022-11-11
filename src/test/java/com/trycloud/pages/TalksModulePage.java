package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksModulePage {

    public TalksModulePage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement talkButton;


}
