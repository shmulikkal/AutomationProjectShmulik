package automation;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class MainYahooMail {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = null;
		System.out.println("Starting Driver");
		//System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();		
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		


		//Compare between the actual and expected title using Assertion by JUNIT 5
		String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
		
        
		
		MailPage mail = new MailPage();
		mail.login(driver);
		
		NewsPage news = new NewsPage();
		news.read(driver);
		
		SportsPage sports = new SportsPage();
		sports.watch(driver);
		
	//Closing the driver
		//System.out.println("Closing the Driver");
		//driver.close();
    }
}
