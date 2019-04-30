/**
 * 
 */
package qa.zoopla.base;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author fiaz.hassan
 *
 */
public class BrowserConfigure {

	ResourceBundle resource;
	WebDriver driver=null;
	public WebDriver getBrowserinstanse()
	{
		resource=ResourceBundle.getBundle("config", Locale.US);
		if(resource.getString("browser").equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(resource.getString("browser").equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(resource.getString("browser").equals("ie")) {

			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(resource.getString("baseURL"));
		
		return driver;
	}
	
	public void tear_down(WebDriver driver) {
		
		driver.close();
	} 
}
