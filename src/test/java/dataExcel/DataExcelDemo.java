package dataExcel;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

public class DataExcelDemo
{
    @BeforeClass
     void setup()
     {
         System.out.println("---Country and Capital---");
     }
     @Test(dataProvider = "list")
     void show(String country, String  capital)
     {
         System.out.println(country+" --> "+capital);
     }
     @DataProvider(name = "list")
     Object[][] data() throws IOException {
         Object[][] obj1 = excel_data();
         return  obj1;
     }

     Object[][] excel_data() throws IOException {
        Object[][] obj2 = null;
         try
         {
             FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/dataExcel/Data.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(fs);
             XSSFSheet sheet = workbook.getSheetAt(0);
             int row = sheet.getPhysicalNumberOfRows();
             int col = sheet.getRow(1).getPhysicalNumberOfCells();
             obj2 = new Object[row][col];
             for(int i=1;i<=row;i++)
             {
                 for(int j=0;j<col;j++)
                 {
                     obj2[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
                 }
             }


         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
         return obj2;
     }

     void tear_down()
     {
         System.out.println("---END---");
     }

}
