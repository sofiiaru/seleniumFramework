package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        //you can set an environment here
    }

    @After
    public void tearDown(Scenario scenario){
        //we will take screenshot if scenario fails
        try{
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }

        }catch(Exception e){
            System.out.println("Exception while running Tear down :" + e.getMessage());
        }
        Driver.closeDriver();
    }
}
