package llc.eventa.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/llc/eventa/resources/eventa_login.feature"},
                 glue = {"llc.eventa.stepDefination", "llc.eventa.MyHooks"},
                 dryRun = true)
public class MyCucumberRunner {
    // ...
}

