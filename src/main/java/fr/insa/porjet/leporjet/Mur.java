package fr.insa.porjet.leporjet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elève
 */
import static java.lang.Math.sqrt;
/**
 *
 * @author jjuif01
 */
public class Mur{
    
    private int idm;
    private Coin cd;
    private Coin cf;
    
    
    public Mur(int id, Coin cd, Coin cf) {
        this.idm = id;
        this.cd = cd;
        this.cf = cf;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public Coin getCd() {
        return cd;
    }

    public void setCd(Coin cd) {
        this.cd = cd;
    }

    public Coin getCf() {
        return cf;
    }

    public void setCf(Coin cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return "Mur{" + "idm=" + idm + ", cd=" + cd + ", cf=" + cf + '}';
    }

   public String getCoordonneesCoins() {
        return "Coordonnées du coin 1 : (" + cd.getX() + ", " + cd.getY() + ")\n" +
               "Coordonnées du coin 2 : (" + cf.getX() + ", " + cf.getY() + ")";
   }
   
 public double longueur() {
    return Math.sqrt(Math.pow(cf.getX() - cd.getX(), 2) + Math.pow(cf.getY() - cd.getY(), 2));
}

public double surface(double hauteur) {
    return longueur()* hauteur;
}
}
