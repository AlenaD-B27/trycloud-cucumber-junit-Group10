package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import junit.framework.TestCase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkSendMsgPage extends BasePage{

    @FindBy(xpath = "//*[@id='appmenu']/li[5]/a")
    public WebElement talkButton;

    @FindBy (css = "input[type='text']")
    public WebElement searchBox1;

    @FindBy (xpath = "(//span[normalize-space (.)= 'User16'])[1]")
    public WebElement user16;

    @FindBy (xpath = "//div[@placeholder = 'Write message, @ to mention someone …']")
    public WebElement sendMsgBox;


    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitMsg;

    @FindBy (xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> msgArea;

    @FindBy (xpath = "//input[@placeholder = 'Search conversations or users']")
    public WebElement searchBox;

    private TestCase Assert;

    public void verifyMsg(String expectedMsg){
        String str2 = "";
        for (WebElement each: msgArea){
            if(each.getText().equals(expectedMsg)){
                str2 = each.getText();
                break;
            }
        }
        Assert.assertEquals(expectedMsg,str2);
    }
}
