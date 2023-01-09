package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPages {

    public ZeroPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "signin_button")
    public WebElement buton;

    @FindBy(id = "user_login")
    public WebElement login;

    @FindBy(id = "user_password")
    public WebElement pasword;

    @FindBy(name = "submit")
    public WebElement singin;

    @FindBy (xpath = "(//*[text()='Online Banking'])[1]")
   public WebElement onlinebank;

    @FindBy(xpath = "//*[text()='Pay Bills']")
    public WebElement pay;

    @FindBy(xpath = "//*[text()='Purchase Foreign Currency']")
    public WebElement pfc;

    @FindBy(id = "pc_currency")
    public WebElement pcc;
}
