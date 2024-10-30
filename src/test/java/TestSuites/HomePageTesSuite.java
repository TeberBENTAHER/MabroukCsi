package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTesSuite {
	@Given("utilisateur sur la page daccueil")
	public void utilisateur_sur_la_page_daccueil() throws Exception {
		Config.driver= new ChromeDriver();
	    Config.confChrome();
	    Config.maxWindow();
	    
	    Config.driver.get(Utils.getproprety("URL"));
	}

	@When("utilisateur survol sur le menu {string} et clique sur le sous menu {string}")
	public void utilisateur_survol_sur_le_menu_et_clique_sur_le_sous_menu(String menu, String submenu) {
		Config.wait(0);
	    HomePage page = new HomePage();
	    page.clicOnMenu(menu, submenu);
	}

	@Then("utilisateur deriger vers la page du chemise et blouse qui contient le message {string}")
	public void utilisateur_deriger_vers_la_page_du_chemise_et_blouse_qui_contient_le_message(String Msg) {
		HomePage page = new HomePage();
		page.verifPage(Msg);
		Config.closeBr();
	}

}
