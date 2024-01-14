package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css="div[class*=\"whole-link generate_ai\"]")
    public WebElement buttonWithAI;

    public void clickOnAIButton(){
        clickOnElement(buttonWithAI);

    }


}



