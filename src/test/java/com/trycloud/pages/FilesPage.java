package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement fileButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[4]/a/span[2]")
    public WebElement detailButton;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/span")
    public WebElement commentsButton;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/div[1]/form/div[1]")
    public WebElement inputComment;

    @FindBy(xpath = "//*[@id=\"commentsTabView\"]/div[1]/form/input")
    public WebElement sendButton;


    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement lastComment;
}
