package tests.smokee;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {
//1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
//3 Farkli test Methodunda 3 senaryoyu test et
//                - yanlisSifre
//                - yanlisKulllanici
//                - yanlisSifreKullanici
//test data yanlis username: manager1 , yanlis password : manager1
//2) https://www.hotelmycamp.com adresine git
//3) Login butonuna bas
//4) Verilen senaryolar ile giris yapilamadigini test et
    HotelMyCampPage hotelMyCampPage;
@Test
    public void yanlisSifreTesti(){
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.ilkLoginLinki.click();
    hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    hotelMyCampPage.loginButonu.click();

    Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
  Driver.closeDriver();

}


}
