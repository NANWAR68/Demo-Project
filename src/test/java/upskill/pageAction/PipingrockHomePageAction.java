package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.PipingrockHomePageLocators;

import upskill.utilities.SetupDrivers;

public class PipingrockHomePageAction {

	PipingrockHomePageLocators PipingrockHomePageLocatorsObj;

	public PipingrockHomePageAction() {

		PipingrockHomePageLocatorsObj = new PipingrockHomePageLocators();

		PageFactory.initElements(SetupDrivers.driver, PipingrockHomePageLocatorsObj);
	}
	public void loadPipingrockHomepage(){
			
	 SetupDrivers.driver.get("https://www.Pipingrock.com/");
		
	}
	public void ClickonSearchBox() throws Exception{
		Thread.sleep(2000);
		PipingrockHomePageLocatorsObj.txtbxSearch.click();
	}
	
public void SearchMensVitamins() throws Exception {
	Thread.sleep(2000);
	PipingrockHomePageLocatorsObj.txtbxSearch.sendKeys("Men's Vitamins");
}
	public void ClickonSearchButton() throws Exception{	
		Thread.sleep(3000);
	PipingrockHomePageLocatorsObj.btnClick.submit();
	
	}







}
