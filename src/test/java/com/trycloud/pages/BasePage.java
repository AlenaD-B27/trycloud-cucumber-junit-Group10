
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//ul[@id='appmenu']//li//a")
    public List<WebElement> modules;


    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='dashboard']//a")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='files']//a")
    public WebElement file;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='photos']//a")
    public WebElement photos;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='activity']//a")
    public WebElement activity;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='spreed']//a")
    public WebElement talk;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='mail']//a")
    public WebElement mail;

    @FindBy(xpath = "//a[@aria-label='More apps']")
    public WebElement moreApps;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='contacts']//a")
    public WebElement contacts;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='circles']//a")
    public WebElement circles;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='calendar']//a")
    public WebElement calendar;

    @FindBy(xpath = "//*[@id='appmenu']//li[@data-id='deck']//a")
    public WebElement deck;

}
