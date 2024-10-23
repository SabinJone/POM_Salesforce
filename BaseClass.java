package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	
	public  ChromeOptions options;
	public  ChromeDriver driver;  //remove static for parallel execution
	
	@BeforeMethod
	public void preCondition() {
		 options= new ChromeOptions();
		options.addArguments("--disable-notifications");
	 driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}	
	@AfterMethod
	public void postCondition() {
		driver.close();
	
}
}