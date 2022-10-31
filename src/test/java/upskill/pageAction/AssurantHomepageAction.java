package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.AssurantHomePageLocators;
import upskill.utilities.SetupDrivers;

public class AssurantHomepageAction {

	AssurantHomePageLocators HomePageLocatorsObj;

	public AssurantHomepageAction() {

		HomePageLocatorsObj = new AssurantHomePageLocators();

		PageFactory.initElements(SetupDrivers.driver, HomePageLocatorsObj);

	}

	public void loadAssurantHomepage() {

		SetupDrivers.driver.get("https://www.assurant.com");

	}
public void ClickonSearchButton() throws Exception{	
	Thread.sleep(3000);
	HomePageLocatorsObj.btnSearch.click();
	}
	
	
public void SearchFinancialService() throws Exception{	
	                     Thread.sleep(3000);
			HomePageLocatorsObj.txtbxSearch.sendKeys("Financial Service");
		
	}
     public void ClickonSearchButton2() throws Exception{	
	Thread.sleep(3000);
	HomePageLocatorsObj.btnSearch.click();
	
//	test change
	
	}
}
