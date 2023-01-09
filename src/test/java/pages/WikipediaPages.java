package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaPages {

    public WikipediaPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "//input[@class='gLFyf']")
    public WebElement search;

    @FindBy(xpath = "//div[@class='pcTkSc']")
    public WebElement secenek;

    @FindBy(xpath = "//*[text()='Ateroskleroz - Vikipedi']")
    public WebElement wikipedia;

    @FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
    public WebElement yeniSayfa;
}
