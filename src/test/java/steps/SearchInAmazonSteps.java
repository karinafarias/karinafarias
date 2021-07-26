package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.PageAmazon;
import paginas.PageGoogle;

public class SearchInAmazonSteps {
	PageGoogle pageGoogle = new PageGoogle();
	PageAmazon pageAmazon = new PageAmazon();
	
@Given("^Open Browser on \"([^\"]*)\"$")
public void openBrowserOn(String url) {
	pageGoogle.openGoogle(url);
}

@Given("^Search for \"([^\"]*)\" and Search$")
public void searchForAndSearch(String text) {
    pageGoogle.searchFor(text);
}

@Given("^Navigate to \"([^\"]*)\" Through The Search Page$")
public void navigateToThroughTheSearchPage(String url) {
    pageGoogle.navigateTo(url);
}

@Given("^Search For \"([^\"]*)\" Using The Search Bar$")
public void searchForUsingTheSearchBar(String text) {
    pageAmazon.searchForInTheSearchBar(text);
}

@Given("^Count The Total List Of Found Products$")
public void countTheTotalListOfFoundProducts() {
    pageAmazon.SumTotalOfFoundProductsInResultOfSearch();
}

@Given("^Count The Total Of \"([^\"]*)\" Items Found$")
public void countTheTotalOfItemsFound(String text) {
    pageAmazon.SumTotalOfFoundProductsInResultOfSearch(text);
}

@Then("^Make Sure At Least \"([^\"]*)\"% Of Items Found are \"([^\"]*)\"$")
public void makeSureAtLeastOfItemsFoundAre(String percent, String item) {
    pageAmazon.validateAtLeastOfItensFoundsAre(percent,item);
}
@When("^Find The The More Expensive \"([^\"]*)\" In Page$")
public void findTheTheMoreExpensiveInPage(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Convert Its Value To USD Using \"([^\"]*)\" API$")
public void convertItsValueToUSDUsingAPI(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Make Sure The Converted Value Is Not Greater Than US\"([^\"]*)\"$")
public void makeSureTheConvertedValueIsNotGreaterThanUS(String arg1) {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}
