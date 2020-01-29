package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utils.Driver;

public class GoogleSearchSteps {
    GooglePage obj = new GooglePage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("http://www.google.com");

    }

    @Given("User enters flowers")
    public void user_enters_flowers() {
        obj.searchBox.sendKeys("flowers");
    }

    @Given("user clicks search button")
    public void user_clicks_search_button() {
        obj.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("user should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Keyword flowers was not located in title", actualTitle.contains("school"));
    }
}
