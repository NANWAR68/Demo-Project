package upskill.utilities;

import cucumber.api.java.After;

public class AfterActions {

	ScreenShotDemo ScreenShotDemoObj = new ScreenShotDemo();
   
	@After
   public void afterActions(cucumber.api.Scenario Scenario) throws Exception {
	   if(Scenario.isFailed()){
		   ScreenShotDemoObj.screenShot2();
	   }
		
		SetupDrivers.tearDownDriver();
		System.out.println("-------- Test Completed, Browser Closed -------");
	
   }
}




