package in.co.irctc.stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.co.irctc.objectRepository.TrainObjectRepository;
import in.co.irctc.utility.UtilityClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainTickets extends UtilityClass {
	UtilityClass utils = new UtilityClass();
	TrainObjectRepository tlocator = new TrainObjectRepository();
	
	
	@When("User enters the from place {string}")
	public void user_enters_the_from_place(String string) {
		    utils.clickButton(tlocator.getFrom());
		    utils.sendText(tlocator.getFrom(), string);
//		    utils.clickButton(tlocator.getStation());
	}

	@When("User enters the to place {string}")
	public void user_enters_the_to_place(String string) {
		
		 utils.clickButton(tlocator.getTo());
		 utils.sendText(tlocator.getTo(), string);
		  utils.clickButton(0, tlocator.getToStation());
		    utils.ss("to");
	}
	@When("User enters the from place with one dim list")
	public void user_enters_the_from_place_with_one_dim_list(DataTable dataTable) {
	    List<String> list = dataTable.asList();
	    String str = list.get(0);
	   
	}

	@When("User enters the to place with one dim map")
	public void user_enters_the_to_place_with_one_dim_map(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		String str = map.get("place2");
		
		
	}

	@When("User selects the future date")
	public void user_selects_the_future_date() {
		utils.clickButton(tlocator.getCalendar());
		utils.clickButton(tlocator.getDate());
	    utils.ss("FutureDate");
	}

	@When("User selects first class from the dropdown")
	public void user_selects_first_class_from_the_dropdown() {
		utils.clickButton(tlocator.getAllClasses());
		utils.clickButton(tlocator.getAcFirstClass());
	    utils.ss("FirstClass");
	}

	@When("User selects the type of person")
	public void user_selects_the_type_of_person() {
		utils.clickButton(tlocator.getGeneral());
		utils.clickButton(tlocator.getDutyPass());
		utils.clickButton(tlocator.getOk());
	    utils.ss("person");
	}

	@When("User checks the flexible with date option")
	public void user_checks_the_flexible_with_date_option() {
		utils.clickButton(tlocator.getFlexible());
		
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {

		String text = utils.retrieveText(tlocator.getSearch());
		utils.clickButton(tlocator.getSearch());
	}

	@Then("Validate the available Trains")
	public void validate_the_available_trains() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
