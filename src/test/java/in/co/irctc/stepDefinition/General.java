package in.co.irctc.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.co.irctc.utility.UtilityClass;
import io.cucumber.java.en.Given;

public class General extends UtilityClass{
	UtilityClass utils = new UtilityClass();
	@Given("Launch the IRCTC application {string}")
	public void launch_the_irctc_application(String string) {
		   utils.applicationLaunch(string);
		   WebElement closeAlert = driver.findElement(By.xpath("//button[@type='submit' and contains(@aria-label,'Confirmation')]"));
//		   closeAlert.click();
		   utils.clickButton(closeAlert);
		   try {
//		   WebElement loginClose = driver.findElement(By.xpath("//a[contains(@class,'loginCloseBtn')]"));
//		   wait.until(ExpectedConditions.elementToBeClickable(loginClose));
//		   loginClose.click();
		   }
		   catch (Exception e) {
			e.printStackTrace();
		}
	}
}
