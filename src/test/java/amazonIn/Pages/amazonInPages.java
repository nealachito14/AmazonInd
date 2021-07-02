package amazonIn.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.in/")
public class amazonInPages extends PageObject {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElementFacade txtSearchBar;
	
	@FindBy(xpath = "//*[@id=\"brandsRefinements\"]/ul/li[8]/span/div/a/span")
	WebElementFacade btnSeemoreBrands;
	
	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[22]/div[1]/span[1]/div[1]/div[1]/div[1]")
	WebElementFacade lblLastObject;
	
	@FindBy(xpath = "//span[contains(text(),'results for')]")
	WebElementFacade lblNroofResults;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElementFacade btnAddtoCart;
	
	@FindBy(xpath = "//*[@id='huc-v2-order-row-confirm-text']/h1")
	WebElementFacade lblValidate;
	
	public void brandSelection(String brands) {
		WebElement listBrands = getDriver().findElement(By.xpath("//span[contains(text(),'"+brands+"')]"));
		listBrands.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(getNumberofResults());
	}
	public void searchBarSelection() {
		txtSearchBar.click();
	}
	public void searchBarWrite(String object) {
		txtSearchBar.typeAndEnter(object);
	}
	public void seeMoreBtnSelection(){
		JavascriptExecutor js = (JavascriptExecutor) getDriver();  
		js.executeScript("window.scrollBy(0,500)");
		btnSeemoreBrands.click();
	}
	public Integer getNumberofResults() {
		int number=0;
		String cadena = "";
		cadena = lblNroofResults.getText();
		String [] fracciones = cadena.split(" ");
		if(cadena.equals("1-24 of 25 results for")){
			number = 24;
		}else{
			number = Integer.parseInt(fracciones[0]);
		}
		System.out.println(number);
		return number;
	}
	
	public void selectLastObject() {
		WebElement lblLastObject = getDriver().findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div["+getNumberofResults()+"]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));																			 
		lblLastObject.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void sendToCart() {
		for (String handle : this.getDriver().getWindowHandles()) {
			this.getDriver().switchTo().window(handle);
		}
		if(btnAddtoCart.isCurrentlyVisible()) {
			btnAddtoCart.click();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void validateAddedObject() {
		if(lblValidate.isVisible()) {
			String texto = lblValidate.getText();
			Assert.assertEquals("Added to Cart", texto);
			if(texto.equals("Added to Cart")) {
				System.out.println("Objeto Agregado con exito");
			}
			
			
		}
	}
}
