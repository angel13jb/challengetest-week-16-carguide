package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.DealersPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

public class FindDealerSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new DealersPage().clickOnFindDealerLink();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
        new DealersPage().clickOnNextButton();
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable datatable) {
        List<String>data=datatable.asList(String.class);
        for(String s:data){
            while (new DealersPage().getDealerName(s)==null) {
                new DealersPage().clickOnNextButton();
                break;
            }
        }

    }
}
