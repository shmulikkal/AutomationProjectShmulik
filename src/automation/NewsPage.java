package automation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsPage {
		public void read(WebDriver driver) throws InterruptedException {
		System.out.println("Starting News Page");
		Thread.sleep(10000);
		
		//Redirect to the News Page 
				driver.get("https://news.yahoo.com/");
				Thread.sleep(2000);
		
		//Pressing on the News link
		WebElement linkNews = driver.findElement(By.linkText("NEWS"));	
		linkNews.click();
		Thread.sleep(2000);
		
		
		 int count = 0;
		 int expectedLinks = 81;
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 
		 //this will print the number of links in a page
		 System.out.println(link.size()); 
		 count =  link.size();
		 
				 
		 if(count==expectedLinks){
			 System.out.println("Number of links in the News page are correct " + count );
		 }else
		 {
			 System.out.println("Number of links in the News page are incorrect " + count + " vs "+expectedLinks);
				 }
		 
		 String expectedTitle = "Yahoo News - Latest News & Headlines";
		 String actualTitle = driver.getTitle();
		 
		 // this will print the actual and expected title using Assertion by JUNIT 5
		 
		 System.out.println(expectedTitle.equals(actualTitle));
	    Assert.assertEquals(actualTitle, expectedTitle);

		 if (expectedTitle.equals(actualTitle)) {
			 System.out.println("Titles In The News Page Match. Expected Title:\"Yahoo News - Latest News & Headlines" );
		 }else
		 {
			 System.out.println("Titles In The News Page Do Not Match. Expected Title: " + expectedTitle + ", Actual Title: " + actualTitle);
			 		 }
		
        driver.findElement(By.id("ybar-sbq")).click();
	    
		//Insert the search bar text
	    driver.findElement(By.id("ybar-sbq")).sendKeys("money");
	    
	    //clicking the search bar
	    driver.findElement(By.id("ybar-search")).click();
		Thread.sleep(4000);
		//Clicking to Open New Tab For Link Name: Investing 
		//driver.findElement(By.cssSelector("li:nth-child(2) .title > .d-ib")).click();
		//Thread.sleep(4000);
		

			 		 }

		}

 

	

	    


			 
		 
	
	


