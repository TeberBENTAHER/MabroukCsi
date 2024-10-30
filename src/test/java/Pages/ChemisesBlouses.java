package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ChemisesBlouses {
	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productList;
	
	@FindBy(xpath="//*[@id=\"product-1133469\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	WebElement verifArticle;
	
	public ChemisesBlouses() {
		PageFactory.initElements(Config.driver, this);
	}
	public void ClikProduit(String product)	{
		
		

	
		try {
			Config.wait(10);
			
			for(WebElement produit:productList) {
				if(produit.getText().contains(product)) {
					
					produit.click();
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void verifProduct(String Productname) {
		Assert.assertEquals(verifArticle.getText(), Productname);
	}


}
