package practice.com;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingCart {

	static WebDriver driver;

	@BeforeTest
	public void login() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Development\\Target2024\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void dynamicdopdown(List arraylist) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		List<WebElement> product = driver.findElements(By.xpath("//div[@class=\"product\"]"));
		/*
		 * Code to create array for Expected lists By: Subhankar Roy 28-03-2024
		 */
		String[] itemsneeded = { "Cucumber", "Brocolli", "Potato","Beans" };

		// For Loop to check for itemsneeded
		for (int i = 0; i < product.size(); i++) {

			/*
			 * Code to separate out the Name from the long text By: Subhankar Roy 28-03-2024
			 */
			String[] name = product.get(i).getText().split("-");
			String productName = name[0].trim();
			
			List itemsneededlist=Arrays.asList(itemsneeded);

			if (itemsneededlist.contains(productName)) {

				System.out.println(productName);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

	// Close Browser
	@AfterTest
	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Browser Closed, Test Concluded!");
	}

}
