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
		
		// Send login credentials
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.id("login_field")).sendKeys(credentials.USERNAME);
		driver.findElement(By.id("password")).sendKeys(credentials.PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[4]")).click();
		// Select user
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/summary/img")).click();
		// Access repos
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/details-menu/a[2]")).click();
		// Select repo
		driver.findElement(By.xpath("//*[@id=\"user-repositories-list\"]/ul/li[2]/div[1]/div[1]/h3/a")).click();
		// Select file
		driver.findElement(By.id("f71af404dd1483bdb87d90042bb3895e-b2c7577559cd39f4fa4e05b73ee875391d404dc7")).click();
		// Click edit
//		driver.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/form[1]/button")).click();
		driver.findElement(By.cssSelector("html body.logged-out.env-production.emoji-size-boost.page-responsive.page-blob div.application-main div main div.container-lg.new-discussion-timeline.experiment-repo-nav.p-responsive div.repository-content div.Box.mt-3.position-relative div.Box-header.py-2.d-flex.flex-column.flex-shrink-0.flex-md-row.flex-md-items-center div.d-flex.py-1.py-md-0.flex-auto.flex-order-1.flex-md-order-2.flex-sm-grow-0.flex-justify-between div button.btn-octicon.tooltipped.tooltipped-nw")).click();
//		driver.findElement(By.xpath("//*[@id=\"new_blob\"]/div[3]/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div[2]/pre")).sendKeys(" ");
//		driver.findElement(By.id("commit-summary-input")).sendKeys("Update OOP.md");
//		driver.findElement(By.id("submit-file")).click();
//		driver.quit();

	}

}
