#Author: Teber
Feature: Ajout produit au panier

  Scenario: Ajouter un produit au panier
    Given utilisateur sur la page de produit 
    When utilisateur clique sur la couleur et clique sur la taille et clique sur Ajouter au panier
    Then LE produit est ajoute au panier 