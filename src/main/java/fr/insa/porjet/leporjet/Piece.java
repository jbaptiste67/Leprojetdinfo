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
    
   
    /* private List<Mur> murs;

    public Piece() {
        murs = new ArrayList<>();
    }

    public void ajouterMur(Mur mur) {
        murs.add(mur);
    }

    public List<Mur> getMurs() {
        return murs;
    }*/
    
    public Piece(int idp, Mur m1, Mur m2, Mur m3, Mur m4, Sol s, Plafond p) {
        this.idp = idp;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.s = s;
        this.p = p;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public Mur getM1() {
        return m1;
    }

    public void setM1(Mur m1) {
        this.m1 = m1;
    }

    public Mur getM2() {
        return m2;
    }

    public void setM2(Mur m2) {
        this.m2 = m2;
    }

    public Mur getM3() {
        return m3;
    }

    public void setM3(Mur m3) {
        this.m3 = m3;
    }

    public Mur getM4() {
        return m4;
    }

    public void setM4(Mur m4) {
        this.m4 = m4;
    }

    public Sol getS() {
        return s;
    }

    public void setS(Sol s) {
        this.s = s;
    }

    public Plafond getP() {
        return p;
    }

    public void setP(Plafond p) {
        this.p = p;
    }
    
    
    public double Airepiece(Mur m1, Mur m2, Mur m3, Mur m4, Sol s, Plafond p, double hauteur1) {
        
        double S ;
        S= m1.surface(hauteur1)+ m2.surface(hauteur1)+ m3.surface(hauteur1)+ m4.surface(hauteur1)+ s.calculerAire() + p.calculerAire() ;
        return S;
    }
}
    
    // idée : attribuer un rôle à chaque pièce (salle de bain, chambre...)
    
