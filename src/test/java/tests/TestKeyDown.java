package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

public class TestKeyDown {
    @Test
    public void test1() throws InterruptedException{
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/keyboard-events-sample-form/");
        driver.findElement(By.id("currentAddress")).sendKeys("abc123");
        Actions action  = new Actions(driver);
        Thread.sleep(1000);
        action.keyDown( driver.findElement(By.id("currentAddress")), Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.keyDown( driver.findElement(By.id("currentAddress")), Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        action.keyDown( driver.findElement(By.id("permanentAddress")), Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


    }

    @Test
    public void tes2() throws InterruptedException{
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/tooltip-and-double-click/");
        Actions action  = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("tooltipDemo"))).perform();
        //Thread.sleep(1000);
        WebElement text = driver.findElement(By.xpath("//span[@class='tooltiptext']"));
        Assert.assertTrue(text.isDisplayed());
    }

    @Test
    public void tes3() throws InterruptedException{
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/slider/");
        Actions action  = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//div[@id='slider']/span"))).moveByOffset(25,0).release().perform();
        //Thread.sleep(1000);


    }
}
