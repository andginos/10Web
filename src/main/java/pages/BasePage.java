package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class BasePage {

    public WebDriverWait wait = new WebDriverWait(InitDriver.driver, Duration.ofSeconds(4));
    Actions actions = new Actions(InitDriver.driver);

    public BasePage() {
        PageFactory.initElements(InitDriver.driver, this);

    }

    public void clickOnElement(WebElement element){

        actions.moveToElement(element).click(element).perform();
    }

    public void typeText(WebElement element,String text) {
        try {
            element.click();
            Thread.sleep(500);
            actions.sendKeys(text);
        } catch (Exception e) {

        }
    }
}
