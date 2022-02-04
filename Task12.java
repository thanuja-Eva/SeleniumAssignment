package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		driver.manage().window().maximize();

		

		driver.findElement(By.name("UserFirstName")).sendKeys("John");

		driver.findElement(By.name("UserLastName")).sendKeys("wick");

		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");

		driver.findElement(By.name("CompanyName")).sendKeys("GE");

		//driver.findElement(By.name("UserPhone")).sendKeys("admin@123");

		Select selJobTitle = new Select(driver.findElement(By.name("UserTitle")));
		selJobTitle.selectByIndex(1);
		
		Select selCompanyName = new Select(driver.findElement(By.name("CompanyEmployees")));
		selCompanyName.selectByIndex(1);
		
		Select selCompanyCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		selCompanyCountry.selectByIndex(2);
		
		driver.findElement(By.name("CompanyCountry")).click();
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/../div[3]")).click();

		
		
		String errorMessage=driver.findElement(By.xpath("//span[@id='UserPhone-WG7S-errMsg']")).getText();
				System.out.println(errorMessage);

	}

}
