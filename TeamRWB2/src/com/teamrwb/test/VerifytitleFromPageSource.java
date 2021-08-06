package com.teamrwb.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytitleFromPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		boolean status = driver.getPageSource().contains("CRM Web Based Enterprise Solution | OrangeCRM");
		System.out.println(status);
	}

}
