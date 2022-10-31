
package upskill.stepDef;

import cucumber.api.java.en.Then;
import upskill.pageAction.AssurantSearchResultAction;


public class AssurantSearchResultSteps {
	AssurantSearchResultAction SearchResultActionObj=new AssurantSearchResultAction();

	@Then("^Item list should have financial service related infromation$")
public void item_list_should_have_financial_service_related_infromation() throws Throwable {
	SearchResultActionObj.verifyFianancialInformation();
}
}