/**
 * 
 */
package qa.zoopla.testrunner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
 * @author fiaz.hassan
 *
 */
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/zoopla/resources/Features", glue= {"qa.zoopla.tests"},
monochrome=true,
tags= {"@Smoke"})

public class TestRunner_zoopla extends AbstractTestNGCucumberTests   { 
	
}
