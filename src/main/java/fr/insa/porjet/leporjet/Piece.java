/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author cesse
 */
import java.util.ArrayList;
import java.util.List;

public class Piece {
    
    private int idp ;
    private Mur m1 ;
    private Mur m2 ;
    private Mur m3 ;
    private Mur m4 ;
    private Sol s ;
    private Plafond p ;
    
   
    private List<Mur> murs;

    public Piece() {
        murs = new ArrayList<>();
    }

    public void ajouterMur(Mur mur) {
        murs.add(mur);
    }

    public List<Mur> getMurs() {
        return murs;
    }
}
    
    // idée : attribuer un rôle à chaque pièce (salle de bain, chambre...)
    
