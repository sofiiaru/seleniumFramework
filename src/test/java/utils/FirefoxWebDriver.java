package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.service.DriverService;

import java.util.concurrent.TimeUnit;

public class FirefoxWebDriver {
    public static WebDriver loadFirefoxDriver(boolean headless){
        WebDriverManager.firefoxdriver().setup();
        GeckoDriverService driverService = GeckoDriverService.createDefaultService();

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(headless);

        WebDriver driver = new FirefoxDriver(driverService);

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
