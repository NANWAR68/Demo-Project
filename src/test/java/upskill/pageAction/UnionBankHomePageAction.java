package upskill.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.UnionBankHomePageLocators;
import upskill.pageElements.UnionBankLocationSearchLocators;
import upskill.utilities.SetupDrivers;

public class UnionBankHomePageAction {
	
	UnionBankHomePageLocators UnionBankHomePageLocatorsObj;
	
	public UnionBankHomePageAction(){
		
	UnionBankHomePageLocatorsObj= new UnionBankHomePageLocators();
	
	PageFactory.initElements(SetupDrivers.driver,UnionBankHomePageLocatorsObj);
	
	}
	public void loadUnioBankpage() {

		SetupDrivers.driver.get("https://www.UnionBank.com");
	}
	
	public void mouseHoverUnionBank() throws InterruptedException{
		Actions actions = new Actions (SetupDrivers.driver);
		actions.moveToElement(UnionBankHomePageLocatorsObj.linkmousehoverPersonal);
        actions.perform();
        Thread.sleep(2000);
	}
	public void clickCheckingAccount(){
		UnionBankHomePageLocatorsObj.clickonCheckingAccounts.isEnabled();
//		UnionBankHomePageLocatorsObj.clickonCheckingAccounts.click();
	}
	

}
	
