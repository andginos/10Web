package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebsiteTypePage extends BasePage {
    @FindBy(css="#primary > div.onboarding-page > div.onboarding-content > div.db-start-view-wrap.db-setup-2 > div > div.db-left-side > div.radio_buttons_container > div:nth-child(1) > label")
    public WebElement optionFirst;

    @FindBy(css="a[class*=\"dark_grey_bg\"]")
    public WebElement nextButton;

    public void clickOnOption(){
        clickOnElement(optionFirst);

    }

    public void clickOnNextButton(){
        clickOnElement(nextButton);
    }
}
