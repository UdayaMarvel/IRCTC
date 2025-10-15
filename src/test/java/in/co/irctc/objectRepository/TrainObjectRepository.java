package in.co.irctc.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import in.co.irctc.utility.UtilityClass;

public class TrainObjectRepository extends UtilityClass {

	public TrainObjectRepository() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[text()='From']/preceding-sibling::p-autocomplete//input")
	private WebElement from;
	
	public WebElement getFrom() {
		return from;
	}

	public WebElement getStation() {
		return station;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getToStation() {
		return toStation;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getAllClasses() {
		return allClasses;
	}

	public WebElement getAcFirstClass() {
		return acFirstClass;
	}

	public WebElement getGeneral() {
		return general;
	}

	public WebElement getDutyPass() {
		return dutyPass;
	}

	public WebElement getOk() {
		return ok;
	}

	public WebElement getFlexible() {
		return flexible;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public List<WebElement> getList(){
		return list;
	}
	
	@FindBys({@FindBy(className = "vuln"), @FindBy(xpath ="//a[@href='https://www.cve.org/CVERecord?id=CVE-2024-31573']")})
	private WebElement vuln;
	
	@FindAll({@FindBy(className = "vuln"), @FindBy(xpath ="//a[@href='https://www.cve.org/CVERecord?id=CVE-2024-31573']")})
	private WebElement vuln1;

	@FindBy(xpath = "//strong[text()='TAMIL NADU']/../parent::span[contains(text(),'")
	private WebElement station;
	
	@FindBy(xpath = "//strong[text()='TAMIL NADU']/../parent::span")
	private List<WebElement> list;
	
	@FindBy(xpath = "//label[text()='To']/preceding-sibling::p-autocomplete//input")
	private WebElement to;
	
	@FindBy(xpath = "//strong[contains(text(),'NEW DELHI')]/parent::span[text()=' DELHI - DLI ']")
	private WebElement toStation;
	
	@FindBy(xpath = "//span[contains(@class,'calendar')]/input")
	private WebElement calendar;
	
	@FindBy(xpath = "//a[text()='31']")
	private WebElement date;
	
	@FindBy(xpath = "//span[text()='All Classes']")
	private WebElement allClasses;
	
	@FindBy(xpath = "//span[text()='AC First Class (1A) ']")
	private WebElement acFirstClass;
	
	@FindBy(xpath = "//span[text()='GENERAL']")
	private WebElement general;
	
	@FindBy(xpath = "//span[text()='DUTY PASS']")
	private WebElement dutyPass;
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement ok;
	
	@FindBy(xpath = "//label[text()='Flexible With Date']/preceding-sibling::input/parent::span")
	private WebElement flexible;
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement search;
}
