package TEST.practise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPages;
import pages.ZeroPages;
import utilities.Driver;
import utilities.ReusableMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03 {

    @Test
    public void test01(){

        //Yeni bir Class Olusturun : C03_SoftAssert
        //1. “http://zero.webappsecurity.com/” Adresine gidin

        Driver.getDriver().get("http://zero.webappsecurity.com/");
        //2. Sign in butonuna basin

        ZeroPages zeroPages= new ZeroPages();
        zeroPages.buton.click();
        //3. Login kutusuna “username” yazin
        zeroPages.login.click();
        zeroPages.login.sendKeys("username");
        //4. Password kutusuna “password” yazin
        zeroPages.pasword.sendKeys("password");
        //5. Sign in tusuna basin
       zeroPages.singin.click();
       Driver.getDriver().navigate().back();
       //6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroPages.onlinebank.click();
        zeroPages.pay.click();
        //7. “Purchase Foreign Currency” tusuna basin
        zeroPages.pfc.click();
        //8. “Currency” drop down menusunden Eurozone’u secin

        Select select=new Select(zeroPages.pcc);
        select.selectByVisibleText("Eurozone (euro)");

        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert= new SoftAssert();
        String expected= select.getFirstSelectedOption().getText();
        String actual= "Eurozone (euro)";
       softAssert.assertEquals(actual,expected);
        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        List<WebElement> option= select.getOptions();
        List<String> actualoption= new ArrayList<>();

        for (WebElement each: option
             ) {
            actualoption.add(each.getText());
        }
        String[] arr={"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
                "China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)",
                "Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)",
                "Sweden (krona)","Singapore (dollar)","Thailand (baht)"};

        List<String> expectedoption= Arrays.asList(arr);

        Collections.sort(expectedoption);
        Collections.sort(actualoption);

        softAssert.assertEquals(expectedoption,actualoption);
        ReusableMethod.bekle(5);
        softAssert.assertAll();
        Driver.closeDriver();

        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (bah

    }


}
