package com.teamrwb.test;

import java.util.Scanner;

public class RWBLogin {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the browser name on which you want to test:");
		String browserName = sc.nextLine();
		System.out.print("Please enter the URL:");
		String URI = sc.nextLine();

		RWBRegister obj1 = new RWBRegister();
		obj1.BrowserSetup(browserName, URI);
		Thread.sleep(3000);

		Thread.sleep(3000);
		obj1.CloseBrowser();
	}

}
