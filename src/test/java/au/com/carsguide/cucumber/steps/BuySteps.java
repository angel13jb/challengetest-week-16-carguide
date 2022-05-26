package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverOnBuyAndSellTab();
    }

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() throws InterruptedException {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to 'new and used car' search page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertTrue(new NewAndUsedCarPage().getNewAndUsedCarText().contains("New & Used Car Search"));
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarPage().selectCarMakesBox(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarPage().selectCarModelsBox(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        new NewAndUsedCarPage().selectLocations(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarPage().selectPriceBox(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCarTab();
    }

    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertTrue(new UsedCarPage().getUsedCarText().contains("Used Cars For Sale"));
    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue(new ResultPage().getResultText().contains(make));
    }
}

