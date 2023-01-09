package TEST.day16_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPages;
import utilities.Driver;
import utilities.ReusableMethod;
import utilities.configReader;

public class C02_NegatifLoginTest {

    QualityDemyPages qualityDemyPages= new QualityDemyPages();

    @Test
    public void yanlisEmailTesti(){

        // 3 test methodu olustur
        //1.de yanlıs email, dogru sifre
        Driver.getDriver().get(configReader.getProperty("qualitydemyUrl"));
        qualityDemyPages.loginButonu.click();
        qualityDemyPages.kullaniciEmailKutusu.sendKeys(configReader.getProperty("qdGecersizUsername"));
        qualityDemyPages.passwordKutusu.sendKeys(configReader.getProperty("qdGecerliPassword"));
        qualityDemyPages.loginButonu.click();

        Assert.assertTrue(qualityDemyPages.kullaniciEmailKutusu.isDisplayed());

        ReusableMethod.bekle(3);
        Driver.closeDriver();

    }

    @Test
    public void tumuYanlisTest(){
        qualityDemyPages= new QualityDemyPages();
        Driver.getDriver().get(configReader.getProperty("qualitydemyUrl"));
        qualityDemyPages.ilkLoginLinki.click();
        qualityDemyPages.kullaniciEmailKutusu.sendKeys(configReader.getProperty("qdGecersizUsername"));
        qualityDemyPages.passwordKutusu.sendKeys(configReader.getProperty("qdGecersizPassword"));

        Assert.assertTrue(qualityDemyPages.kullaniciEmailKutusu.isDisplayed());

        ReusableMethod.bekle(3);
        Driver.closeDriver();


    }

    @Test
    public void yanlisPassword(){

        qualityDemyPages= new QualityDemyPages();
        Driver.getDriver().get(configReader.getProperty("qualitydemyUrl"));
        qualityDemyPages.ilkLoginLinki.click();
        qualityDemyPages.kullaniciEmailKutusu.sendKeys(configReader.getProperty("qdGecerliUsername"));
        qualityDemyPages.passwordKutusu.sendKeys(configReader.getProperty("qdGecersizPassword"));

        Assert.assertTrue(qualityDemyPages.kullaniciEmailKutusu.isDisplayed());

        ReusableMethod.bekle(3);
        Driver.closeDriver();

    }
}
