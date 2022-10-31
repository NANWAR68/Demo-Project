package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PipingrockHomePageLocators {


@FindBy(xpath="//input[@id='search-box']")
public WebElement txtbxSearch;

@FindBy(xpath="//*[@id='search-submit-svg']")	
public WebElement btnClick;
}

