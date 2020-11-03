package testcases;

import config.Config;
import drivermanager.DriverManager;
import listeners.ScreenshotListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utils.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(ScreenshotListener.class)
public class RateHubTest {
    WebDriver driver = DriverManager.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    private static Logger logger = LogManager.getLogger(RateHubTest.class);

    @BeforeSuite
    public void setup() throws IOException {

        driver.get(Config.getProperty("app.url"));
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void insuraceTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,1000)");
        HomePage homePage = new HomePage(driver);
        homePage.insuranceClick();
//        Thread.sleep(10000);
        insurance insurance = new insurance(driver);
        insurance.autoInsuranceClick();
//        Thread.sleep(3000);
        autoInsuQuote insuQuote = new autoInsuQuote(driver);
        insuQuote.postalCodeSearch();
//        Thread.sleep(3000);
        insuQuote.startQuoteClick();
//        Thread.sleep(3000);
        vehicleDetails details = new vehicleDetails(driver);
        details.helpClick();
//        Thread.sleep(3000);
        details.selectyear();
//        Thread.sleep(7000);
        details.makeClick();
        details.modelClick();
        details.ownClick();
        details.purchaseDateClick();
        details.conditionClick();
        details.winterTireClick();
        details.caaClick();
        details.parkClick();
        details.vehiclUseClick();
        details.commuteClick();
        details.travelClick();
        details.plusButtonClick();

    }
    @Test
    public void homeInsuTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        HomePage page = new HomePage(driver);
        page.insuranceClick();
        insurance insurance = new insurance(driver);
        insurance.travelInsuClick();
    }
    @Test
    public void travelInsuTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ratehub.ca/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        HomePage homePage = new HomePage(driver);
        homePage.insuranceClick();
        TravelInsurance travelInsurance = new TravelInsurance(driver);
        travelInsurance.autoInsuClick();
        travelInsurance.destionationClick();
        travelInsurance.residenceSendKeys();
        travelInsurance.slectdateClick();
        travelInsurance.selectDateClick1();
        travelInsurance.tpDateClick();
        travelInsurance.setClick();
        travelInsurance.radioClick();
        travelInsurance.numTravelerClick();
        travelInsurance.getQuoteClick();
        driver.quit();
    }

    @AfterSuite
    public void tearDown() {
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        DriverManager.getDriver().quit();
    }
}