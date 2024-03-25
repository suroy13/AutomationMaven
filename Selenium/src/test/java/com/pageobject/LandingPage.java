package com.pageobject;

import org.openqa.selenium.By;

public class LandingPage {
	
	//logo
	public static final By landinglogo= By.xpath("//*[@id='nav-logo-sprites']") ;
	public static final By allMenu= By.xpath("//*[@id=\"nav-hamburger-menu\"]");
	public static final By catNameShop=By.xpath("//div[text()='Shop by Category']");

}
