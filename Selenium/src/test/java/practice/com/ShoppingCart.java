package practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void dynamicdopdown() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		List <WebElement> product=driver.findElements(By.xpath("//div[@class=\"product\"]"));
		
		for (int i=0;i<product.size();i++) {
			
			if (product.get(i).getText().contains("Cucumbe")) {
				
				System.out.println(product.get(i).getText()); 
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
			
			
			
		}
		
		
		

}
	
}
