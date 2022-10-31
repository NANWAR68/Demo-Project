package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.UnionBankLocationInfoLocators;
import upskill.utilities.SetupDrivers;

public class UnionBankLocationInfoActions {

UnionBankLocationInfoLocators UnionBankLocationInfoLocatorsObj;
	
UnionBankLocationInfoActions(){
		
UnionBankLocationInfoLocatorsObj=new UnionBankLocationInfoLocators();
	
PageFactory.initElements(SetupDrivers.driver,UnionBankLocationInfoLocatorsObj);
}
public void clickCheckbox(){
	UnionBankLocationInfoLocatorsObj.ClickChkbx.click();

}
	}


