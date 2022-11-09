package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage {

    @FindBy(xpath = "//span[.='Actions']")
    public WebElement anyActionsIcon;

    //actionOptions:

    public void chooseOption(String option){
        option = option.substring(0,1).toUpperCase() + option.substring(1).toLowerCase();
        Driver.getDriver().findElement(By.xpath("//span[.='" + option + "']\""));
    }



}
