package com.ha.seleniumconcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("http://demo.openemr.io/b/openemr/");

		driver.manage().window().maximize();

		driver.findElement(By.name("authUser")).sendKeys("admin");
		driver.findElement(By.name("clearPass")).sendKeys("pass");
		Select selLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button/i")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Patient/Client')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Patients')]")).click();
		
		
		 driver.switchTo().frame(driver.findElement(By.name("fin")));
		 
		  driver.findElement(By.xpath("//button[contains(text(),'Add New Patient')]")).click();
		  
		  List<String> windows=new ArrayList<String>(driver.getWindowHandles());
			System.out.println(windows.get(0));
			
		driver.switchTo().window(windows.get(0));
		
		  
		  driver.switchTo().frame(driver.findElement(By.name("pat")));
		  
		  Select selectTitle = new Select(driver.findElement(By.name("form_title")));
		  selectTitle.selectByIndex(1);
		  
		 
		  
		  driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("james");
		  driver.findElement(By.xpath("//input[@title='Middle Name']")).sendKeys("mid");
		  driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Cam");
		  
		  DateFormat dateformat=new SimpleDateFormat("yyyy-mm-dd");
		  Date date=new Date();
		  
		  String date1=dateformat.format(date);
		  
		  System.out.println(date1);
		  
		  
		  //driver.findElement(By.id("//input[@id='form_DOB']")).sendKeys(date1);
		  
		  driver.findElement(By.id("form_DOB")).sendKeys("2021-12-06");
		  
		  Select selectGender = new Select(driver.findElement(By.name("form_sex")));
		  selectGender.selectByIndex(1);
		  
		driver.findElement(By.xpath("//button[@value='Create New Patient']")).click();
		
		 List<String> windows1=new ArrayList<String>(driver.getWindowHandles());
			System.out.println(windows1.get(0));
			
		driver.switchTo().window(windows1.get(0));
		
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-100 h-100 modalIframe']")));
		
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		
		String alertMsg=driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		
		driver.switchTo().alert().accept();
		  
			
			
		  
		  
		 

	}

}
