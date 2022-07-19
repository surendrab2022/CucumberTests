package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="resources", glue= "stepDefinitions", plugin = {"junit:target/output/cucumber.xml"})
public class CucumberTestNgRunner extends AbstractTestNGCucumberTests {
	
	


}