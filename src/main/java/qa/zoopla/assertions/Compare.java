/**
 * 
 */
package qa.zoopla.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author fiaz.hassan
 *
 */
public class Compare {

	
	public static boolean validateURL(WebDriver driver, String expected_url)
	{
		String Actuall_url=driver.getCurrentUrl();
		boolean result=false;
		if(Actuall_url.contains(expected_url)) {
			result=true;
			
		}
		return result;
		}
	public static boolean validate_webElement(WebDriver driver, String xpath)
	{
		
		boolean result=false;
		if(driver.findElement(By.xpath(xpath)).isDisplayed()){
			result=true;
		}
		return result;
	}
}
