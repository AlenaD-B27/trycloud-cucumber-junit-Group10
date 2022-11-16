package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewContactPage {
    public ViewContactPage (){
        PageFactory.initElements(Driver.getDriver(), this);

         }

    @FindBy(xpath = "(//ul/li[@data-id='contacts'])[1]")
    public WebElement contactsModuleButton;

    @FindBy (id = "NWJhNDUxY2YtNjdjZi00MjQ3LWE1MGUtNGU4OTk1Nzc0NGYxfmNvbnRhY3")
    public  WebElement contactNameFirst;


    @FindBy (className = "vue-recycle-scroller__item-wrapper")
    public WebElement contactCounter;

    public void verifyContact(){
        for (int i = 1; i <= 2; i++) {
            WebElement set = Driver.getDriver().findElement(By.xpath("(//div[@class='app-content-list-item-line-one'])[" + i + "]"));
            if (set.isDisplayed()) {
                Assert.assertTrue(set.isDisplayed());
            }
            System.out.println(set.getText());
        }
    }

}
