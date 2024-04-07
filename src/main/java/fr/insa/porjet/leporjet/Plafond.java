/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public class Plafond {
    private Mur murHaut;
    private Mur murBas;
    private Mur murGauche;
    private Mur murDroit;
    
    // Constructeur
    public Plafond(Mur murHaut, Mur murBas, Mur murGauche, Mur murDroit) {
        this.murHaut = murHaut;
        this.murBas = murBas;
        this.murGauche = murGauche;
        this.murDroit = murDroit;
    }
    
    // Méthode pour calculer l'aire du plafond
    public double calculerAire() {
        double longueur = murHaut.longueur();
        double largeur = murGauche.longueur();
        return longueur * largeur;
    }
    
    // Méthode pour afficher les informations sur le plafond
    public void afficherInformations() {
        System.out.println("Mur haut : " + murHaut);
        System.out.println("Mur bas : " + murBas);
        System.out.println("Mur gauche : " + murGauche);
        System.out.println("Mur droit : " + murDroit);
        System.out.println("Aire du plafond : " + calculerAire());
    }
    
    // Méthodes getters et setters
    // Vous pouvez les ajouter selon vos besoins pour accéder aux murs du plafond
}
