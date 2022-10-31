package upskill.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.pageAction.PipHomePageForLoginAction;

public class PipHomepageforLoginSteps {
	
	PipHomePageForLoginAction PipHomePageForLoginActionObj=new PipHomePageForLoginAction();
	@Given("^Open Pipingrock home page$")
	public void open_Pipingrock_home_page() throws Throwable {
		PipHomePageForLoginActionObj.loadPipingrockHomepage();
	}

	@When("^Click on my account button$")
	public void click_on_my_account_button() throws Throwable {
	 
		
		PipHomePageForLoginActionObj.ClickOnMyAccount();
	}

}
