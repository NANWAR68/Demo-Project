package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.PipHomePageForLoginLocators;
import upskill.utilities.SetupDrivers;

public class PipHomePageForLoginAction {

	PipHomePageForLoginLocators PipHomePageForLoginLocatorsObj;

	public PipHomePageForLoginAction() {

		PipHomePageForLoginLocatorsObj = new PipHomePageForLoginLocators();

		PageFactory.initElements(SetupDrivers.driver, PipHomePageForLoginLocatorsObj);

	}
	public void loadPipingrockHomepage(){
		
		 SetupDrivers.driver.get("https://www.Pipingrock.com/");
	}
	
	

	public void ClickOnMyAccount() throws Exception {
		Thread.sleep(2000);
		PipHomePageForLoginLocatorsObj.btnClick.click();
	}
}
