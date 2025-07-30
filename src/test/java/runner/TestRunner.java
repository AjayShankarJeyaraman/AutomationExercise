package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"hooks", "StepDefinition"},
	    plugin = {
	        "pretty",
	        "summary",
	        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
	    },
	    dryRun = false,
	    monochrome = true,
	    tags = "@AllProduct"
	)

public class TestRunner {
}
