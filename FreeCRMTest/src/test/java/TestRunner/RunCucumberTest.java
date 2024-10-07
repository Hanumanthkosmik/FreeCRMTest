package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/Features"},
		
		glue = {"StepDefinitions"},
		
		tags = {"Test1"},
		
		plugin = {"pretty","html:target/CucumberReports.html"}
		
		)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

	//this class will be used to run Cucumber tests with testNG
}
