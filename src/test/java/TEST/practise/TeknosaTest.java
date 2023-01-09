package TEST.practise;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TeknosaPages;
import utilities.Driver;

public class TeknosaTest {

    @Test
    public void test01(){

        Driver.getDriver().get("https://teknosa.com");
        String etitle="teknosa";
        String atitle=Driver.getDriver().getTitle();

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(etitle,atitle);

        TeknosaPages teknosaPages=new TeknosaPages();

        teknosaPages.search.sendKeys("books"+ Keys.ENTER);


    }

    @Test
    public void cookieTest(){

        Driver.getDriver().get("https://www.teknosa.com");
        TeknosaPages teknosaPages= new TeknosaPages();
    }
}
