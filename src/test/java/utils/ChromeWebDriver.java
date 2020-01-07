package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {

    private static WebDriver LoadChromeDriver(boolean headless){
        ChromeDriverService driverService = ChromeDriverService.createDefaultService();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("-allow-http-screen-capture");
        options.addArguments("--window-size=1920,1080");
        if(headless){
            //options.addArguments("--headless");
            options.setHeadless(true);
        }

        WebDriver driver = new ChromeDriver(driverService,options);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        return driver;
    }

}
