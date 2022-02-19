package tests.day17;

import org.testng.annotations.Test;

import java.sql.Driver;

public class C04_SingletonPattern {
    @Test
    public  void test01(){
        //singletonPattern: bir class dan birden fazla onje uretilmesine
        //izin vermeyen bir pattern olarak  kabul edilmiştir

        //biz Driver class ını driver uretmek uzere kullanıyoruz
        //ancak Driver classında driver isminde bir instance variable da var
        //ve biz obje ureterek bu instance driver a ulasabiliriz

        //Driver driver1=new Driver(); olmuyor

        //Singleton pattern kabul görmus bir patterndir
        //amac bir classtan obje uretilmemesini saglamaktır
        //bunun icin singleton patternde koruyacagımız classta parametresix bir construvtor ı
        //private yaparız
    }
}
