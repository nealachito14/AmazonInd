package amazonIn.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/Features/amazonSearches.feature",
		glue = "amazonIn.StepsDefinition",
		snippets = SnippetType.CAMELCASE,
		tags = {"@motorola"}
		)

public class amazonInRunner {

}
