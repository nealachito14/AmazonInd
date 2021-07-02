package amazonIn.StepsDefinition;

import amazonIn.Steps.amazonInSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class amazonInStepsDefinition {
	
	@Steps
	amazonInSteps amSteps;
	
	@Given("^the user is on the amazon page$")
	public void theUserIsOnTheAmazonPage() {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.open_browser();
	}


	@When("^the user searches for and a \"([^\"]*)\"$")
	public void theUserSearchesForAndA(String object) {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.searchBarSelection();
	    amSteps.searchBarWrite(object);
	    amSteps.seeMoreBtnSelection();
	}

	@When("^is selected a \"([^\"]*)\" in special$")
	public void isSelectedAInSpecial(String brand) {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.brandSelection(brand);
	}

	@When("^search the last cellphone in the last and click it$")
	public void searchTheLastCellphoneInTheLastAndClickIt() {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.selectLastObject();
	}


	@When("^add to the cart$")
	public void addToTheCart() {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.sendToCart();
	}

	@Then("^the user verifies the last cellphone is in the cart$")
	public void theUserVerifiesTheLastCellphoneIsInTheCart() {
	    // Write code here that turns the phrase above into concrete actions
	    amSteps.validateAddedObject();
	}

}
