package tests;

import org.junit.Test;
import pages.CruisesPage;

public class TestPages {

    @Test
    public void test1(){
        CruisesPage cruises = new CruisesPage();
        cruises.destinationField.sendKeys("sjdhfg");
        cruises.signInButton.click();
    }



}
