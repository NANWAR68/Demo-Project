package upskill.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.pageAction.UnionBankHomePageAction;

public class UnionBankHomePageSteps {
	UnionBankHomePageAction UnionBankHomePageActionObj=new UnionBankHomePageAction();
	
	@Given("^Open Union Bank Homepage$")
	public void open_Union_Bank_Homepage() throws Throwable {
		UnionBankHomePageActionObj.loadUnioBankpage();
	}
     @When("^Mouse Hover to Personal$")
	public void mouse_Hover_to_Personal() throws Throwable {
		UnionBankHomePageActionObj.mouseHoverUnionBank();
     }
	@Then("^Click on checking accounts link$")
	public void click_on_checking_accounts_link() throws Throwable {
		UnionBankHomePageActionObj.clickCheckingAccount();
	}
	
	}


	
