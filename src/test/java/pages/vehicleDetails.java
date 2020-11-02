package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class vehicleDetails {
    private WebDriver driver;
    @FindBy(css = "#main-content > div > section > ul > li:nth-child(3)")
    private WebElement help;
    @FindBy(xpath = "//*[@id='react-select-vehicle-0-year--value']/div[2]/input")
    private WebElement year;
    @FindBy(xpath = "//*[@id='react-select-vehicle-0-make--value']/div[2]/input")
    private WebElement make;
    @FindBy(xpath = "//*[@id='react-select-vehicle-0-model--value']//div[2]/input")
    private WebElement model;
    @FindBy(css = "#vehicle-0-ownLease-own")
    private WebElement own;
    private WebElement lease;
    @FindBy(css = "#vehicle-0-datePurchased")
    private WebElement purchaseDate;

    private WebElement condition;
    private WebElement winterTire;
    private WebElement CAA;
    private WebElement park;
    private WebElement vehicleUse;
    private WebElement commute;
    private WebElement travel;

//    Actions actions = new Actions(driver);
    public vehicleDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void selectyear() throws InterruptedException {
        this.year.click();
        Thread.sleep(5000);
        this.year.sendKeys("2020",Keys.ENTER);

    }
    public void helpClick(){
        this.help.click();
    }
    public void makeClick() throws InterruptedException {
        this.make.click();
        Thread.sleep(5000);
        this.make.sendKeys("HYUNDAI",Keys.ENTER);
    }
    public void modelClick() throws InterruptedException {
        this.model.click();
        Thread.sleep(5000);
        this.model.sendKeys("SONATA",Keys.ENTER);
    }
    public void ownClick() throws InterruptedException {
        this.own.click();
        Thread.sleep(5000);
    }
    public void purchaseDateClick() throws InterruptedException {
        this.purchaseDate.click();
        this.purchaseDate.sendKeys("052020",Keys.ENTER);
        Thread.sleep(5000);
    }
}
