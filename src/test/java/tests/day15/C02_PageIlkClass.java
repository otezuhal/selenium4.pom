package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
//POM de farklı classlara farklı sekıllerde ulasılması benimsenmıstır
    //Driver classı icin static yontemi kullanıyoruz
    //Page classları için ise obje uzerinden kullanılması tercih edilmektedir

    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna Nutella yazıp aratalim
        AmazonPage amazonpage=new AmazonPage();
        amazonpage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // arama sonuclarının nutella icerdigni test edelim
String actualSonucTr=amazonpage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucTr.contains("Nutella"));
       Driver.closeDriver();
    }

    @Test
    public void test02(){
        //amazona gidelim
        //java icin arama yapalım
        //sonucun java icerdigini test edelim
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("java"));
        Driver.closeDriver();
    }
}
