package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.trycloud.utilities.JavaUtils.*;

public class FilesPage extends BasePage {


    //table:

    @FindBy(xpath = "//table[@id='filestable']//tr[@data-type='file']")
    public List<WebElement> tableRows;


    public String clickActionGetFileURL(){

        String fileURL = "";
        WebElement actionLocator = null;

        for (int i = 0; i < tableRows.size()-1; i++) {


            if(!Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//div[contains(@class,'favorite-mark')])[" + (i+1) + "]")).getAttribute("class").contains("permanent")){

                fileURL = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//a[contains(@href,'.php')])[" + (i+1) + "]")).getAttribute("href");

                actionLocator = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//span[@class='fileactions']//a[@data-action='menu'])[" + (i+1) + "]"));

                break;

            }
        }

        if(fileURL.isBlank()) {
            System.out.println("No files downloaded to the page");
        } else {
            System.out.println("LINK: " + fileURL);
            actionLocator.click();
        }
        return fileURL;
    }



    @FindBy(css = "div#recommendations")
    public WebElement recommendedFiles;


    //actionOptions:

    public void chooseActionOption(String option){
        Driver.getDriver().findElement(By.xpath("//ul//li[@class=' action-favorite-container']//span[.='" + option + "']")).click();
    }











    public void clickSubModule(String submodule){
        Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//li//a[.='" + normalizeCase(submodule) + "']"));
    }



}
