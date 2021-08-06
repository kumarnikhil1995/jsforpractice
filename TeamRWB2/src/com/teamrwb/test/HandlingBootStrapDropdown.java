package com.teamrwb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootStrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://appium.io/docs/en/about-appium/intro/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
		List<WebElement> Menu_items = driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[1]/li/a"));
		for (int i = 0; i < Menu_items.size(); i++) {

			WebElement element = Menu_items.get(i);
			String ele = element.getAttribute("innerHTML");
			System.out.println(ele);
			if (ele.contentEquals("API Documentation")) {
				element.click();
				break;
			}
		}

	}

}
