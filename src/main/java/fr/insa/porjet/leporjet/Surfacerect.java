/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public abstract class Surfacerect {
   
    private Mur murHaut;
    private Mur murBas;
    private Mur murGauche;
    private Mur murDroit;
    
    // Constructeur
    public Surfacerect(Mur murHaut, Mur murBas, Mur murGauche, Mur murDroit) {
        this.murHaut = murHaut;
        this.murBas = murBas;
        this.murGauche = murGauche;
        this.murDroit = murDroit;
    }
    
    // Méthode pour calculer l'aire du plafond
    public double calculerAire() {
        double longueur1 = murHaut.longueur();
        double longueur2 = murGauche.longueur();
        return longueur1 * longueur2;
    }

    public Mur getMurHaut() {
        return murHaut;
    }

    public void setMurHaut(Mur murHaut) {
        this.murHaut = murHaut;
    }

    public Mur getMurBas() {
        return murBas;
    }

    public void setMurBas(Mur murBas) {
        this.murBas = murBas;
    }

    public Mur getMurGauche() {
        return murGauche;
    }

    public void setMurGauche(Mur murGauche) {
        this.murGauche = murGauche;
    }

    public Mur getMurDroit() {
        return murDroit;
    }

    public void setMurDroit(Mur murDroit) {
        this.murDroit = murDroit;
    }
    
    // Méthode pour afficher les informations sur le plafond
    public void afficherInformations() {
        System.out.println("Mur haut : " + murHaut);
        System.out.println("Mur bas : " + murBas);
        System.out.println("Mur gauche : " + murGauche);
        System.out.println("Mur droit : " + murDroit);
        System.out.println("Aire du plafond : " + calculerAire());
    }
    
}
