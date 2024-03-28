/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public class Leporjet {

    public static void main(String[] args) {
        Coin c1 = new Coin(1,3.15,4.5);
        Coin c2 = new Coin(2,7,9);
        Mur m1= new Mur(1,c1,c2); 
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println( "surface : "+ m1.surface());
        
        /* demande de budget
        immeuble ou maison
longueur largeur et hauteur du bat (calcul surface facade, revêtement pour la façade?)
nb d'étages et hauteur de chaque niveau
nombre de pièces par étage
fonction et coordonnées de chaque pièce, choix des revêtements pour chaque élément de la pièce
nb de fenêtres et d'ouvertures etc
calcul du devis : budget respecté ?
        */
        System.out.println("Quel est votre budget pour ce devis?");
        Lire.i()= int B ;
        System.out.println("Votre bâtiment est-il un immeuble ou une maison");
        Lire.b()=boolean type ;
        
        
    }
}
