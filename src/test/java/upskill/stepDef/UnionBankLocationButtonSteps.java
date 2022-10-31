package upskill.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.pageAction.UnionBankHomePageLocationSearchButtonAction;
import upskill.pageElements.UnionBankHomePageLocationButtonLocators;

public class UnionBankLocationButtonSteps {
	UnionBankHomePageLocationSearchButtonAction UnionBankHomePageLocationSearchButtonActionObj = new UnionBankHomePageLocationSearchButtonAction();

	@When("^Click on Locations button$")
	public void click_on_Locations_button() throws Throwable {
		UnionBankHomePageLocationSearchButtonActionObj.clickonLocationsButton();
	}

}
