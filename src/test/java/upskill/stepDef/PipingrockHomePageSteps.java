package upskill.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.pageAction.PipingrockHomePageAction;

public class PipingrockHomePageSteps {

	PipingrockHomePageAction PipingrockHomepageActionObj=new PipingrockHomePageAction();
	
	@Given("^open Pipingrock Homepage$")
	public void open_Pipingrock_Homepage() throws Throwable {
		PipingrockHomepageActionObj.loadPipingrockHomepage();
	}
	@When("^Click on search box$")
	public void click_on_search_box() throws Throwable {
		PipingrockHomepageActionObj.ClickonSearchBox();
	}
	
	

	@When("^Search for Men's Vitamins$")
	public void search_for_Men_s_Vitamins() throws Throwable {
		PipingrockHomepageActionObj.SearchMensVitamins();
	}
	@When("^Click on search key$")
	public void click_on_search_key() throws Throwable {
		PipingrockHomepageActionObj.ClickonSearchButton();
	}
	
	
}
