package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
