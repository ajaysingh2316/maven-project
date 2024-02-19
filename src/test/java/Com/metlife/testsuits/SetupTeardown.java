package Com.metlife.testsuits;

import Com.metlife.utilities.WebdriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SetupTeardown {

    //WebDriver driver;

    WebDriverWait  wait;
    @BeforeMethod

    public void setup(){

        WebdriverUtils.initalize();
    }

    @AfterMethod

    public void teardown(){

        WebdriverUtils.quit();
    }
}
