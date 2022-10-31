
package upskill.pageAction;

import upskill.pageElements.PipingRockCartFunctionalityResultLocators;

public class PipingRockCartFuncResultAction {
	
	public void ClickonBabyVitamins(){
		PipingRockCartFunctionalityResultLocators.txtSearch.click();
		
}
	public void SelectQuantity(){
		PipingRockCartFunctionalityResultLocators.txtbxQty.sendKeys("5");
	}
	public void Addtoshoppingcart(){
		PipingRockCartFunctionalityResultLocators.btnAddCart.submit();
	}
}
