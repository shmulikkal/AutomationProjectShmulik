package automation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
	
	public void read(WebDriver driver) throws InterruptedException {
		System.out.println("Starting News Page");

		Thread.sleep(10000);
		//Redirect to the News Page 
		driver.get("https://news.yahoo.com/");
		Thread.sleep(2000);
		//Pressing on the News link
		driver.findElement(By.linkText("NEWS")).click();	
		Thread.sleep(2000);
		
		//Pressing on the search bar
	    driver.findElement(By.id("ybar-sbq")).click();
		//Insert the search bar text
	    driver.findElement(By.id("ybar-sbq")).sendKeys("sdfghsdfhgh");
	    //clicking the search bar
	    driver.findElement(By.id("ybar-search")).click();
	    
	
	 String expectedTitle = "Yahoo News - Latest News & Headlines";
	 String actualTitle = driver.getTitle();
	 System.out.println(expectedTitle.equals(actualTitle)); // this will print the actual and expected title using Assertion by JUNIT 5
    Assert.assertEquals(actualTitle, expectedTitle);

	 if (expectedTitle.equals(actualTitle)) {
		 System.out.println("Titles In The News Page Match. Expected Title:\"Yahoo News - Latest News & Headlines" );
	 }else
	 {
		 System.out.println("Titles In The News Page Do Not Match. Expected Title: " + expectedTitle + ", Actual Title: " + actualTitle);
		    
	    
}
		 int count = 0;
		 int expectedLinks = 81;
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 System.out.println(link.size()); // this will print the number of links in a page.
		 count =  link.size();
		 
		
		 
		 
		 if(count==expectedLinks){
			 System.out.println("Number of links in the News page are correct " + count );
		 }else
		 {
			 System.out.println("Number of links in the News page are incorrect " + count + " vs "+expectedLinks);
				 }

		 
		 }

	}

	    


			 
		 
	
	


