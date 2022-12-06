package simple_code5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zillow {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zillow.com");
		driver.manage().window().maximize();
		
	
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://zillow.com");
		driver1.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.quit();
		driver1.quit();
		

	}

}
