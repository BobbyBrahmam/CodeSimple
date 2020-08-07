package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SearchFlightsPage;
import utilities.TestBase;

public class SearchFlightsSteps extends TestBase {

	SearchFlightsPage search;

	@Given("^I navigate to the Home Page$")
	public void I_navigate_to_the_Home_Page() {
		TestBase.initialization();
		search = new SearchFlightsPage();
	}

	@When("^I enter the Source \"(.*)\" and Destination \"(.*)\"$")
	public void I_enter_the_Source_and_Destination(String from, String to) {
		search.enterSourceAndDestination(from, to);
	}

	@When("^I select the Departure Date \"(.*)\"$")
	public void I_select_the_Departure_Date(String date) {
		search.selectDepartureDate(date);
	}

	@When("^I search for the available Itineraries$")
	public void I_search_for_the_Iternaries() {
		search.searchIternaries();
	}
}