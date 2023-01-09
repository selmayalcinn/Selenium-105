package TEST.practise;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPages;
import utilities.Driver;

public class c04 {


    @Test
    public void test01(){
        //// https://www.kiwi.com sayfasina gidin
        //    // Cookies i reddedin

        Driver.getDriver().get(" https://www.kiwi.com");


        KiwiPages kiwiPages= new KiwiPages();

        WebElement cookie= Driver.getDriver().findElement(By.id("cookies_accept"));
        cookie.click();
     //  KiwiPages kiwiPages=new KiwiPages();
     //  kiwiPages.cookie.click();
        // Kayfa basliginin "kiwi" icerdigini test edin
       // String expectedtitle="kiwi";
       // String actualtitle=Driver.getDriver().getTitle();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("kiwi"));


    }

    @Test
    public void test02(){

        Driver.getDriver().get(" https://www.kiwi.com");
        // Sag ust kisimdan dil ve para birimi secenegini Turkiye ve TL olarak secin

        KiwiPages kiwiPages= new KiwiPages();
        kiwiPages.eur.click();
        Select select=new Select(kiwiPages.select);
        select.selectByValue("tr");

        Select select2= new Select(kiwiPages.para);
        select2.selectByValue("try");

        kiwiPages.kaydetme.click();

        // Sectiginiz dil ve para birimini dogrulayin

        Assert.assertTrue(kiwiPages.lira.getText().contains("TRY"));

    }





       // Ucus secenegi olarak tek yon secelim
       // Kalkis ve varis boxlarini temizleyerek kalkis ve varis ulkesini kendimiz belirleyelim
       // Gidis tarihi kismina erisim saglayarak gidecegimiz gunu secelim ve booking i iptal edelim
       // Sadece aktarmasiz ucuslar olarak filtreleme yapalim ve en ucuz secenegine tiklayalim
       // Filtreleme yaptigimiz en ucuz ucusun fiyatini getirerek 5000 tl den kucuk oldgunu dogurlayalim
}
