package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RemoveFromFavPage {

    public RemoveFromFavPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "app-icon")
    public WebElement filesButton;

    @FindBy(xpath = "//*[.='Actions']")
    public List<WebElement> actionsButtons;

    @FindBy(xpath = "//*[.='Remove from favorites']")
    public List<WebElement> removeFavorButton;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesButton;





}
