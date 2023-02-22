package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {
	
	WebDriver driver;
	
	@Given("we are on Contact Us page")
	public void we_are_on_contact_us_page() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("https://parabank.parasoft.com/parabank/contact.htm");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@Then("verify and close window")
	public void verify_and_close_window() {
	    driver.close();
	    driver.quit();
	}

		 
	@When("user enters data in name field")
	public void user_enters_data_in_name_field() {
	     driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ajay");
	}

	@When("user enters data in email field")
	public void user_enters_data_in_email_field() {
	     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ajay@gmail.com");
	}

	@When("user enters data in phone field")
	public void user_enters_data_in_phone_field() {
	     driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8231860834");
	}

	@When("user enters data in message field")
	public void user_enters_data_in_message_field() {
		 driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Any");
	}

	@When("click on submit to customer care button")
	public void click_on_submit_to_customer_care_button() {
		 driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
		
	}

	@Then("message should be sent successfully")
	public void message_should_be_sent_successfully() {
		


}  
	@When("user enters alphabets data in phone field")
	public void user_enters_alphabets_data_in_phone_field() {
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("Alphabets");
}
	@When("entering wrong emailid")
	public void entering_wrong_emailid() {
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("12348751");
}
}