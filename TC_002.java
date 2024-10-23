package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass{
	
	@Test
	public void runner() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername( )
		.enterPassword()
		.clilckonLogin()
		.clickonAppLauncher()
		.clickonViewAll()
		.clickonSales()
		.clickonOppurtunityTab()
		.clickonNew()
		.enterOppurtunityname()
		.enterAmount()
		.chooseDate()
		.selectStage()
		.clickonSave()
		.verify();
	}

}