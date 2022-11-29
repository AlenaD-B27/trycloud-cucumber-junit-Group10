package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void logout(){
        usersProfileDropdown.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(logout));
        logout.click();


        }
    // create a logout method



     @FindBy(css = "div[class='header-left']")
    public WebElement header;

    // --- MODULES:


     @FindBy(xpath = "(//ul/li[@data-id='dashboard'])[1]")
    public WebElement dashboardModule;

     @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
     public WebElement usersProfileDropdown;

     @FindBy(xpath = "(//ul/li[@data-id='files'])[1]")
    public WebElement filesModule;


     @FindBy(xpath = "(//ul/li[@data-id='photos'])[1]")
    public WebElement photosModule;


    @FindBy(xpath = "(//ul/li[@data-id='activity'])[1]")
    public WebElement activityModule;


    @FindBy(xpath = "(//ul/li[@data-id='spreed'])[1]")
    public WebElement talkModule;


     @FindBy(xpath = "(//ul/li[@data-id='contacts'])[1]")
    public WebElement contactsModule;


     @FindBy(xpath = "(//ul/li[@data-id='circles'])[1]")
    public WebElement circlesModule;


     @FindBy(xpath = "(//ul/li[@data-id='calendar'])[1]")
    public WebElement calendarModule;


     @FindBy(xpath = "(//ul/li[@data-id='deck'])[1]")
    public WebElement deckModule;

    // --- right side of the header buttons:

      @FindBy(xpath = "//div/div/a[@href='#']")
    public WebElement searchButton;


    @FindBy(xpath = "//div/div[@aria-label='Notifications']")//className class="notifications"
    public WebElement notificationsButton;


     @FindBy(id = "contactsmenu")
    public WebElement contactsButton;


    // --- users profile dropdown menu:

     @FindBy(xpath = "//ul/li/div/a[@href='#']")
    public WebElement setStatus;

    @FindBy(xpath = "//ul/li[@data-id='settings']")
    public WebElement settings;


    @FindBy(xpath = "//ul/li[@data-id='help']")
    public WebElement help;


    @FindBy(xpath = "//ul/li[@data-id='logout']")
    public WebElement logout;










}
