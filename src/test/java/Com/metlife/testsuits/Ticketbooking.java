package Com.metlife.testsuits;

import Com.metlife.Data.Bookingdata;
import Com.metlife.pageobjects.Homepage;
import Com.metlife.pageobjects.Pageresult;
import Com.metlife.utilities.WebdriverUtils;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Ticketbooking extends SetupTeardown {

    @Test(dataProviderClass = Bookingdata.class,dataProvider = "bookingData")

    public void no_busses_ticket(String src,String dest,String mnth){

        WebdriverUtils.navigate("http://redbus.in");
        WebdriverUtils.type(Homepage.src_ip,src);


        WebdriverUtils.Click(Homepage.first_list_item);
        WebdriverUtils.type(Homepage.dest_ip,dest);

        WebdriverUtils.Click(Homepage.first_list_item);

        String month=WebdriverUtils.getText(Homepage.month_txt);
        while (!month.contains(mnth))
        {

            WebdriverUtils.Click(Homepage.next_button);
            month=WebdriverUtils.getText(Homepage.month_txt);

        }

        WebdriverUtils.Click(Homepage.date_4);

        WebdriverUtils.Click(Homepage.search_btn);
        String msg=WebdriverUtils.getText(Pageresult.msg_result);
        Assert.assertEquals(msg,"oops! No bus found");


        }













}
