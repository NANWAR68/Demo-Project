package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.UnionBankVideoLinkLocators;
import upskill.utilities.SetupDrivers;

public class UnionBankVideoLinkActions {

	UnionBankVideoLinkLocators UnionBankVideoLinkLocatorsObj;

	public UnionBankVideoLinkActions(){
		UnionBankVideoLinkLocatorsObj= new UnionBankVideoLinkLocators();
		
		
	PageFactory.initElements(SetupDrivers.driver, UnionBankVideoLinkLocatorsObj);
	}
	public void loadAssurantHomepage() {

		SetupDrivers.driver.get("https://www.UnionBank.com");
	}

	public void ClickVideoLink(){
		UnionBankVideoLinkLocatorsObj.clickVideoLink.click();
	
	}
}