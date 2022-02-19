package tests.practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DEmoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P1_DemoGuruTest {
    /*
http://demo.guru99.com/test/drag_drop.html url e git
DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
Perfect butonun goruntulendigini dogrulayin
 */
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));
        Actions actions=new Actions(Driver.getDriver());
        P1_DEmoGuruPage p1_dEmoGuruPage=new P1_DEmoGuruPage();
actions.dragAndDrop(p1_dEmoGuruPage.bankButonu, p1_dEmoGuruPage.debitsideAccount)
        .dragAndDrop(p1_dEmoGuruPage.salesButonu, p1_dEmoGuruPage.creditSideAccount)
        .dragAndDrop(p1_dEmoGuruPage.firstnum5000Butonu, p1_dEmoGuruPage.debitsideAmount)
        .dragAndDrop(p1_dEmoGuruPage.secondnum5000Butonu, p1_dEmoGuruPage.creditSideAmount)
        .sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(4);

        Assert.assertTrue(p1_dEmoGuruPage.perfectYazisi.isDisplayed());


    }









}
