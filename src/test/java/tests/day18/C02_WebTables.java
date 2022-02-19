package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.List;

public class C02_WebTables {
    //● Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //            ○ Username : manager
    //            ○ Password : Manager1!


    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void login() {
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

    }

    @Test(dependsOnMethods = "login")
    public void table() {
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody

        // header kisminda birinci satir ve altindaki datalari locate edelim
        //   //thead//tr[1]//th


        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sutun sayisi:" + headerDataList.size());

        //			○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.
        //       //tbody
        System.out.println(hmcWebTablePage.tumBodyWebElement.getText());
        // Eger body'yi tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil,
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        // sadece contains method'u ile body'de olup olmadiklarini test edebiliriz.

        // eger her bir datayi ayri ayri almak istersek
        //  //tbody//td seklinde locate edip bir list'e atabiliriz

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDataList;
        System.out.println("Tum body elemnetleri list" +bodyTumDataList.size());
    }

    @Test(dependsOnMethods = "login")
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //			○ table body’sinde bulunan toplam satir(row) sayısını bulun.
//   //tbody//tr
        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());


        //			○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
List<WebElement> satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each: satirlarWebElementListesi
             ) {
            System.out.println(each.getText());
        }

        //			○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("4.satir : " + satirlarWebElementListesi.get(3).getText());

    }


}
