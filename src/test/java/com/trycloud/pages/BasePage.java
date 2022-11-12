package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.trycloud.utilities.BrowserUtils.*;
import static com.trycloud.utilities.JavaUtils.*;

public abstract class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // --- MAIN (top of the page) MODULES:

    public void clickModule(String module){
        WebElement actualModule = Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//span[normalize-space(.)='" + normalizeCase(module) + "']/.."));
        waitForClickability(actualModule, 10);
        actualModule.click();
    }


}
