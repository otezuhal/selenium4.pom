package tests.day22;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {
    @Test
    public void windowHandlereusableTest() throws IOException {
        extentTest=extentReports.createTest("window handle","title ile 2.sayfaya gecis yapildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni window linkine tıklandı");
        ReusableMethods.switchToWindow("New Window");
        extentTest.info("reusable method kullanılarak acılan ikinci sayfaya gecildi");

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.info("title nin beklenen deger ile aynı oldugu test edildi");


    }
}
