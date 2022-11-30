package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletePage{

    public DeletePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public static WebElement filesTab;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public static WebElement iconTab;

    @FindBy  (xpath = "//a[@data-action='Delete']")  //(xpath = "//a[.='Deleted files']")
    public WebElement deleteFile;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public static WebElement DeletedModule;


    @FindBy (xpath = "//span[@class='innernametext']")
    public static List<WebElement> filesNameInDeletedPage;


    @FindBy(xpath ="//table[@id='filestable']//tbody//tr" )
    public List<WebElement> allRowOfTheTable;


}
