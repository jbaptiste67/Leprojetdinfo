/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public class Appartement {
    
    private int idapp;
    private int nbpieces;

    

    public Appartement(int idapp, int nbpieces) {
        this.idapp = idapp;
        this.nbpieces = nbpieces;
    }
    
    

    public int getId() {
        return idapp;
    }

    public void setId(int id) {
        this.idapp = id;
    }

    public int getNbpieces() {
        return nbpieces;
    }

    public void setNbpieces(int nbpieces) {
        this.nbpieces = nbpieces;
    }
    
    
}
