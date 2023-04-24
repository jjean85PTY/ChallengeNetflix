/*
 * @author: Jean Timothee
 * @email: jltimothee@gmail.com
 * 
 * Description: Test runner
 * 
 */
package page;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/netflix.feature",
glue= {"page"},
monochrome = true,
plugin = {"json:target/cucumber.json"})

public class TestRunnerNetflix {
	
	

}

