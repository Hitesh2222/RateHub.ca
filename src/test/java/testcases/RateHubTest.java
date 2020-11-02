package testcases;

import config.Config;
import drivermanager.DriverManager;
import listeners.ScreenshotListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.autoInsuQuote;
import pages.insurance;
import pages.vehicleDetails;
import utils.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(ScreenshotListener.class)
public class RateHubTest {
    WebDriver driver = DriverManager.getDriver();
//    private static Logger logger = LogManager.getLogger(RateHubTest.class);

    @BeforeSuite
    public void setup() throws IOException {

        driver.get(Config.getProperty("app.url"));
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void insuraceTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
    }

    @AfterSuite
    public void tearDown() {
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        DriverManager.getDriver().quit();
    }
}