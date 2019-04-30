/**
 * 
 */
package qa.zoopla.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;
import qa.zoopla.base.BrowserConfigure;
import qa.zoopla.pages.*;
import qa.zoopla.assertions.Compare;
/**
 * @author fiaz.hassan
 *
 */
public class SearchTest_zoopla {
	
	BrowserConfigure browser=new BrowserConfigure();
	WebDriver Test_driver=null;
	Search_page search;
	Searchresult_page searchResult;
	

	@Given("^user is already on searching page$")
	public void user_is_already_on_searching_page() throws Throwable {
		Test_driver=browser.getBrowserinstanse();
		search=new Search_page(Test_driver);
	}

	@When("^User enter a searching value in search field$")
	public void user_enter_a_searching_value_in_search_field() throws Throwable {
		search.EnterSearchvalue("London");
	}

	@When("^User click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		search.Search_buttonClick();
	}

	@When("^User should see all properties list$")
	public void user_should_see_all_properties_list() throws Throwable {
		Assert.assertTrue(Compare.validateURL(Test_driver, "www.zoopla.co.uk/for-sale/property/london"));
		
		//browser.tear_down(Test_driver);
	}

	@When("^User does't enter a searching value in search field$")
	public void user_does_t_enter_a_searching_value_in_search_field() throws Throwable {
	Assert.assertTrue(Compare.validate_webElement(Test_driver, "//input[@id='search-input-location']"));
	}

	@Then("^User should not see all properties list$")
	public void user_should_not_see_all_properties_list() throws Throwable {
		
		Assert.assertTrue(Compare.validateURL(Test_driver, "https://www.zoopla.co.uk"));

	}
	@When("^user clicks on some proeprty$")
	public void user_clicks_on_some_proeprty() throws Throwable {
		searchResult= new Searchresult_page(Test_driver);
		searchResult.getpropertiesAndSelect();
		
	}

	@Then("^user should navigate to next page to see all details$")
	public void user_should_navigate_to_next_page_to_see_all_details() throws Throwable {
		
		Assert.assertTrue(Compare.validateURL(Test_driver, "https://www.zoopla.co.uk"));
		browser.tear_down(Test_driver);
	}



}
