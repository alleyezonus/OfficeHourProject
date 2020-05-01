package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step_definitions",
        dryRun = false,
        tags="@etsy",
        plugin = {"rerun:target/rerun.txt", "html:target/default-cucumber-reports","json:target/cucumber.json"}
)
public class CucumberRunner {

}
