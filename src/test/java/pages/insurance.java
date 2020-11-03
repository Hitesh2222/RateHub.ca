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
    @FindBy(css = "nav a[href='/insurance/best-home-insurance-quote']")
    private WebElement homeInsurance;
    @FindBy(css = "a[href='/insurance/life-quotes']")
    private WebElement lifeIsurance;
    @FindBy(css = "#main-content a[href='/insurance/travel']")
    private WebElement travelInsurance;
    private WebElement smallBussinessInsurance;

    public insurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void autoInsuranceClick(){
        this.autoInsurance.click();
    }
    public void homeInsuClick() throws InterruptedException {
        this.homeInsurance.click();
    }
    public void lifeInsuClick() throws InterruptedException {
        this.lifeIsurance.click();
    }
    public void travelInsuClick() throws InterruptedException {
        this.travelInsurance.click();
    }
}
