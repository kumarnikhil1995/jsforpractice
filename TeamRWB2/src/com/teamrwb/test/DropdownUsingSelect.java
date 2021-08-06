package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownUsingSelect {
	public WebDriver driver;

	@Test
	public void launch() throws InterruptedException {

		Select s;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);

		// date of birth
		WebElement day_element = driver.findElement(By.name("birthday_day"));
		s = new Select(day_element);
		s.selectByVisibleText("13");

	}

}
