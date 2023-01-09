package TEST.day16_SmokeTest;

import org.testng.annotations.Test;
import pages.QualityDemyPages;
import utilities.Driver;
import utilities.ReusableMethod;
import utilities.configReader;

public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){
        Driver.getDriver().get(configReader.getProperty("qualitydemyUrl"));

        QualityDemyPages qualityDemyPages= new QualityDemyPages();

        qualityDemyPages.ilkLoginLinki.click();

        qualityDemyPages.kullaniciEmailKutusu.sendKeys(configReader.getProperty("qdGecerliUsername"));
        qualityDemyPages.passwordKutusu.sendKeys(configReader.getProperty("qdGecerliPassword"));

        qualityDemyPages.loginButonu.click();

        ReusableMethod.bekle(5);
        Driver.closeDriver();
    }












}
