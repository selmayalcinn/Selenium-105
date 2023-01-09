package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePages {

    public YoutubePages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "logo-icon")
   public WebElement logoicon;

    @FindBy(id = "search")
    public WebElement search;
}
