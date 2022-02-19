package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));


        //HMCUrl yerine HMCurl yazaesak
        //Eger key olarak girdigimiz string configuration.properties dosyasında yoksaa configReader.getproperty methodu
        //o key i bulamaz
        //ve nullPointerException fırlatır

    }
}
