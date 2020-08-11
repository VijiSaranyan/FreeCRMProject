package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
	@CucumberOptions
	(		//features="src/test/resources/Features/phpAPi.feature",
				//features="src/test/resources/Features/Scenariooutline.feature",
				features="src/test/resources/Features/Reusable.feature",

			glue = {"com.StepDefinition"}
	)
	public class TestRunner {

}
