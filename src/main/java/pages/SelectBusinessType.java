package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectBusinessType extends BasePage{

    @FindBy(id="selected_industry")
    public WebElement dropdownMenu;



    public void clickOndropdownMenu(){
        typeText(dropdownMenu, "Interior");


    }
}
