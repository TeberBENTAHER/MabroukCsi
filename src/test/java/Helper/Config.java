package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
public static WebDriver driver;
public static Actions actions;
	
	public static void confChrome() throws Exception {
		System.setProperty("WebDriver.chrome.driver", Utils.getproprety("Google_driver"));
		
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void closeBr() {
		driver.quit();
	}
	public static void wait(int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
