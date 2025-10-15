package io.co.irctc.runner;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Workspace\\IRCTC\\src\\test\\resources",
					glue = {"in.co.irctc.stepDefinition", "co.in.irctc.hooks"},
					monochrome = true,
					dryRun = false,
					tags =  "@Buses",
					plugin = {"html:target", "json:target/report.json"}
		)
public class TestRunner {

}
//Maven Lifecycle
//Maven Goals
//Maven Clean - Clear the target folder
//Maven Test - It will the execute the test runner
//Maven Install - It will the execute the test runner and jar file 


//Resource and Compiler