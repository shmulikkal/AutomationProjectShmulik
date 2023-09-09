package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SportsPage {
	public void watch(WebDriver driver) throws InterruptedException {
		System.out.println("Starting Sports Page");
		
		driver.get("https://news.yahoo.com/");
		
		WebElement linkSports = driver.findElement(By.linkText("SPORTS"));	
		linkSports.click();
		Thread.sleep(2000);
		
		 // Define the text you're looking for
        String searchText = "Fantasy Football";

        // Find all anchor elements with the tag name "a"
        java.util.List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        // Initialize a counter for matching links
        int linkCount = 0;
		int expectedLinks = 3;


        // Iterate through the links and count those containing the text
        for (WebElement link : linkElements) {
            String linkText = link.getText();
            if (linkText != null && linkText.contains(searchText)) {
                linkCount++;
                if(linkCount==expectedLinks){
       			 System.out.println("Number of links with the word \"Fantasy Football\" are correct " + linkCount );
       		 }else
       		 {
       			 System.out.println("Number of links with the word \\\"Fantasy Football\\\" are incorrect " + linkCount + " vs "+expectedLinks);
       				 }
            }
        }

        // Print the count of links
        System.out.println("Number of links containing the text '" + searchText + "': " + linkCount);
        
         //Returns to the mail page
		 driver.findElement(By.id("ybarMailLink")).click();
		 System.out.println("Returns to the mail page");
			
	}	
		
}
