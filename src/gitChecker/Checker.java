package gitChecker;

import org.openqa.selenium.By;
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
		
		Credentials credentials = new Credentials();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.id("login_field")).sendKeys(credentials.USERNAME);
		driver.findElement(By.id("password")).sendKeys(credentials.PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[4]")).click();

	}

}
