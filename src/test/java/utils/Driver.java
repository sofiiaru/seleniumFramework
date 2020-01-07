package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Driver {
   //so one cannot create an object of the driver directly
    private Driver(){};

    private static WebDriver driver;
    private static List<WebDriver> drivers = new ArrayList<>();

    public static WebDriver getDriver(){
        if(driver == null){
            switch(ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver(Boolean.parseBoolean(ConfigReader.getProperty("headless")));
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver(Boolean.parseBoolean(ConfigReader.getProperty("headless")));
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver(false);
            }

        }
        drivers.add(driver);
        return driver;
    }

    public static void closeDriver(){
        if(driver == null) return;
        try{
            driver.close();
            driver.quit();
            driver = null;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void disposeAllDrivers(){
        for(WebDriver driver: drivers){
            if(driver != null) driver.quit();
        }
        drivers.clear();
    }


}
