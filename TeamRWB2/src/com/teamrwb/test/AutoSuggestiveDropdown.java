package com.teamrwb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\git\\corejava\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> itmes = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for (int i = 1; i < itmes.size(); i++) {
			WebElement items_list = itmes.get(i);
			String items_value = items_list.getAttribute("innerHTML");
			if (items_value.equalsIgnoreCase("india")) {
				items_list.click();
			}
		}

	}

}
