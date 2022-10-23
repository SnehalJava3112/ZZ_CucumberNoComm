package ZAB_Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/java/ZAB_features/ZAB_Login.feature", // feature file path
		glue = "ZAB_Steps",									     // step defination
		dryRun = true,									     // mapping step def with login.feature. true-> code not running,
															   	 // false (default) -> code running and giving missing method if any
		stepNotifications = true,						  	   	 // step wise result status (false)
		monochrome = true									 // clean report for console only (true) 
		//tags = "Snehal_1"	// tangs = "tag1" and "tag2"		 // select particuler tag to run
		)

public class ZAB_Test_Runner { }