package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class insurance {
    private WebDriver driver;

    @FindBy(css = "nav a[href='/insurance/best-car-insurance-quote']")
    private WebElement autoInsurance;
    private WebElement homeInsurance;
    private WebElement lifeIsurance;
    private WebElement travelInsurance;
    private WebElement smallBussinessInsurance;

    public insurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void autoInsuranceClick(){
        this.autoInsurance.click();
    }
}
