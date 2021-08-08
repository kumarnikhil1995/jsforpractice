package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionPractice {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\git\\corejava\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// check whether that it is selected on not so it will return true
		Assert.assertFalse(driver.findElement(By.id("familyandfriend")).isSelected());
		System.out.print(driver.findElement(By.id("familyandfriend")).isSelected());
		driver.findElement(By.id("familyandfriend")).click();
		Assert.assertFalse(driver.findElement(By.id("familyandfriend")).isSelected());
		driver.findElement(By.id("familyandfriend")).click();
		Assert.assertTrue(driver.findElement(By.id("familyandfriend")).isSelected());

	}
}
