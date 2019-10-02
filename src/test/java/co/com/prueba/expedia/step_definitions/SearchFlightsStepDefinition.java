package co.com.prueba.expedia.step_definitions;

import co.com.prueba.expedia.questions.IsShown;
import co.com.prueba.expedia.questions.itBeenSearched;
import co.com.prueba.expedia.tasks.*;
import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import co.com.prueba.expedia.util.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class SearchFlightsStepDefinition {

	private ExpediaHomePage expediaHomePage;

	@Before
	public void initialConfiguration() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^that \"([^\"]*)\" looks for the first one way flight departure$")
	public void thatLooksForTheFirstOneWayFlightDeparture(String actorName) {
		OnStage.theActorCalled(actorName).wasAbleTo(OpenTheBrowser.on(expediaHomePage), GoTo.findOneWayFlights());
	}

	@When("^he completes the form with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void heCompletesTheFormWithAnd(String flyingFrom, String flyingTo) {
		OnStage.theActorInTheSpotlight().wasAbleTo(CompleteTheForm.with(flyingFrom, flyingTo), ClickButton.search());
	}

	@And("^he changes the order of the flights listed by first flight departure$")
	public void heChangesTheOrderOfTheFlightsListedByFirstFlightDeparture() {
		OnStage.theActorInTheSpotlight().wasAbleTo(ClickSelect.sort());
	}

	@Then("^he sees the list of flights according to the needs$")
	public void heSeesTheListOfFlightsAccordingToTheNeeds() {
		OnStage.theActorInTheSpotlight()
				.should(seeThat(itBeenSearched.theWord(), containsString(Constants.MESSAGE_VALIDATION)));
	}

	@Then("^he sees an error message$")
	public void heSeesAnErrorMessage(){
		OnStage.theActorInTheSpotlight()
		.should(seeThat(IsShown.theMessage(), containsString(Constants.ERRORE_VALIDATION)));;
	}
}
