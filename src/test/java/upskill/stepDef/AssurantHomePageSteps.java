package upskill.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.pageAction.AssurantHomepageAction;

public class AssurantHomePageSteps {
	
	AssurantHomepageAction HomepageActionObj=new AssurantHomepageAction();

	@Given("^open Assurant Homepage$")
	public void open_Assurant_Homepage() throws Throwable {
		HomepageActionObj.loadAssurantHomepage();
	}
	
	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		HomepageActionObj.ClickonSearchButton ();
	}
	
	@When("^Search for Financial Service|Assurant$")
	public void search_for_Financial_Service_Assurant() throws Throwable {
		HomepageActionObj.SearchFinancialService();
		} 
	
	


	
}
