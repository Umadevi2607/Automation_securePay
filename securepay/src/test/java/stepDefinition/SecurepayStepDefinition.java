package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SecurepayStepDefinition {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Open Google home page$")
	public void open_Google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedrive_version78\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	}

	@When("^Searches for SecurePay and go to SecurePay website$")
	public void searches_for_SecurePay_and_go_to_SecurePay_website() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("securepay" + Keys.ENTER);
		driver.findElement(By.className("sA5rQ")).click();
	}

	@When("^Navigates to the contact us page$")
	public void navigates_to_the_contact_us_page() throws Throwable {
	    driver.findElement(By.xpath("//*[@id='menu-item-126']/child::a")).click(); 
//	    Thread.sleep(5000);
	    
	}
	@When("^Verifies that the contact-us page is loaded$")
	public void verifies_that_the_contact_us_page_is_loaded() throws Throwable {
		   wait = new WebDriverWait(driver, 30);
		    WebElement elem = driver.findElement(By.name("first-name"));
		    wait.until(ExpectedConditions.visibilityOf(elem));
	}

	@When("^Generates random data using an open-source library and fill the form$")
	public void generates_random_data_using_an_open_source_library_and_fill_the_form() throws Throwable {
		 driver.findElement(By.name("first-name")).sendKeys(Utils.RandomUtils.fname);
		 driver.findElement(By.name("last-name")).sendKeys(Utils.RandomUtils.lname);
		 driver.findElement(By.name("email-address")).sendKeys(Utils.RandomUtils.email);
		 driver.findElement(By.name("phone-number")).sendKeys(Utils.RandomUtils.phone);
		 driver.findElement(By.name("website-url")).sendKeys("https://" + Utils.RandomUtils.website_URL + ".com");
		 driver.findElement(By.name("business-name")).sendKeys(Utils.RandomUtils.company);
		 WebElement dropdown = driver.findElement(By.name("reason-for-enquiry"));
		 Select select = new Select(dropdown);
		 select.selectByIndex(1);
		 driver.findElement(By.name("message")).sendKeys(Utils.RandomUtils.message);
		 driver.close();
		 
	}
}
