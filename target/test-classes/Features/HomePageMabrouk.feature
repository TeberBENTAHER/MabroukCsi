#Author: Teber
Feature: Mabrouk home page
Scenario: clique sur le menu 
    Given utilisateur sur la page daccueil
    When utilisateur survol sur le menu "Femme" et clique sur le sous menu "Chemises & Blouses"
    Then utilisateur deriger vers la page du chemise et blouse qui contient le message "Chemises & Blouses"