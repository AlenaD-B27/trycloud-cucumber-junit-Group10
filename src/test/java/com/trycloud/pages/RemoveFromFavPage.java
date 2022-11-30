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

    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement filesButton;


    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement actionButton;


    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[3]")
    public WebElement removeFavorButton;


    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesButton;






}
