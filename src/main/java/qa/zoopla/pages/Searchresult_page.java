/**
 * 
 */
package qa.zoopla.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author fiaz.hassan
 *
 */
public class Searchresult_page {
	WebDriver driver=null;
	ResourceBundle search_result;
	String ABC=null;
	ArrayList<String> arraylist = new ArrayList<String>();
	
	public Searchresult_page(WebDriver driver) {
		this.driver=driver;
		search_result=ResourceBundle.getBundle("searchResultsPropertyPage");
	}
	public void getpropertiesAndSelect()
	{
		WebElement properties=driver.findElement(By.xpath(search_result.getString("Properties_list")));
		List<WebElement> properties_list=properties.findElements(By.tagName("li"));
		selectedvalues(properties_list,"/li[1]/div/div[2]/span");
		/*
		 * for(int i=1;i<properties_list.size();i++) { try {
		 * ABC=properties_list.get(i).findElement(By.xpath(search_result.getString(
		 * "Properties_list")+"/li["+i+"]/div/div[2]/a")).getText(); String
		 * fromFunc=getSubstring(ABC); // arraylist.add(fromFunc); } catch(Exception e)
		 * {
		 * 
		 * } } decending(arraylist);
		 */

	}
	public void selectedvalues(List<WebElement> list, String xpath)
	{
		list.get(1).findElement(By.xpath(search_result.getString("Properties_list")+xpath)).click();
	}
	//function for taking a Substring from a String
	public String getSubstring(String a)  
	{
		int size=a.length();

		String str="";
		for(int i=1;i<size;i++) {
			if(a.charAt(i)==' ')
			{
				break;
			}                             
			str=str+a.charAt(i);
		}
		return str;
	}
	//function to write values in descending order
	public void decending(ArrayList<String> list)
	{
		Collections.sort(list, Collections.reverseOrder());
		//for(String num: list){
			//System.out.println(num);

		//}

	}
}

