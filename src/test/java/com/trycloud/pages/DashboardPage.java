package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.apache.commons.io.LineIterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage {

    public  DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "user")
    public static WebElement enterUsername;
    @FindBy(name = "password")
    public static WebElement enterPassword;
    @FindBy(id = "submit-form")
    public static WebElement loginButton;
    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public static WebElement dashboardButton;
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public static WebElement filesButton;
    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public static WebElement photosButton;
    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public static WebElement activityButton;
    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public static WebElement talkButton;
    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public static WebElement contactsButton;
    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public static WebElement circlesButton;
    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public static WebElement calendarButton;
    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public static WebElement deckButton;


    public static void login(String username, String password) {
        enterUsername.sendKeys(username);
        enterPassword.sendKeys(password);
        loginButton.click();
    }

}
