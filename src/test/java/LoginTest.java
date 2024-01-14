
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SelectBusinessType;
import pages.WebsiteTypePage;

import java.net.http.WebSocket;


public class LoginTest extends BaseTest {

    @Test
    public void clickLogins(){
        new HomePage().clickOnAIButton();
        WebsiteTypePage websiteTypePage = new WebsiteTypePage();
        websiteTypePage.clickOnOption();
        websiteTypePage.clickOnNextButton();
        softAssert.assertEquals("a","b");
        SelectBusinessType selectBusinessType = new SelectBusinessType();
        selectBusinessType.clickOndropdownMenu();
softAssert.assertAll();
    }
}



