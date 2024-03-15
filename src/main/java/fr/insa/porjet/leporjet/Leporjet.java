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
    }
}
