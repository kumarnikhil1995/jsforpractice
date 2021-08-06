package com.teamrwb.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		Select sel = new Select(driver.findElement(By.id("tools")));
		List<WebElement> list = sel.getOptions();
		List actualList = new ArrayList();
		for (WebElement abc : list) {
			String values = abc.getText();
			actualList.add(values);

		}
		Collections.sort(actualList);
		Assert.assertTrue(actualList.equals(list));

	}

}
