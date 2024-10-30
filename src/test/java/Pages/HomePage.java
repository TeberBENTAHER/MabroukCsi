package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[4]/div/ul/li/a/span")
	List<WebElement> submenus;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/h1")
	WebElement verifPAge;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clicOnMenu(String Menu, String Submenu) {
		try {
			
			for(WebElement menu:menus) {
				if(menu.getText().contains(Menu)) {
					
					Config.actions = new Actions(Config.driver);
					Config.actions.moveToElement(menu).perform();
					
					for(WebElement submenu:submenus) {
						
						if(submenu.getText().contains(Submenu)) {
							
							submenu.click();
						}
						
					}
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void verifPage(String msg) {
		Assert.assertEquals(verifPAge.getText(), msg);
		
	}
	

}
