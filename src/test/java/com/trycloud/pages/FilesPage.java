package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;
public class FilesPage extends BasePage {
    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy (xpath = "//ul[@id='appmenu']/li[2]']")// do i need this?
//    public WebElement UserOnDashboard;

    @FindBy (xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement filesButton;
    @FindBy (xpath = "//span[text()='Files']")
    public WebElement FilesIcon;



    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement addIconButton;

    @FindBy (xpath = "//label[@data-action='upload']")
    public WebElement uploadButton;



    @FindBy (xpath = "//input[@type ='file']")  // id="uploadprogressbar"
    public WebElement inputButton;

    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']")
    public List<WebElement> listOfFiles;

    public void listOfFiles(){
        List<String> list = new ArrayList<>();
        for(int i = 1; i < listOfFiles.size(); i++){
            list.add(listOfFiles.get(i).getText());
            System.out.println(listOfFiles.get(i).getText());
        }
        Assert.assertTrue(list.contains("ElenaB"));
    }

    @FindBy (xpath = "//span[.='New folder']")
    public WebElement newFolder;

    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;

    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement submitFolderName;

    @FindBy (xpath = "//a[@class='filename']")
    public WebElement newCreated;

    @FindBy (xpath = "//div[@style='background-image:url(/index.php/apps/theming/img/core/filetypes/folder.svg?v=0);']")
    public List<WebElement> folderType;


    @FindBy (xpath = "//tr[@data-type='dir']//label")
    public List<WebElement> folderCheckBox;

    @FindBy (xpath = "//span[@class='innernametext']")
    public List<WebElement> fileNameVerify;

    @FindBy (xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> fileType;


    public void selectFolder(){
        for(int i = 0; i < folderType.size(); i++){
            if (folderType.get(i).isDisplayed()){
                folderCheckBox.get(i).click();
            }
        }
    }

    public void verifyFileName(List<WebElement> listOfElements, String expected){
        String actual = "";
        for (WebElement each : listOfElements){
            if(each.getText().equalsIgnoreCase(expected)){
                actual += "" + each.getText();
                break;
            }
        }
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

    public void chooseFolder(){
        List<WebElement> list2 = new ArrayList<>();
        for (int i = 1; i < fileType.size(); i++) {
            BrowserUtils.hover(fileType.get(i));
            if (fileType.get(i).getAttribute("data-type").equalsIgnoreCase("dir")) {
                list2.add(fileType.get(i));
            }
        }
        list2.get(1).click();
    }

    public void clickFolder(){
        for (WebElement each: fileType){
            BrowserUtils.hover(each);
            if(each.getAttribute("data-type").equalsIgnoreCase("dir")){
                each.click();
                break;
            }
        }
    }
    public void clickNewFolder(String newFolderName){
        new FilesPage().addIconButton.click();
        newFolder.click();
        inputFolderName.sendKeys(newFolderName);
        submitFolderName.click();
        BrowserUtils.waitFor(1);

        for(WebElement each: fileNameVerify){
            BrowserUtils.hover(each);
            if(each.getText().equalsIgnoreCase(newFolderName)){
                each.click();
                break;
            }
        }
    }

}
