package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksModulePage extends BasePage{
    @FindBy(id = "talkModuleTitle")
    public WebElement talkModuleTitle;

    public TalksModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}