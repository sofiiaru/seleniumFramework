package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GooglePage {
    WebDriver driver;

    public GooglePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@name='btnK']")
    public WebElement searchButton;


}
