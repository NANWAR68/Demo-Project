package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PipingRockCartFunctionalityResultLocators {
	@FindBy(xpath="//div[contains(text(),'Baby Vitamins')]")
	public static WebElement txtSearch;
	
	@FindBy(xpath="//input[@id='btn-cart-qty-6312']")
	public static WebElement txtbxQty;
	
	@FindBy(xpath="//button[@id='btn-cart-add-6312']")
	public static WebElement btnAddCart;
	
	

}
