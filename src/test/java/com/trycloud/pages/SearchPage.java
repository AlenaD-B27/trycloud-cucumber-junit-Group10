package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class = 'header-menu unified-search']")
    public WebElement searchIcon;


    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;



    @FindBy (xpath = "//h3[@class = 'unified-search__result-line-one']")
    public List<WebElement> searchResults;



  /*  public String listOfWebElementsToListOfString(String verify ) {
        String set = "";
        for(int i = 0; i<searchResults.size()-1; i++){
            BrowserUtils.hover(searchResults.get(i));
            BrowserUtils.waitFor(1);
            if (verify.equals(searchResults.get(i).getText())){
                set = searchResults.get(i).getText();
                Assert.assertTrue(searchResults.get(i).isDisplayed());
            }else {//h3[@class = 'unified-search__result-line-one']
                System.out.println("File is not found");
            }



        }
        System.out.println(set);
        return set;

   */

    }








