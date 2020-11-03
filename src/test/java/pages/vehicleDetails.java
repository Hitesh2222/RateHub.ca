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
    @FindBy(css = "#vehicle-0-vehicleCondition-used")
    private WebElement condition;
    @FindBy(css = "#vehicle-0-winterTires-yes")
    private WebElement winterTire;
    @FindBy(css = "#vehicle-0-roadsideAssistance-no")
    private WebElement CAA;
    @FindBy(css = "#react-select-vehicle-0-parkedOvernight--value-item")
    private WebElement park;
    @FindBy(css = "#vehicle-0-vehiclePurpose-P")
    private WebElement vehicleUse;
    @FindBy(css = "#vehicle-0-dailyKM")
    private WebElement commute;
    @FindBy(css = "#vehicle-0-yearlyKM")
    private WebElement travel;
    @FindBy(css = "#main-content div form button svg g")
    private WebElement plusButon;
    @FindBy(css = "#main-content div form button:nth-child(1) > svg")
    private WebElement back;
    @FindBy(css = "Button-sc-1ap9v74-0 gkGXCP AlternateButton-sc-15g4v46-0 dCTDKy")
    private WebElement saveExit;
    @FindBy(css = "Button-sc-1ap9v74-0 gkGXCP PrimaryButton-sc-19uohmy-0 jhoCga")
    private WebElement continues;
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
    public void conditionClick() throws InterruptedException {
        this.condition.click();
        Thread.sleep(5000);
    }
    public void plusButtonClick() throws InterruptedException {
        this.plusButon.click();
        Thread.sleep(5000);
    }
    public void winterTireClick() throws InterruptedException {
        this.winterTire.click();
        Thread.sleep(5000);
    } public void caaClick() throws InterruptedException {
        this.CAA.click();
        Thread.sleep(7000);
    }
    public void parkClick() throws InterruptedException {
        this.park.click();
        Thread.sleep(5000);
    }
    public void vehiclUseClick() throws InterruptedException {
        this.vehicleUse.click();
        Thread.sleep(5000);
    }
    public void commuteClick() throws InterruptedException {
        this.commute.click();
        this.commute.sendKeys("80",Keys.ENTER);
        Thread.sleep(5000);
    }
    public void travelClick() throws InterruptedException {
        this.travel.click();
        this.travel.sendKeys("500",Keys.ENTER);
        Thread.sleep(5000);
    }
}
