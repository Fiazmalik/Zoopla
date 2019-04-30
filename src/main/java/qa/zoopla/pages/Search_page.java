/**
 * 
 */
package qa.zoopla.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author fiaz.hassan
 *
 */
public class Search_page {
	WebDriver driver=null; 
	ResourceBundle search_resource;
	public Search_page(WebDriver driver) {
		this.driver= driver;
		search_resource=ResourceBundle.getBundle("searchPage");
	}
	public void EnterSearchvalue(String search_value) {
		
		driver.findElement(By.xpath(search_resource.getString("Search_bar"))).sendKeys(search_value);
	}
	public void Search_buttonClick()
	{
		driver.findElement(By.xpath(search_resource.getString("Search_button"))).click();
	}
}
