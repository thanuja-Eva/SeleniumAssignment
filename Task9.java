package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("https://nasscom.in/");

		driver.findElement(By.partialLinkText("New User")).click();

		driver.findElement(By.name("field_fname_reg")).sendKeys("admin");
		driver.findElement(By.name("field_lname")).sendKeys("pass");
		driver.findElement(By.name("mail")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("field_company_name_registration")).sendKeys("Google");
		Select selCompanyName = new Select(driver.findElement(By.name("field_business_focus_reg")));
		selCompanyName.selectByIndex(1);

		driver.findElement(By.name("op")).click();

		driver.close();

		/*
		 * driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		 * 
		 * driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//frame[@name='login_page']")));
		 * 
		 * driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys(
		 * "789788");
		 * 
		 * driver.findElement(By.linkText("CONTINUE")).click();
		 */

	}

}
