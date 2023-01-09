package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPages {

    public void KiwiPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "cookies_accept")
    public WebElement cookie;

    @FindBy (xpath = "//*[text()='EUR']")
    public WebElement eur;

    @FindBy(xpath = "//select[@data-test='LanguageSelect']")
    public WebElement select;

    @FindBy(xpath = "//select[@data-test='CurrencySelect']")
    public WebElement para;

    @FindBy(xpath = "(//button[@class='ButtonPrimitive__StyledButtonPrimitive-sc-1lbd19y-0 cSWLQN'])[2]")
    public WebElement kaydetme;

    @FindBy(xpath = "//*[text()='TRY']")
    public WebElement lira;
}
