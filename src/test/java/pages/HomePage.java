package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;

    @FindBy(css = " svg.LogoFull__Svg-sc-142r74o-0.jyFGVD.Header__LogoFull-d87ez2-4.fttpoi")
    private WebElement logo;
    private WebElement mortgages;
    private WebElement creditCards;
    private WebElement banking;
    private WebElement investing;

    @FindBy(linkText = "Insurance")
    private WebElement insurance;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void insuranceClick(){
        this.insurance.click();
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(insurance));
//        return new insurance(driver);
    }
    public void logoClick(){
        this.logo.click();
    }

}
