package fr.insa.porjet.leporjet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elève
 */
public class Coin {
    private int id;
    private double x;
    private double y;

    public Coin(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coin{" + "id=" + id + ", x=" + x + ", y=" + y + '}';
    }
    
   public static void Saisiecoin (int id,double x, double y) {
    System.out.println("donner l'identifiant de votre coin");
    id=Lire.i();
    System.out.println("donner les coordonnées x,y de votre coin");
    x=Lire.d();
    y=Lire.d();
    
    
}
    
    
}

