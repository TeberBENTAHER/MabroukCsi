package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]")
	WebElement couleur;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[2]")
	WebElement size;
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement AjouterPAnier;
	
	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/ul/li/div/a")
	WebElement verifPAnier;
	
	public AjoutPanier() {
		PageFactory.initElements(Config.driver, this);
	}
	public void AjoutProduct() throws InterruptedException {
		Config.wait(10);
		couleur.click();
		Thread.sleep(3000);
		size.click();
		Thread.sleep(3000);
		AjouterPAnier.click();
		
	}
	public void VerifPAnier() {
		Assert.assertTrue(verifPAnier.getText().contains("CHEMISE ILES"));
	}

}
