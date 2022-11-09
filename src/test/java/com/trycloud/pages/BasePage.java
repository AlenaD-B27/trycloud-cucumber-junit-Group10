package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // create a logout method


     @FindBy()
    public WebElement header;

    // --- MODULES:

    public void clickModule(String module){
        module = module.substring(0,1).toUpperCase() + module.substring(1).toLowerCase();
        Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//span[normalize-space(.)='" + module + "']"));
    }

    // TODO: SHOW THE TEAM THAT WE CAN DO IT WITHOUT THIS LOCATORS

     @FindBy()
    public WebElement dashboardModule;

     @FindBy(xpath = "//ul[@id='appmenu']//span[normalize-space(.)='Files']")
    public WebElement filesModule;

     @FindBy()
    public WebElement photosModule;

     @FindBy()
    public WebElement activityModule;

     @FindBy()
    public WebElement talkModule;

     @FindBy()
    public WebElement contactsModule;

     @FindBy()
    public WebElement circlesModule;

     @FindBy()
    public WebElement calendarModule;

     @FindBy()
    public WebElement deckModule;

     // --- right side of the header buttons:

     @FindBy()
    public WebElement searchButton;

     @FindBy()
    public WebElement notificationsButton;

     @FindBy()
    public WebElement contactsButton;

     @FindBy()
    public WebElement usersProfileDropdown;

    // --- users profile dropdown menu:

     @FindBy
    public WebElement setStatus;

     @FindBy()
    public WebElement settings;

     @FindBy()
    public WebElement help;

     @FindBy()
    public WebElement logout;




}
