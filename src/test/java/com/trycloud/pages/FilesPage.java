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

    //table[@id='filestable']//tr[@data-type='file']//div[@class='favorite-mark permanent']   //(star) if displayed - already in favs

    public String clickActionGetFileURL(){

        String fileURL = "";
        WebElement actionLocator;

        for (int i = 0; i < tableRows.size()-1; i++) {


            if(Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//div[contains(@class,'favorite-mark')])[" + (i+1) + "]")).getText().equals("Favorited")){

                fileURL = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//a[contains(@href,'/index.php/apps/files')])[" + (i+1) + "]")).getAttribute("href");

                actionLocator = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//span[@class='fileactions']//a[@data-action='menu'])[" + (i+1) + "]"));

                actionLocator.click();
                break;

            }
        }



        return fileURL;


    }





    //actionOptions:

    public void chooseActionOption(String option){
        Driver.getDriver().findElement(By.xpath("//span[.='" + normalizeCase(option) + "']\"")).click();
    }











    public void clickSubModule(String submodule){
        Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//li//a[.='" + normalizeCase(submodule) + "']"));
    }



}
