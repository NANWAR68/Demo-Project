package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PipLoginInfoLocators {

	@FindBy(xpath = "//input[@id='login-email']")
	public static WebElement txtbxemail;

	@FindBy(xpath = "//input[@id='login-pwd']")
	public static WebElement txtbxpassword;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	public static WebElement btnclick;

	
}
