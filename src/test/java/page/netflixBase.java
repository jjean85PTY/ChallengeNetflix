/*
 * @author: Jean Timothee
 * @email: jltimothee@gmail.com
 * 
 * Description: Base class that contains all method to be use
 * 
 */

package page;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class netflixBase {
	
	// Declare webdriver object
	
	private WebDriver driver;

	public netflixBase(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Method to initiate chrome drive
	public WebDriver chromeDriverConnection() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		return driver;
	}
	
	// Check if the page is displays
	public Boolean isDisplayed(By locator) {
		try {
			
			return driver.findElement(locator).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		
	}
	
	// Get page URL
	public void visit(String url) {
		driver.get(url);
	}
	

}
