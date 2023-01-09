package TEST.practise;

import com.beust.ah.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Driver;

public class c02 {

    @Test
    public void test01(){

        // Bir class oluşturun: DependsOnTest
        // https://www.amazon.com/ adresine gidin.

        Driver.getDriver().get("https://www.amazon.com/");
        // 1. Test : Amazon ana sayfaya gittiginizi test edin
        String expected="https://www.amazon.com/";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actual,expected);

    }

    @Test (dependsOnMethods = "test01")
    public void test02(){
        // 2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        // ve aramanizin gerceklestigini Test edin


        AmazonPages amazonPages= new AmazonPages();
        amazonPages.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }

    @Test (dependsOnMethods = "test2")
    public void test03(){
        // 3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
        // oldugunu test edin
        AmazonPages amazonPages= new AmazonPages();

        String expected="16.83$";
        String actual = amazonPages.fiyat.getText();

        Assert.assertFalse(actual.contains(expected));
    }
    }

