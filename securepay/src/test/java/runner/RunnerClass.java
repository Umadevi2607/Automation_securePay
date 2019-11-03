package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/contact-form.feature", glue="stepDefinition", monochrome = true, 
																		plugin = { "pretty", "html:target/cucumber-reports" })
public class RunnerClass {

}
