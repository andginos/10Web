import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.InitDriver;

import static pages.InitDriver.driver;


public class BaseTest {
    SoftAssert softAssert;

    @BeforeMethod
    public void setup(){
        new InitDriver().driverInit();
        softAssert = new SoftAssert();
    }
    @AfterMethod
    public void close(){
        driver.close();
        driver.quit();
    }


}
