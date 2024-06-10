package practice.com;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingCart {

	static WebDriver driver;

	@BeforeTest (groups= {"shoppingKart"})
	public void login() throws InterruptedException {
		String browser = "CHROME";
		switch (browser.toUpperCase()) {
		case "CHROME": {
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Development\\Target2024\\Drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "EDGE": {
			driver = new EdgeDriver();
			break;
		}
		case "FIREFOX": {
			driver = new FirefoxDriver();
			break;
		}
		default: {
			System.out.println("OPPS, No Driver Selected, You need To select atleast one Broswer!");
		}
		}
		System.out.println(browser + " Browser Launched for Test");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		
	
	}

	@Test (groups= {"shoppingKart"})
	public void dynamicdopdown() throws InterruptedException {
		System.out.println("Going for Page Title");
		System.out.println(driver.getTitle());
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		/*
		 * Code to create array for Expected lists By: Subhankar Roy 28-03-2024
		 */
		String[] itemsneeded = { "Cucumber", "Brocolli", "Potato","Beans" };
		
		int sizeofItemsintheArry= itemsneeded.length;
		System.out.println(sizeofItemsintheArry);
		int counter=0;
		// For Loop to check for itemsneeded
		for (int i = 0; i < product.size(); i++) {

			/*
			 * Code to separate out the Name from the long text By: Subhankar Roy 28-03-2024
			 */
			
			  String[] names = product.get(i).getText().split("-"); 
			  String productName =names [0].trim(); 
			  System.out.println("The extracted name of the vegies is: " + productName); 
			  List itemsneededlist=Arrays.asList(itemsneeded);
			 
			String  name = product.get(i).getText();
			//Thread.sleep(5000);
			
			if (itemsneededlist.contains(productName)) {

				counter++;
				System.out.println("The respective Vegie "+ productName +" selected, hence inside!");
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("	//div[@class=\"product-action\"]/button")).get(i).click();
			
				System.out.println(productName + ":  Add to Cart selected");
				if (counter==sizeofItemsintheArry)
					break;
				
			} 
		}
	}

	// Close Browser
	@AfterTest (groups= {"shoppingKart"})
	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Browser Closed, Test Concluded!");
	}

}
