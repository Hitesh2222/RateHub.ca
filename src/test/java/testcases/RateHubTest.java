package testcases;

import config.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RateHubTest {
    private static Logger logger = LogManager.getLogger(RateHubTest.class);
    @Test
    public void dummyTest(){

    }
    @Test
    public void setup(){
        System.out.println(Config.getProperty("chrome.executable"));
        Assert.assertEquals(Config.getProperty("browser.name"),"chrome","Name Mismatch");
    }
}
