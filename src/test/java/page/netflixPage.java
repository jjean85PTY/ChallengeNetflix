/*
 * @author: Jean Timothee
 * @email: jltimothee@gmail.com
 * 
 * Description: 
 * 
 */
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class netflixPage extends netflixBase {
	
	
	
	WebDriver driver;
	
	// Locator declaration
	
	By TitleLocator = By.xpath("//h1[@class=\"default-ltr-cache-19f4kxn e1yzhtxy7\"]");

	public netflixPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean checkTitle() {
		return isDisplayed(TitleLocator);
	}

}
