package tests.sbh11;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EndtoendTest {
    ////1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
    //    //2. Bir metod olusturun: RoomCreateTest()
    //    //https://www.hotelmycamp.com/ adresine gidin.
    @Test
    public void roomCreateTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //    //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();
        //    //a. Username: manager
        //    // b. Password : Manager 1
        //    //5. Login butonuna tıklayın.
        //    //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();
        //    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hotelMyCampPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Select select=new Select(hotelMyCampPage.addHotelDropdown);
       select.selectByIndex(1);

hotelMyCampPage.bekle(2);
        //    //8. Save butonuna basin.

        hotelMyCampPage.addHotelSaveButonu.click();
        hotelMyCampPage.bekle(3);
        //    //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.

        Assert.assertTrue(hotelMyCampPage.saveOlduYazisi.isDisplayed());
        //    //10. OK butonuna tıklayın.

        hotelMyCampPage.yaziOkButtonu.click();
        //    //11. Hotel rooms linkine tıklayın.

hotelMyCampPage.hotelRoomLinki.click();



        //    //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın.
Assert.assertTrue(hotelMyCampPage.listofYazisi.isDisplayed());



    }



}
