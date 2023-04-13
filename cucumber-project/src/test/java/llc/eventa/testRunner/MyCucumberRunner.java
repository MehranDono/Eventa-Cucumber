package llc.eventa.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/llc/eventa/resources/manual_login.feature"},
                 glue = {"llc.eventa.stepDefination"},
                 monochrome = true,
                 plugin = {"html:target/Html-Reports", "junit:target/JUnitReports/report.xml"},
                 dryRun = false,
                 publish = true)
public class MyCucumberRunner 
{
    // ...
}

