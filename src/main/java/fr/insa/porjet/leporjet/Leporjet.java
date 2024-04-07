/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
import fr.insa.porjet.leporjet.*;


public class Leporjet {

    public static void main(String[] args) {
        /*Coin c1 = new Coin(1,3.15,4.5);
        Coin c2 = new Coin(2,7,9);
        Mur m1= new Mur(1,c1,c2); 
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println( "surface : "+ m1.surface());
        */
        
        /* demande de budget
        immeuble ou maison
longueur largeur et hauteur du bat (calcul surface facade, revêtement pour la façade?)
nb d'étages et hauteur de chaque niveau
nombre de pièces et fonction de chacune par étage
fonction et coordonnées de chaque pièce, choix des revêtements pour chaque élément de la pièce
nb de fenêtres et d'ouvertures etc
calcul du devis : budget respecté ?
        */
        System.out.println("Quel est votre budget pour ce devis?");
        int B = Lire.i()  ;

        // Instanciation batiment
Batiment batiment = new Batiment();
    
System.out.println("Quelle est la hauteur de votre bâtiment ?");
double hauteur=Lire.d();

System.out.println("Combien d'étages a votre bâtiment ?"); 
       int nbetage=Lire.i();
      
       
for (int i =1; i<=nbetage ; i++) {
    
    Etage etage = new Etage (); // dans la boucle les objets vont s'appeler pareil???
    System.out.println("Combien de pièces y a-t-il à l'étage "+i+" ?");
    int nbpiece = Lire.i();
    
    for (int k =1; k<=nbpiece ; k++) {
        // instanciation piece
        Piece piece = new Piece ();
         // Ajout des pièces à l'étage
        etage.ajouterPiece(piece);
        // demander rôle de la pièce : à voir plus tard
        
        for (int m =1; m<=4 ; m++) { // probleme : tourne a l'infini
            
            // demande les info sur les coins début et fin
            System.out.println("Donner les coordonnées du coin début du mur"+m);
            double a = Lire.d();
            double b = Lire.d();
            System.out.println("Donner l'identifiant du coin");
            int id1 = Lire.i();
            
            System.out.println("Donner les coordonnées du coin fin du mur"+m);
            double c = Lire.d();
            double d = Lire.d();
            System.out.println("Donner l'identifiant du coin");
            int id2 = Lire.i();
            
            // création des objets coins
            Coin cd = new Coin (id1, a, b);
            Coin cf = new Coin (id2, c, d);
            
            // création d'un mur avec les coins cd et cf
            Mur mur = new Mur(m, cd, cf);
    
            piece.ajouterMur(mur); // y a aura surement des pb d'identifiants, plusieurs murs risquent de s'appeler 1 ?
            
            //calcul de surface
            double Surface = mur.surface(hauteur);
            
            // demander le revêtement
            // calculer le prix du revêtement (en fonction de la surface du mur)
        }
    }
    // Ajout de l'étage au bâtiment
    batiment.ajouterEtage(etage);
}
        


        }
    
}
    
   

/*cb étages ? 
demander hauteur bâtiment et si tous les étages sont de même hauteur : si même hauteur, alors on 
calcule la heuteur de chaque étage
sinon demander indépendamment pour chaque étage
on commence par demander cb de pièces par étage et les fonctions de chaque piece
boucle pour chaque piece
dans le boucle : combien de murs
boucle pour mur1 à mur n, pour chaque itération on demande coin début et coin fin
dans boucle mur, demander quel revetement puis appeler revetement + surface
*/

