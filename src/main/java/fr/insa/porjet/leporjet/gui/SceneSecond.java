/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

import fr.insa.porjet.leporjet.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class SceneSecond {

    private Stage primaryStage;

    public SceneSecond(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showSecondWindow() {
        Stage secondStage = new Stage();
        secondStage.setTitle("");
        Sceneoutil.setAppIcon(secondStage);

        Label typeLabel = new Label("Choisissez le type de bâtiment :");
        ToggleGroup typeToggleGroup = new ToggleGroup();
        RadioButton maisonRadioButton = new RadioButton("Maison");
        maisonRadioButton.setToggleGroup(typeToggleGroup);
        RadioButton immeubleRadioButton = new RadioButton("Immeuble");
        immeubleRadioButton.setToggleGroup(typeToggleGroup);

        Label etagesLabel = new Label("Nombre d'étages (RC = étage 0) :");
        ComboBox<Integer> etagesComboBox = new ComboBox<>();
        for (int i = 0; i <= 6; i++) {
            etagesComboBox.getItems().add(i);
        }
        etagesComboBox.getSelectionModel().selectFirst(); // Sélectionne 0 par défaut

        Label budgetLabel = new Label("Entrez votre budget :");
        TextField budgetField = new TextField();
        budgetField.setMaxWidth(250);

        Label heightLabel = new Label("Entrez la hauteur des étages (m) :");
        TextField heightField = new TextField();
        heightField.setMaxWidth(250);

        Button submitButton = new Button("Valider");
        submitButton.setOnAction(e -> {
            String selectedType = typeToggleGroup.getSelectedToggle() == maisonRadioButton ? "Maison" : "Immeuble";
            int selectedEtages = etagesComboBox.getValue();
            
            
            Batiment monBatiment = new Batiment();
            monBatiment.setType(selectedType);
            monBatiment.setNbetages(selectedEtages);
            
            handleSubmit(budgetField.getText(), heightField.getText(), secondStage, monBatiment);
            // Afficher les informations sélectionnées (vous pouvez ajuster cela selon votre besoin)
            System.out.println("Type de bâtiment : " + selectedType);
            System.out.println("Nombre d'étages : " + selectedEtages);
             
        });

        VBox inputFields = new VBox(10);
        inputFields.getChildren().addAll(typeLabel, maisonRadioButton, immeubleRadioButton, etagesLabel, etagesComboBox,
                budgetLabel, budgetField, heightLabel, heightField);
        inputFields.setPadding(new Insets(20)); // Ajouter un padding intérieur

        // Création d'une HBox pour le bouton "Valider" centré en bas
        HBox submitBox = new HBox(submitButton);
        submitBox.setAlignment(Pos.CENTER); // Centrer le bouton

        // Création d'une VBox pour contenir les deux sections
        VBox mainLayout = new VBox(10);
        mainLayout.getChildren().addAll(inputFields, submitBox);
        mainLayout.setPadding(new Insets(20)); // Ajouter un padding autour de mainLayout

        Scene secondScene = new Scene(mainLayout, 600, 400);
        secondStage.setScene(secondScene);
        secondStage.show();
    }

    private void handleSubmit(String budgetText, String heightText, Stage secondStage, Batiment batiment) {
        // Code pour handleSubmit
        try {
            double hauteur = Double.parseDouble(heightText);
            Leporjet.setHauteur(hauteur);
            
            double budget = Double.parseDouble(budgetText);
            Leporjet.setBudget(budget);
         

            System.out.println("Budget du client : " + budgetText);
            System.out.println("Hauteur des étages : " + heightText);

            //SceneThird sceneThird = new SceneThird(primaryStage);
            //sceneThird.showThirdWindow();
            
            SceneEtage sceneEtage = new SceneEtage(batiment);
            sceneEtage.showEtageWindow();
            secondStage.close();
            
        } catch (NumberFormatException ex) {
            // Gérer l'erreur de conversion de la hauteur en double
            System.err.println("Erreur de format hauteur ou budget " );
        }
    }

    
}