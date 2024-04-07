/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
import java.util.ArrayList;
import java.util.List;

public class Batiment {
    private List<Etage> etages;
    
    public Batiment() {
        etages = new ArrayList<>();
    }

    public void ajouterEtage(Etage etage) {
        etages.add(etage);
    }

    public List<Etage> getEtages() {
        return etages;
        
    }
    //private H; //hauteur totale du bâtiment
    // demander le nombre d'étages
    // demander si étages de même hauteur, selon la réponse renvoyer à des procédures/fonctions de la classe étage
}
