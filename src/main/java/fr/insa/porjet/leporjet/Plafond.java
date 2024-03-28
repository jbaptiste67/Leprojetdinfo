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

    private int idP;
    private Mur ca;
    private Mur cb;
    private Mur cc;
    private Mur cd;

    public Plafond(int idP, Mur ca, Mur cb, Mur cc, Mur cd) {
        this.idP = idP;
        this.ca = ca;
        this.cb = cb;
        this.cc = cc;
        this.cd = cd;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public Mur getCa() {
        return ca;
    }

    public void setCa(Mur ca) {
        this.ca = ca;
    }

    public Mur getCb() {
        return cb;
    }

    public void setCb(Mur cb) {
        this.cb = cb;
    }

    public Mur getCc() {
        return cc;
    }

    public void setCc(Mur cc) {
        this.cc = cc;
    }

    public Mur getCd() {
        return cd;
    }

    public void setCd(Mur cd) {
        this.cd = cd;
    }

    
        
        
    }
    
    

