package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import upskill.pageElements.PipingrockSearchResultLocators;
import upskill.utilities.SetupDrivers;
public class PipingrockSearchResultAction{
	PipingrockSearchResultLocators PipingrockSearchResultLocatorsObj;
	public PipingrockSearchResultAction(){
	 
		PipingrockSearchResultLocatorsObj	= new PipingrockSearchResultLocators();
		
	PageFactory.initElements(SetupDrivers.driver, PipingrockSearchResultLocatorsObj);
		
	}
//public void loadPipingrockHomepage(){
		
//		SetupDriver.driver.get("https://www.Pipingrock.com/");
//}
	public void verifytextMensVitamins(){
		
//		PipingrockSearchResultLocatorsObj.txtMensVitamins.isDisplayed();

        Assert.assertEquals(PipingrockSearchResultLocatorsObj.txtMensVitamins.getText(),"MensVitamins");
//       Assert.assertTrue(PipingrockSearchResultLocatorsObj.txtMensVitamins.isDisplayed());
	}
}