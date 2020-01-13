package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestWaits {
    @Test
    public void testGoogleLink(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(), 'Create your account')]")).isDisplayed());

    }
}
