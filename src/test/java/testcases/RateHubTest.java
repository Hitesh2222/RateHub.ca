package testcases;

import config.Config;
import drivermanager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RateHubTest {
    private static Logger logger = LogManager.getLogger(RateHubTest.class);
    @Test
    public void dummyTest(){

    }
    @Test
    public void setup(){
        DriverManager.getDriver().get(Config.getProperty("app.url"));
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverManager.getDriver().quit();
    }
}
