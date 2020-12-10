package testrunner.com;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features= "Cucubmer1 Feature",
	glue=  "stepdefination.com"
	
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
