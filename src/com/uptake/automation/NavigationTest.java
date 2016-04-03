package com.uptake.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uptake.pageobjects.Navigation;

public class NavigationTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.uptake.com");
		Navigation.lnkApproach(driver).click();
		Navigation.lnkPlatform(driver).click();
		Navigation.lnkSolutions(driver).click();
		Navigation.lnkPeople(driver).click();
		Navigation.lnkJoinUs(driver).click();
		driver.quit();
	}

}
