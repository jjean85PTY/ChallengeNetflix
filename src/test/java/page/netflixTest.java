/*
 * @author: Jean Timothee
 * @email: jltimothee@gmail.com
 * 
 * Description: The class that contain the test
 * 
 */
package page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.cucumber.messages.internal.com.google.gson.annotations.Until;

import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;


public class netflixTest {
	
	private WebDriver driver;
	netflixPage NetflixPage;

	@Given("user is open Netflix home page")
	public void user_is_open_netflix_home_page() {
		
		NetflixPage = new netflixPage(driver);
		driver = NetflixPage.chromeDriverConnection();
		NetflixPage.visit("https://www.netflix.com/pa/");
	 
	}

	
	@SuppressWarnings("deprecation")
	@And("maximize the page")
	public void maximize_the_page() {
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			     
	}

	@SuppressWarnings("deprecation")
	@When("the page loaded")
	public void the_page_loaded() {
		System.out.println("NetflixPage is loading...");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	     
	}

	@Then("the title is print")
	public void the_title_is_print() {
		
		if (NetflixPage.checkTitle()) {
			System.out.println("The page title is: "+ driver.getTitle());
			
		} else {
			System.out.println("Page title is changed");
		}
		
	     
	}

	@And("the URL is print")
	public void the_url_is_print() {
		String getUrl = driver.getCurrentUrl();
		System.out.println("The page URL is: " +getUrl );
		
		WebElement page = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\" e8zpj0e1 default-ltr-cache-1lbapgz\"]")));
		// Print the first result
		System.out.println(page.isDisplayed());
		System.out.println("Test Done");
		driver.quit();
			
		}
}
