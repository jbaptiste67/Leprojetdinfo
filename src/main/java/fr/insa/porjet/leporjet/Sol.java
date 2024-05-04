/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public class Sol extends Surfacerect {

    // Constructeur
    public Sol(Mur murHaut, Mur murBas, Mur murGauche, Mur murDroit) {
        super(murHaut, murBas, murGauche, murDroit);
    }
    
    // Implémentation de la méthode abstraite calculerAire pour le sol
    @Override
    public double calculerAire() {
        double longueur = getMurHaut().longueur();
        double largeur = getMurGauche().longueur();
        return longueur * largeur;
    }

    // Autres méthodes spécifiques au sol si nécessaire
}
