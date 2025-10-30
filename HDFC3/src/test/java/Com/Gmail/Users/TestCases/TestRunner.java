package Com.Gmail.Users.TestCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\TourLogin.feature", glue = {
		"Com.Gmail.Users.StepDef",
		"Com.Gmail.Users.hooks" }, tags = "@TC4", plugin = { "pretty", "html:Reports/cucumber-reports.html" })
public class TestRunner {
}
