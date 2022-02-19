package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittiğimii test edelim
       String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();
    }

    // Driver.getDriver() method'u her calistiginda
    // driver = new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
    // Biz Driver class'dan getDriver()'i ilk calistirdigimizda new atamasi olsun
    // sonraki calismalarda atama olmasin istiyoruz
    // bunun icin driver = new ChromeDriver(); satirni bir if blogu icine aliriz

    @Test
    public void test02(){
        //bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        //best -buy gittğimizi test edlim
        String url=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("best"));
        Driver.closeDriver();
    }
}
