package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TravelInsurance {
    private WebDriver driver;
    @FindBy(css = "#main-content a[href='/insurance/travel']")
    private WebElement autoInsurance;
    @FindBy(css = "#qqcDestinations")
    private WebElement destination;
    @FindBy(css = "#WnQqcCor")
    private WebElement residence;
    @FindBy(css = "#qqcSDate")
    private WebElement from;
    @FindBy(css = "div[data-full='2020-11-4']")
    private WebElement selectDate;
    @FindBy(css = "div[data-full='2020-11-15']")
    private WebElement toDate;
    @FindBy(css = "div.spacer > span:nth-child(2) > label > div > div > div")
    private WebElement radioButton;
    @FindBy(xpath = "//div[@class='mbsc-fr-btn0 mbsc-fr-btn-e mbsc-fr-btn']")
    private WebElement set;
    @FindBy(xpath = "//input[@id='age-1']")
    private WebElement noTraveler;
    @FindBy(xpath = "//button[@class='Btn Btn--primary']")
    private WebElement getQuote;

    public TravelInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void autoInsuClick() {
        this.autoInsurance.click();
    }
    public void destionationClick() throws InterruptedException {
        this.destination.sendKeys("Singapore", Keys.ENTER);
        Thread.sleep(2000);
        this.destination.sendKeys("Vietnam", Keys.ENTER);
    }
    public void residenceSendKeys() throws InterruptedException {
        this.residence.sendKeys("India",Keys.ENTER);
    }
    public void slectdateClick() throws InterruptedException {
        this.from.click();
        //Thread.sleep(3000);
    }
    public void selectDateClick1() throws InterruptedException {
        // driver.switchTo().frame(driver.findElement(By.id()))
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(selectDate)).click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click()", selectDate);
        Thread.sleep(1000);
    }
    public void tpDateClick() throws InterruptedException {
        this.toDate.click();
        File file = toDate.getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(file.toPath(),Paths.get("Screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    public void radioClick() throws InterruptedException {
        this.radioButton.click();
        Thread.sleep(5000);
    }
    public void setClick() throws InterruptedException {
        this.set.click();
        Thread.sleep(5000);
    }
    public void numTravelerClick() throws InterruptedException {
        this.noTraveler.sendKeys("27");
        Thread.sleep(2000);
    }
    public void getQuoteClick() throws InterruptedException {
        this.getQuote.click();
        Thread.sleep(5000);
    }
}