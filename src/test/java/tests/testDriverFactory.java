package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class testDriverFactory {
    @Test
    public void testChrome(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public void testFirefox(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testChromeHeadless(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void testFrame(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://blog.codinghorror.com/");

        driver.switchTo().frame(0);
        //button[@aria-label='Play']

    }

}
