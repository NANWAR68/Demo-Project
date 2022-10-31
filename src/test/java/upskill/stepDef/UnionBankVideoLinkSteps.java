package upskill.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.pageAction.UnionBankVideoLinkActions;

public class UnionBankVideoLinkSteps {
	UnionBankVideoLinkActions UnionBankVideoLinkActionsObj= new UnionBankVideoLinkActions();
	@When("^Click on Watch Video Link$")
	public void click_on_Watch_Video_Link() throws Throwable {
		UnionBankVideoLinkActionsObj.ClickVideoLink();
	}

	@Then("^Video is playing$")
	public void video_is_playing() throws Throwable {
		Thread.sleep(5000);
 }

}
