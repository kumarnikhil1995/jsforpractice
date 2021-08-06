package com.teamrwb.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleofThePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.workmarket.com");

		String actualTitle = "WorkMarket, an ADP Company: The Leading Freelance Management System";
		String expectedTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);

	}

}
