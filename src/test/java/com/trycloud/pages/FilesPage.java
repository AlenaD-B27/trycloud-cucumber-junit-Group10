package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static com.trycloud.utilities.JavaUtils.*;

public class FilesPage {

    @FindBy(xpath = "//span[.='Actions']")
    public WebElement anyActionsIcon;

    //actionOptions:

    public void chooseActionOption(String option){
        Driver.getDriver().findElement(By.xpath("//span[.='" + normalizeCase(option) + "']\"")).click();
    }

    @FindBy(xpath = "(//table//span[@class='nametext'])[1]")
    public WebElement firstFileInTable;

    @FindBy(xpath = "//table[@id='filestable']//a[contains(@href,'/index.php/apps/files?dir')]")
    public List<WebElement> fileNames;

    @FindBy(xpath = "")
    public List<WebElement> fileStars;








    public void clickSubModule(String submodule){
        Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//li//a[.='" + normalizeCase(submodule) + "']"));
    }



}
