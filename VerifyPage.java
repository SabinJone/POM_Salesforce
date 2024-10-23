package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class VerifyPage extends BaseClass {

	public VerifyPage(ChromeDriver driver) {  
		this.driver=driver;
	}

	
	public VerifyPage verify() {
		
		String verify=driver.findElement(By.partialLinkText("Sabin Jone")).getText();
		if(verify.contains("Sabin Jone"))
		{
			System.out.println("Name verified successfully");
		}
		else
		{
			System.out.println("Name Not Found");
		}	
		
		return this;
	}
}
