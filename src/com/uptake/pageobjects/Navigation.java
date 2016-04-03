package com.uptake.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	private static WebElement element = null;

	public static WebElement lnkApproach(WebDriver driver) {
		element = driver.findElement(By.id("menu-item-4164"));
		return element;
	}

	public static WebElement lnkPlatform(WebDriver driver) {
		element = driver.findElement(By.id("menu-item-4163"));
		return element;
	}

	public static WebElement lnkSolutions(WebDriver driver) {
		element = driver.findElement(By.id("menu-item-4172"));
		return element;
	}

	public static WebElement lnkPeople(WebDriver driver) {
		element = driver.findElement(By.id("menu-item-4162"));
		return element;
	}

	public static WebElement lnkJoinUs(WebDriver driver) {
		element = driver.findElement(By.id("menu-item-4167"));
		return element;
	}

}
