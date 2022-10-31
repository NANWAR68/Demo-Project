package upskill.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.pageAction.PipLoginInfoAction;

public class PipLoginInfoSteps {
	
	PipLoginInfoAction PipLoginInfoActionObj=new PipLoginInfoAction();
	@When("^Type valid Email address$")
	public void type_valid_Email_address() throws Throwable {
		PipLoginInfoActionObj.PutEmail();
	}

	@When("^Type valid password$")
	public void type_valid_password() throws Throwable {
		PipLoginInfoActionObj.PutPassword();
	}

	@When("^Click on Sign In button$")
	public void click_on_Sign_In_button() throws Throwable {
		PipLoginInfoActionObj.ClickonSignInButton();
	}

	
	}




