package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	
	@Before
	public void beforeActions(Scenario scen){
		
	System.out.println("Initilizing Driver...");
	
	SetupDrivers.setupDriver();
	System.out.println("Test Scenario name:"+scen.getName());
	
	}
	
}

