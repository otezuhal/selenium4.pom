package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {
        //ulkeler exceline 5.sutun olaraK NUFUS  sutunu ekleyelim
        //3.satirdaki ulkenin nufusunu 1000000 yapalim

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
                Workbook workbook= WorkbookFactory.create(fis);


    }


}
