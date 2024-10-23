package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver) {  
		this.driver=driver;
	}
	

	public HomePage clickonAppLauncher() {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
		
	}
	
	public HomePage clickonViewAll() {
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		return this;
	}
	
	public OppurtunityPage clickonSales() {
		WebElement az=driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", az);
		return new OppurtunityPage(driver);
				
	}
}
