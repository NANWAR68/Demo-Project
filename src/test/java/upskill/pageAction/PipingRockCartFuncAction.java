package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.PipingRockCartFunctionalityLocators;
import upskill.utilities.SetupDrivers;

public class PipingRockCartFuncAction {
	
	
	PipingRockCartFunctionalityLocators PipingRockCartFunctionalityLocatorsObj;
	
	public void PipingRockCartFunctionalityLocators(){
		
		PipingRockCartFunctionalityLocatorsObj= new PipingRockCartFunctionalityLocators();
		
		PageFactory.initElements(SetupDrivers.driver,PipingRockCartFunctionalityLocatorsObj);
	}
	
//public void loadPipingrockHomepage(){
		
//		SetupDriver.driver.get("https://www.Pipingrock.com/");
//}
	
	
	public void ClickonVitamins(){
		PipingRockCartFunctionalityLocatorsObj.btnSearch.click();	
	}
}
	
	