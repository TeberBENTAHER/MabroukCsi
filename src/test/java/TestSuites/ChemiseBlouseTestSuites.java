package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.ChemisesBlouses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseBlouseTestSuites {
	@Given("utilisateur sur la page Chemises & Blouses")
	public void utilisateur_sur_la_page_chemises_blouses() throws Exception {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		Config.maxWindow();
		
		Config.driver.get(Utils.getproprety("URL1"));
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String product) {
	    ChemisesBlouses page = new ChemisesBlouses();
	    page.ClikProduit(product);
	    
	}

	@Then("la page du produit est affiche qui contient le texte {string}")
	public void la_page_du_produit_est_affiche_qui_contient_le_texte(String msg) {
		ChemisesBlouses page = new ChemisesBlouses();
		page.verifProduct(msg);
		Config.closeBr();
	}


}
