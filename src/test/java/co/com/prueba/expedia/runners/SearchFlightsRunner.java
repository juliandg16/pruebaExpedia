package co.com.prueba.expedia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SearchFlights.feature",
        glue = "co.com.prueba.expedia.step_definitions",
       // tags = "@Scenario2",//"@Scenario1"},
        snippets = SnippetType.CAMELCASE
)
public class SearchFlightsRunner {
}
