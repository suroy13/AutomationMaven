package com.pageobject;

import org.openqa.selenium.By;

import com.dropdownpractice.DropdownPracticeTest;



public class Spicejet extends DropdownPracticeTest {
	
    // Drop down properties
	public static final By drpdnPassenger= By.xpath("//div[text()='Passengers']");
	public static final By drpdnCurrency= By.xpath("//div[contains(text(),'Currency')]");
	public static final By drpdnFromDestination= By.xpath("//div[text()='From']");
	public static final By drpdnToDestination= By.xpath("//div[text()='To']");
	public static final By drpdnNoOfPAX= By.xpath("//div[contains(text(),'Adult')]");
	// Increment Decrement Indicators
	public static final By incrementPassenger= By.xpath("//div[contains(@data-testid,'Adult-testID-plus-one-cta')]");
	public static final By decrementPassenger= By.xpath("//div[contains(@data-testid,'Adult-testID-minus-one-cta')]");
	//labels
	public static final By labelWelcome= By.xpath("//div[text()='Welcome aboard']");
	public static final By labelFlighDetailspage= By.xpath("//div[contains(text(),'Compare Fares')]");
	public static final By labelFamily= By.xpath("//div[text()='Family and Friends Discount Bookings']");
	
	//date calender
	public static final By currentDate=By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu");
	//radio button properties
	public static final By rdRoundTrip= By.xpath("//div[text()='round trip']");
	public static final By rdOneWay= By.xpath("//div[text()='one way']");
	public static final By radioFamilynFrnds=By.xpath("//div[text()='Family & Friends']");
	public static final By radioSeniorCitizen=By.xpath("//div[text()='Senior Citizen']");
	public static final By radioUnaccompaniedMinor=By.xpath("//div[text()='Unaccompanied Minor']");
	public static final By radioStudents=By.xpath("//div[text()='Students']");
	public static final By radioArmedForces=By.xpath("//div[text()='Armed Forces']");
	public static final By radioFamilynFrndsterms=By.xpath("//div[@class='css-1dbjc4n r-zso239']");
	
	// Button properties
	public static final By buttonSearchFlight=By.xpath("//div[@data-testid='home-page-flight-cta']");
	public static final By buttonContinue=By.xpath("//div[@class='css-1dbjc4n r-zso239']");
	
	
	
	
	
	
	

}

