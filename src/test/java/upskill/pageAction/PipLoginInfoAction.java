package upskill.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.PipLoginInfoLocators;
import upskill.utilities.SetupDrivers;

public class PipLoginInfoAction {
		PipLoginInfoLocators PipLoginInfoLocatorsObj;
		public	PipLoginInfoAction(){
		PipLoginInfoLocatorsObj=new PipLoginInfoLocators();
			
	PageFactory.initElements(SetupDrivers.driver,PipLoginInfoLocatorsObj);		
			
}
//		public void loadPipingrockHomepage(){
			
//			SetupDriver.driver.get("https://www.Pipingrock.com/");
//		}
		public void PutEmail() throws Exception {	
			Thread.sleep(2000);
			PipLoginInfoLocators.txtbxemail.sendKeys("anwarlipu370@gmail.com");
	}
		
		public void PutPassword() throws Exception{	
			Thread.sleep(2000);
			PipLoginInfoLocators.txtbxpassword.sendKeys("12345ab!");	
		
}
		public void ClickonSignInButton() throws Exception{	
			Thread.sleep(5000);
			PipLoginInfoLocators.btnclick.submit();
//			PipLoginInfoLocators.btnclick.click();

		}
	
			
		}

