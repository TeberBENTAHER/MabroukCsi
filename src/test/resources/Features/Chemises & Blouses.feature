#Author: Teber
Feature: Page Chemises & Blouses

 
    

  Scenario: Utilisateur cliquee sur le produit
  Given utilisateur sur la page Chemises & Blouses
    When utilisateur clique sur le produit "CHEMISE ILES"
   
    Then la page du produit est affiche qui contient le texte "CHEMISE ILES"
