package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class InformationPage extends BaseClass {

	public InformationPage(ChromeDriver driver) {  
		this.driver=driver;
	}
	
	public InformationPage clickonNew() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	return this;
	
	}
	
	public InformationPage enterOppurtunityname() {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sales Automation by Sabin Jone");
		return this;
	}
	
	public InformationPage enterAmount() {
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		return this;
}
	
	public InformationPage chooseDate() {
	
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//button[text()='Today']")).click();
		return this;
		
	}
	
	
	public InformationPage selectStage() {
	
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		return this;
		
	}
		public VerifyPage clickonSave() {
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();	
			return new VerifyPage(driver);
		}

	
		
	}	




	
	
