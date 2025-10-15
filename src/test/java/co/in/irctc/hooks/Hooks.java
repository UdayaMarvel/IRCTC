package co.in.irctc.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.co.irctc.utility.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends UtilityClass{
	UtilityClass utils = new UtilityClass();
	@Before
	public void browserStart(Scenario scenario) {
		utils.browserLaunch();
		final byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(input,"image/png");
	}
	
	@After
	public void browserQuit(Scenario scenario) {
		final byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(input,"image/png");
		utils.browserClose();
	}
}
