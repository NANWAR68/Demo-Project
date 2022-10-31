package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssurantSearchResultLocator {
	
	@FindBy(xpath="//a[contains(text(),'I Assurant')]")
	public WebElement txtFinancialServicesAssurant;
	
	
}
