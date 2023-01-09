package TEST.practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YoutubePages;
import utilities.Driver;

public class c01 {

    @Test
    public void test01(){

        //Bir class oluşturun: YoutubeAssertions
        //1) https://www.youtube.com adresine gidin

        Driver.getDriver().get("https://www.youtube.com");
        //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
       String expectedtitile="YouTube";
       String actualtitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualtitle,expectedtitile);




    }


    @Test
    public void test02(){
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin

        YoutubePages youtubePages=new YoutubePages();
        youtubePages.logoicon.isDisplayed();
    }

    @Test
    public void test03(){
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        YoutubePages youtubePages=new YoutubePages();
        youtubePages.search.isEnabled();
    }
    @Test
    public void tets04(){
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

       String expectedtitle= "youtube";
       String actualtitle=Driver.getDriver().getTitle();

       Assert.assertFalse(actualtitle.contains(expectedtitle));

    }


}
