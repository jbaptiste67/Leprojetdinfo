/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

/**
 *
 * @author Elève
 */

import fr.insa.porjet.leporjet.*;
import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneThird {

    private Stage primaryStage;
    
    private List<Coin> coins = new ArrayList<>();
    private List<Mur> murs = new ArrayList<>();

    private TextField coinIdField;
    private TextField coinXField;
    private TextField coinYField;

    private ComboBox<Integer> coin1IdComboBox;
    private ComboBox<Integer> coin2IdComboBox;

    public SceneThird(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showThirdWindow() {
        Stage thirdStage = new Stage();
        thirdStage.setTitle("");
        Sceneoutil.setAppIcon(thirdStage);


        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        // Section Coins
        Label coinLabel = new Label("Informations du Coin:");
        coinIdField = new TextField();
        coinIdField.setMaxWidth(150);
        
        
        coinIdField.setPromptText("ID");
        coinXField = new TextField();
        coinXField.setPromptText("Coordonnée X");
        coinXField.setMaxWidth(150);
        
        coinYField = new TextField();
        coinYField.setPromptText("Coordonnée Y");
        coinYField.setMaxWidth(150);
        Button addCoinButton = new Button("Ajouter Coin");
        addCoinButton.setOnAction(e -> addCoin());

        VBox coinBox = new VBox(5);
        coinBox.getChildren().addAll(coinLabel, coinIdField, coinXField, coinYField, addCoinButton);

        // Section Murs
        Label murLabel = new Label("Créer un Mur:");
        coin1IdComboBox = new ComboBox<>();
        coin1IdComboBox.setPromptText("Sélectionner Coin 1");
        coin2IdComboBox = new ComboBox<>();
        coin2IdComboBox.setPromptText("Sélectionner Coin 2");
        Button addMurButton = new Button("Ajouter Mur");
        addMurButton.setOnAction(e -> addMur());

        VBox murBox = new VBox(5);
        murBox.getChildren().addAll(murLabel, coin1IdComboBox, coin2IdComboBox, addMurButton);

        // Ajouter les sections au layout principal
        root.getChildren().addAll(coinBox, murBox);

        Scene thirdScene = new Scene(root, 600, 400);
        thirdStage.setScene(thirdScene);
        thirdStage.show();
    }

    
    private void addCoin() {
        // Récupérer les informations entrées dans les champs de texte
        try {
            int id = Integer.parseInt(coinIdField.getText());
            double x = Double.parseDouble(coinXField.getText());
            double y = Double.parseDouble(coinYField.getText());

            // Créer un nouvel objet Coin avec les informations saisies
            Coin newCoin = new Coin(id, x, y);

            // Ajouter le nouveau Coin à la liste des coins
            coins.add(newCoin);

            // Afficher les informations du Coin ajouté
            System.out.println("Nouveau Coin ajouté : " + newCoin);
            miseAjourComboBox();
        } catch (NumberFormatException ex) {
            System.out.println("Erreur : Veuillez saisir des valeurs numériques valides pour ID, X et Y.");
        }
    }

    private void miseAjourComboBox() {
        // Effacer les éléments actuels des ComboBox
        coin1IdComboBox.getItems().clear();
        coin2IdComboBox.getItems().clear();

        // Ajouter tous les identifiants des coins actuels aux ComboBox
        for (Coin coin : coins) {
            coin1IdComboBox.getItems().add(coin.getId());
            coin2IdComboBox.getItems().add(coin.getId());
        }
    }

    private void addMur() {
        // Récupérer les identifiants sélectionnés dans les ComboBox
        Integer coin1Id = coin1IdComboBox.getValue();
        Integer coin2Id = coin2IdComboBox.getValue();

        // Rechercher les Coins correspondants dans la liste des Coins
        Coin coin1 = findCoinById(coin1Id);
        Coin coin2 = findCoinById(coin2Id);

        if (coin1 != null && coin2 != null) {
            // Créer un Mur avec les deux Coins trouvés
            Mur mur = new Mur(murs.size() + 1, coin1, coin2);
            murs.add(mur);

            // Afficher les informations du Mur ajouté
            System.out.println("Nouveau Mur ajouté : " + mur);
        } else {
            System.out.println("Erreur : Coins sélectionnés non trouvés");
        }
    }

    private Coin findCoinById(int id) {
        for (Coin coin : coins) {
            if (coin.getId() == id) {
                return coin;
            }
        }
        return null;
    }

    // Ajoutez d'autres méthodes nécessaires pour gérer la troisième scène
}

