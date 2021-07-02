package amazonIn.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import amazonIn.Pages.amazonInPages;
import net.thucydides.core.annotations.Step;

public class amazonInSteps {
	amazonInPages amPages;
	
	@Step
	public void open_browser() {
		amPages.open();
	}
	
	@Step
	public void searchBarSelection() {
		amPages.searchBarSelection();
	}
	
	@Step
	public void searchBarWrite(String object) {
		amPages.searchBarWrite(object);
	}
	
	@Step
	public void seeMoreBtnSelection() {
		amPages.seeMoreBtnSelection();
	}
	
	@Step
	public void brandSelection(String brand) {
		amPages.brandSelection(brand);
	}
	
	@Step
	public void selectLastObject() {
		amPages.selectLastObject();
	}
	@Step
	public void sendToCart() {
		amPages.sendToCart();
	}
	@Step
	public void validateAddedObject() {
		amPages.validateAddedObject();
	}
}
