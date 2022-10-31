package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PipHomePageForLoginLocators {
	
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	public WebElement btnClick;

}
