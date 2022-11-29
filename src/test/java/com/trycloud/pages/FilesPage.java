
package com.trycloud.pages;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static com.trycloud.utilities.TryCloudJavaUtils.normalizeCase;


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







    @FindBy(xpath = "//table[@id='filestable']//tr[@data-type='file']")
    public List<WebElement> tableOnThePage;

    @FindBy(xpath = "//table[@id='filestable']//tr[@data-type='file']//a[contains(@href,'.php')]")
    public List<WebElement> filesInTable;

    @FindBy(css = "div#recommendations")
    public WebElement recommendedSelectAsFav;


    public void clickSubModule(String favoriteButton){
        Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//li//a[.='" + normalizeCase(favoriteButton) + "']"));
    }

    public String clickGetFileURL() {

        String uRLFile = "";
        WebElement actionButton = null;

        BrowserUtils.waitFor(3);

        for (int i = 0; i <= tableOnThePage.size() - 1; i++) {


            if (Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//div[contains(@class,'favorite-mark')])[" + (i + 1) + "]")).getAttribute("class").contains("permanent")) {

                uRLFile = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//a[contains(@href,'.php')])[" + (i + 1) + "]")).getAttribute("href");

                actionButton = Driver.getDriver().findElement(By.xpath("(//table[@id='filestable']//tr[@data-type='file']//span[@class='fileactions']//a[@data-action='menu'])[" + (i + 1) + "]"));

                break;

            }
        }

        if (uRLFile.isBlank()) { // it means isEmpty()
            System.out.println("Favorite files are not selected");

        } else {
            System.out.println("LINK: " + uRLFile);
            actionButton.click();
        }
        return uRLFile;

    }

    //actionOptions dropdown menu when you click on "actions" icon (...)

    public void chooseActionOption(String option) {
        Driver.getDriver().findElement(By.xpath("//ul//li[@class=' action-favorite-container']//span[.='" + option + "']")).click();

    }



}
