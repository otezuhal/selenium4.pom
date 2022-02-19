package tests.day20;

import org.testng.annotations.Test;
import tests.smokee.ReusableMethodsExcel;

public class C05_ExceliMapeYukleme {


    @Test
    public void test01() {
        //dosyayolu ve sayfa ismi

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";
        System.out.println(ReusableMethodsExcel.mapOlustur(path, sayfaAdi));


    }

}
