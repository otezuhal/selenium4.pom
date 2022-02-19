package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {

    //3 test methodu olusturalım


    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void satirYazdirTesti() {
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        //1. method satir numarası verdiğimde o satirdaki dataları yazsdırsın
        //2.satir yazdir
        //7.satir yazdir //tbody//tr[7]

        hmcWebTablePage = new HMCWebTablePage();
        WebElement ucuncuSatirElementi = hmcWebTablePage.satirGetir(3);

        System.out.println("3. satir : " + ucuncuSatirElementi.getText());
        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti() {

        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //2.method satir no ve data numarası girdigimde verdigim datayı yazdırsın
        hmcWebTablePage = new HMCWebTablePage();
        //2.satirin 4.datasi  //tbody//tr[2]//td[4]
        //4.satirin 5.datasi  //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredeki element :  " + hmcWebTablePage.hucreWebElementGetir(3, 5));
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti() {
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //3.sutun  numarası verdigimde bana tum sutunu yazdırsın

        hmcWebTablePage = new HMCWebTablePage();
        hmcWebTablePage.sutunYazdir(4);




    }
}