/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

/**
 *
 * @author Elève
 */


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AppartTabsCreator {

    /**
     * Crée les sous-onglets d'appartements pour un étage donné et les ajoute à l'onglet d'étage correspondant.
     * @param etageNum Le numéro de l'étage pour lequel créer les appartements.
     * @param nbAppart Le nombre d'appartements à créer pour cet étage.
     * @param etageTabs Le TabPane contenant les onglets d'étages.
     */
    public static void createAppartTabs(int etageNum, int nbAppart, TabPane etageTabs) {
        // Récupérer l'onglet d'étage correspondant au numéro d'étage
        if (etageNum >= 1 && etageNum <= etageTabs.getTabs().size()) {
            Tab etageTab = etageTabs.getTabs().get(etageNum - 1);

            // Créer un nouveau TabPane pour les appartements de cet étage
            TabPane appartTabs = new TabPane();

            // Créer les onglets d'appartements en fonction du nombre spécifié
            for (int appart = 1; appart <= nbAppart; appart++) {
                Tab appartTab = new Tab("Appartement " + appart + " (Étage " + etageNum + ")");
                appartTabs.getTabs().add(appartTab);

                // Demander le nombre de pièces pour cet appartement
                VBox appartContent = new VBox(10);
                appartContent.setPadding(new Insets(10));

                TextField nbPiecesField = new TextField();
                nbPiecesField.setPromptText("Nombre de pièces pour appartement " + appart);
                appartContent.getChildren().add(nbPiecesField);

                Button createPiecesButton = new Button("Valider");
                createPiecesButton.setOnAction(e -> {
                    String nbPiecesText = nbPiecesField.getText();
                    try {
                        int nbPieces = Integer.parseInt(nbPiecesText);
                        // Créer les sous-onglets de pièces pour cet appartement
                        PieceTabsCreator.createPieceTabs(appartTab, nbPieces);
                    } catch (NumberFormatException ex) {
                        System.err.println("Veuillez saisir un nombre valide pour les pièces.");
                    }
                });

                appartContent.getChildren().add(createPiecesButton);
                appartTab.setContent(appartContent);
            }

            // Définir le contenu de l'onglet d'étage pour afficher les onglets d'appartements
            etageTab.setContent(appartTabs);
        } else {
            System.err.println("Numéro d'étage invalide : " + etageNum);
        }
    }
}
