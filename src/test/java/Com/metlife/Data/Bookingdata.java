package Com.metlife.Data;

import Com.metlife.utilities.Excelutils;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;

public class Bookingdata {

    @DataProvider
    public Object[][] bookingData(){


        return Excelutils.readExcel("BookingData.xlsx","Nobusses");
    }
}
