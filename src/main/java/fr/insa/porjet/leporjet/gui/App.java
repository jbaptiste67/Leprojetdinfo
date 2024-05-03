package fr.insa.porjet.leporjet.gui;

import fr.insa.porjet.leporjet.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    private List<Coin> coins = new ArrayList<>();
    private List<Mur> murs = new ArrayList<>();

    private TextField coinIdField;
    private TextField coinXField;
    private TextField coinYField;

    private ComboBox<Integer> coin1IdComboBox;
    private ComboBox<Integer> coin2IdComboBox;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch();
        Leporjet.main(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Leporjet");
        
        setupWelcomeWindow();
    }

     private void setupWelcomeWindow() {
        Label welcomeLabel = new Label("Bonjour ! Cliquez pour démarrer");
        welcomeLabel.getStyleClass().add("welcome-label");

        Button startButton = new Button("Start");
        startButton.getStyleClass().add("start-button");
        startButton.setOnAction(e -> {
            showSecondWindow();
            primaryStage.close();
        });

        Image image = new Image(getClass().getResource("/logo_porjet.png").toExternalForm());
        ImageView logoView = new ImageView(image);
        logoView.setFitWidth(300);
        logoView.setPreserveRatio(true);

        VBox welcomeLayout = new VBox(20);
        welcomeLayout.getStyleClass().add("welcome-layout");
        welcomeLayout.getChildren().addAll(logoView, welcomeLabel, startButton);

        Scene welcomeScene = new Scene(welcomeLayout, 400, 250);
        welcomeScene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        primaryStage.setScene(welcomeScene);
        primaryStage.show();
    }

    private void showSecondWindow() {
        Stage secondStage = new Stage();
        secondStage.setTitle("Informations");

        Label budgetLabel = new Label("Entrez votre budget :");
        TextField budgetField = new TextField();

        Label heightLabel = new Label("Entrez la hauteur des étages (m) :");
        TextField heightField = new TextField();

        Button submitButton = new Button("Soumettre");
        submitButton.setOnAction(e -> {
            handleSubmit(budgetField.getText(), heightField.getText(), secondStage);
    });
        

        VBox secondLayout = new VBox(20);
        secondLayout.getChildren().addAll(budgetLabel, budgetField, heightLabel, heightField, submitButton);
        secondLayout.setPadding(new Insets(20));

        Scene secondScene = new Scene(secondLayout, 400, 250);
        secondStage.setScene(secondScene);
        secondStage.show();
    }

    private void handleSubmit(String budgetText, String heightText, Stage secondStage) {
        try {
            double hauteur = Double.parseDouble(heightText);
            Leporjet.setHauteur(hauteur);

            System.out.println("Budget du client : " + budgetText);
            System.out.println("Hauteur des étages : " + heightText);

            secondStage.close(); // Ferme la deuxième fenêtre après avoir soumis
            showThirdWindow();// Ajoutez ici le code pour afficher la troisième fenêtre si nécessaire
        } catch (NumberFormatException ex) {
            // Gérer l'erreur de conversion de la hauteur en double
            System.err.println("Erreur de format pour la hauteur : " + heightText);
        }
    }
    
    private void showThirdWindow() {
        Stage thirdStage = new Stage();
        thirdStage.setTitle("Mon Projet");

        // Layout principal
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        // Section Coins
        Label coinLabel = new Label("Informations du Coin:");
        coinIdField = new TextField();
        coinIdField.setPromptText("ID");
        coinXField = new TextField();
        coinXField.setPromptText("Coordonnée X");
        coinYField = new TextField();
        coinYField.setPromptText("Coordonnée Y");
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

        // Affichage de la scène
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
    
}
