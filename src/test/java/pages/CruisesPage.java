package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CruisesPage extends BasePage{

    WebDriver driver;

    public CruisesPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="/gfd")
    public WebElement destinationField;
}
