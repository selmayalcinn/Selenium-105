package TEST.practise;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WikipediaPages;
import utilities.Driver;
import utilities.ReusableMethod;

public class GoogleTesti {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.google.com");
        String etitle="google";
        String atitle=Driver.getDriver().getTitle();

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(atitle,etitle);
    }

    @Test
    public void test02(){

        WikipediaPages wikipediaPages= new WikipediaPages();
        wikipediaPages.search.click();
        wikipediaPages.search.sendKeys("atherosclerosis ne demek?"+ Keys.ENTER);
        wikipediaPages.wikipedia.click();

        ReusableMethod.bekle(3);


    }












}
