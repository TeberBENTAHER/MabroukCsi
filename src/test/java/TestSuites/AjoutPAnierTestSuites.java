package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutPAnierTestSuites {
	@Given("utilisateur sur la page de produit")
	public void utilisateur_sur_la_page_de_produit() throws Exception {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		Config.maxWindow();
		
		Config.driver.get(Utils.getproprety("URL2"));
	}

	@When("utilisateur clique sur la couleur et clique sur la taille et clique sur Ajouter au panier")
	public void utilisateur_clique_sur_la_couleur_et_clique_sur_la_taille_et_clique_sur_ajouter_au_panier() throws InterruptedException {
	    AjoutPanier page = new AjoutPanier();
	    page.AjoutProduct();
	}

	@Then("LE produit est ajoute au panier")
	public void le_produit_est_ajoute_au_panier() {
		AjoutPanier page = new AjoutPanier();
		page.VerifPAnier();
	}
}
