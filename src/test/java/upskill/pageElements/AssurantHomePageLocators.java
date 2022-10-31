package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssurantHomePageLocators {
	
	@FindBy(xpath = "//span[@class='fa fa-search font-primary']")
	public WebElement btnSearch;

	
	// Search text box
	@FindBy(xpath = "//input[@placeholder='Search']") // page factory
	public WebElement txtbxSearch;

	// Search button
	
}
