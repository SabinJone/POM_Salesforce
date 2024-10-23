package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class OppurtunityPage extends BaseClass {
	
	public OppurtunityPage(ChromeDriver driver) {  
		this.driver=driver;
	}

	public InformationPage clickonOppurtunityTab() {
		
		WebElement dd=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", dd);
		return new InformationPage(driver);
	}
}