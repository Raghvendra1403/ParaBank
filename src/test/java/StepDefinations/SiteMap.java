package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteMap {
	
	WebDriver driver;
	
	@Given("we are on SiteMap page")
	public void we_are_on_site_map_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("https://parabank.parasoft.com/parabank/sitemap.htm");
	    Thread.sleep(20000);
	   

}
	@Then("close the tab")
	public void close_the_tab() {
		driver.close();
	    driver.quit();

}
}