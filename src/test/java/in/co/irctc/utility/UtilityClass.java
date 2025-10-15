package in.co.irctc.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilityClass {
	public static WebDriver driver ;
	public static Wait wait;
	public static Actions action;
	public static JavascriptExecutor js;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\IRCTC\\src\\test\\resources\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   action = new Actions(driver);
		   js = (JavascriptExecutor)driver;
	}
	
	public void applicationLaunch(String url) {
		   driver.get(url);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void browserClose() {
		driver.quit();
	}
	
	public String retrieveText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public void switchToParentWindow(String parentWindow) {
		parentWindow = parentWindow();
		driver.switchTo().window(parentWindow);
	}
	
	public static String parentWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	
	public void childWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handles : windowHandles) {
			if(!handles.equals(parentWindow())) {
				driver.switchTo().window(handles);
			}
		}
	}
	
	public String retrieveAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	
	public List<WebElement> dropdownOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void sendText(WebElement element, String inputText) {
		element.sendKeys(inputText);
	}
	
	public void clickButton(WebElement element, int i) {
		action.click(element).build().perform();
	}
	
	public void clickButton(int i ,WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
	public void ss(String imageName)  {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("target/"+imageName+".png");
//		try {
////			FileUtils.copyFile(src, target);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
