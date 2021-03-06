package ui.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },

                features = "src/test/java/ui/features",
                glue = { "ui/stepdefinitions" },
                tags = {""},
                dryRun = false)
public class TestRunner {
}
