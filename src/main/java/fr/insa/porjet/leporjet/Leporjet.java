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
nombre de pièces et fonction de chacune par étage
fonction et coordonnées de chaque pièce, choix des revêtements pour chaque élément de la pièce
nb de fenêtres et d'ouvertures etc
calcul du devis : budget respecté ?
        */
        System.out.println("Quel est votre budget pour ce devis?");
        int B = Lire.i()  ;

        
System.out.println("Quelle est la hauteur de votre bâtiment ?");
double h=Lire.d();

System.out.println("Combien d'étages a votre bâtiment ?"); 
       int nbetage=Lire.i();
       
System.out.println("tous vos étages font-ils la même hauteur ?");
String reponse=Lire.S();
while (reponse!="oui"&&"non"){
    System.out.println("tous vos étages font-ils la même hauteur ?");
var reponse=Lire.S();
if ("oui".equals(reponse)) {
    double hauteur=h/nbetage;
}if ("non".equals(reponse)){
        System.out.println("donnez la hauteur de chaque etage en partant du rdc");
        for (int i=1; i<=nbetage; i++) {
            //comment différencier chaque lire étage? new etage ??//
        }}}
//A REVOIR// 
System.out.println("Combien de pièces y a-t-il dans l'étage ?");

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

