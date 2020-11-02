package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class autoInsuQuote {
    private WebDriver driver;

    @FindBy(xpath="//input[@class='quoteInput']")
    private WebElement postalCode;
    @FindBy(xpath = "//input[@class='quoteButton']")
    private WebElement startQuote;

    public autoInsuQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void postalCodeSearch(){
        this.postalCode.sendKeys("L5V1S8");
    }
    public void startQuoteClick(){
        this.startQuote.click();
    }
}
