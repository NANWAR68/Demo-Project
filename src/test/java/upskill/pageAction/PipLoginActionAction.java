package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.PipLoginActionActionLocator;
import upskill.utilities.SetupDrivers;

public class PipLoginActionAction {

	
	PipLoginActionActionLocator PipLoginActionResultLocatorObj;
	
	
	PipLoginActionAction(){
		
		PipLoginActionResultLocatorObj=new PipLoginActionActionLocator();
		PageFactory.initElements(SetupDrivers.driver, PipLoginActionResultLocatorObj);
	}
	
      public void loadPipingrockHomepage(){
		
		SetupDrivers.driver.get("https://www.Pipingrock.com/");
}
		public void PipLoginActionResult(){
			PipLoginActionResultLocatorObj.txtWelcome.isDisplayed();
		
	
		
		
	}
}
