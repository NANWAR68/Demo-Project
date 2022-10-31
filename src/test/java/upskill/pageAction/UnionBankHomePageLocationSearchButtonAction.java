package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.UnionBankHomePageLocationButtonLocators;
import upskill.pageElements.UnionBankLocationSearchLocators;
import upskill.utilities.SetupDrivers;

public class UnionBankHomePageLocationSearchButtonAction {
	UnionBankHomePageLocationButtonLocators	UnionBankHomePageLocationButtonLocatorsObj;

	public UnionBankHomePageLocationSearchButtonAction (){
	
		UnionBankHomePageLocationButtonLocatorsObj= new UnionBankHomePageLocationButtonLocators();
	
	
PageFactory.initElements(SetupDrivers.driver,UnionBankHomePageLocationButtonLocatorsObj);
	}
		
		public void clickonLocationsButton() throws Exception{
			Thread.sleep(3000);
	UnionBankHomePageLocationButtonLocatorsObj.clickonLocationsBtn.click();
		
	}
	



}
