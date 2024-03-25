import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
//https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		System.out.println(driver.getTitle());

		
		  System.out.println("Collect the Dropdown value in an Arraylist"); 
		  WebElement
		  testlable = driver.findElement(By.xpath(
		  "//div[@class='information closable']")); 
		  String valuetest=testlable.getText();
		  System.out.println(valuetest);
		  WebElement
		  country = driver.findElement(By.xpath(
		  "//option[text()='Afghanistan']/parent::select")); 
			/*
			 * country = driver.findElement(By.xpath(
			 * "//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
			 */
		  List<WebElement>
		  countrylist = country.findElements(By.tagName("option")); String
		  expectedCounty = "India";
		  
		  
			
			  for (WebElement option : countrylist) {
			  
			  String Values = option.getText().trim(); if (expectedCounty.equals(Values)) {
			  System.out.println("Welcome to India");
			  
			  break; } else { System.out.println("No Match Found!");
			  
			  }
			  
			  }
			 
		 

		driver.quit();
		// TODO Auto-generated method stub

	}

}
