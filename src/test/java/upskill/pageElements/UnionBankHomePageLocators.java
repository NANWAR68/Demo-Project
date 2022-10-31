package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnionBankHomePageLocators {
	
@FindBy (xpath="//a[contains(text(),'personal')]")
public WebElement linkmousehoverPersonal;

@FindBy(xpath="//a[contains(text(),'Checking accounts')]")
public WebElement clickonCheckingAccounts;





}
