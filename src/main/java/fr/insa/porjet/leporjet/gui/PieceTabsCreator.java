/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

/**
 *
 * @author Elève
 */
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class PieceTabsCreator {

    /**
     * Crée les onglets de pièces dans un TabPane spécifié.
     * @param parentTab L'onglet parent dans lequel ajouter les onglets de pièces.
     * @param nbPieces Le nombre de pièces à créer.
     */
    public static void createPieceTabs(Tab parentTab, int nbPieces) {
        TabPane pieceTabs = new TabPane();
        for (int piece = 1; piece <= nbPieces; piece++) {
            Tab pieceTab = new Tab("Pièce " + piece);
            // Vous pouvez ajouter d'autres éléments à l'onglet de pièce ici si nécessaire
            pieceTabs.getTabs().add(pieceTab);
        }
        parentTab.setContent(pieceTabs);
    }
}
