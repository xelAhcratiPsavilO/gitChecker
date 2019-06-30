package gitChecker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Driver object for Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Driver actions
		
		driver.get("https://github.com");

	}

}
