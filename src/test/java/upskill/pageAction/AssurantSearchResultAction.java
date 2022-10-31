package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.AssurantSearchResultLocator;
import upskill.utilities.SetupDrivers;

public class AssurantSearchResultAction {

	AssurantSearchResultLocator SearchResultLocatorObj;

	public AssurantSearchResultAction() {

		SearchResultLocatorObj = new AssurantSearchResultLocator();
		PageFactory.initElements(SetupDrivers.driver, SearchResultLocatorObj);
		//public void AssurantSearchResultAction(){
			
//			SetupDriver.driver.get("https://www.assurant.com/");
				
			}
	
public void verifyFianancialInformation(){
	
	SearchResultLocatorObj.txtFinancialServicesAssurant.isDisplayed();
	
	
}




}
