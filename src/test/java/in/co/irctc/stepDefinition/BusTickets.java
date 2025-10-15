//package in.co.irctc.stepDefinition;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class BusTickets {
//	public static WebDriver driver ;
//	public static Wait wait;
//	
//	@Then("Validate")
//	public void validate() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
////
//	
//	
//	@When("User enters the from place {string}")
//	public void user_enters_the_from_place(String string) {
//		 WebElement from = driver.findElement(By.xpath("//label[text()='From']/preceding-sibling::p-autocomplete//input"));
//		    from.click();
//		    from.sendKeys(string);
//		    WebElement station = driver.findElement(By.xpath("//strong[text()='TAMIL NADU']/../parent::span[contains(text(),'"+string+"')]"));
//		    station.click();
//	}
//
//	@When("User enters the to place {string}")
//	public void user_enters_the_to_place(String string) {
//		 WebElement to = driver.findElement(By.xpath("//label[text()='To']/preceding-sibling::p-autocomplete//input"));
//		    to.click();
//		    to.sendKeys(string);
//		    WebElement station = driver.findElement(By.xpath("//strong[contains(text(),'NEW DELHI')]/parent::span[text()=' DELHI - DLI ']"));
//		    station.click();
//	}
//	@When("User enters the from place with one dim list")
//	public void user_enters_the_from_place_with_one_dim_list(DataTable dataTable) {
//	    List<String> list = dataTable.asList();
//	    String str = list.get(0);
//	   
//	}
//
//	@When("User enters the to place with one dim map")
//	public void user_enters_the_to_place_with_one_dim_map(DataTable dataTable) {
//		Map<String, String> map = dataTable.asMap(String.class, String.class);
//		String str = map.get("place2");
//		
//		
//	}
//
//	@When("User selects the future date")
//	public void user_selects_the_future_date() {
//		WebElement calendar = driver.findElement(By.xpath("//span[contains(@class,'calendar')]/input"));
//		calendar.click();
//	    WebElement date = driver.findElement(By.xpath("//a[text()='31']"));
//	    date.click();
//	}
//
//	@When("User selects first class from the dropdown")
//	public void user_selects_first_class_from_the_dropdown() {
//		WebElement allClasses = driver.findElement(By.xpath("//span[text()='All Classes']"));
//		allClasses.click();
//		WebElement  firstClass= driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']"));
//		firstClass.click();
//	}
//
//	@When("User selects the type of person")
//	public void user_selects_the_type_of_person() {
//		WebElement general= driver.findElement(By.xpath("//span[text()='GENERAL']"));
//		general.click();
//		WebElement  dutyPass= driver.findElement(By.xpath("//span[text()='DUTY PASS']"));
//		dutyPass.click();
//		WebElement  ok= driver.findElement(By.xpath("//span[text()='OK']"));
//		ok.click();
//	}
//
//	@When("User checks the flexible with date option")
//	public void user_checks_the_flexible_with_date_option() {
//		WebElement flexible = driver.findElement(By.xpath("//label[text()='Flexible With Date']/preceding-sibling::input/parent::span"));
//		flexible.click();
//		
//	}
//
//	@When("User clicks on Search button")
//	public void user_clicks_on_search_button() {
//		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
//		search.click();
//	}
//
//	@Then("Validate the available Trains")
//	public void validate_the_available_trains() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//}
