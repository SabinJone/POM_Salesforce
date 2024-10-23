package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	//create own constructor call for this class
	//public ClassName(RemoteWebdriver driver)- cross browser testing
	public LoginPage(ChromeDriver driver) {  
		this.driver=driver;
	}
	

	public LoginPage enterUsername( ) {
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		return this;
	}
	
	
	public LoginPage enterPassword( ) {
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		return this;
	}
	
	public  HomePage clilckonLogin() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		return new HomePage(driver);
		
		
		
}
	
}
