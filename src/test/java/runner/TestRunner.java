package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {
                "com.ctdev.autotests.core",
                "com.ctdev.autotests.steps"
        },
        strict = true,
        tags = {"@Test"},
        features = {
                "src/test/resources/features/"
        })
public class TestRunner {
}
