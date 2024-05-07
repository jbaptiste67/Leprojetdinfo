

package fr.insa.porjet.leporjet.gui;


import fr.insa.porjet.leporjet.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneEtage {

    private int nbEtages; // Nombre d'étages à afficher
    

    public SceneEtage(int nbEtages) {
        this.nbEtages = nbEtages;
    }

    public SceneEtage(Batiment batiment) {
        this.nbEtages = batiment.getNbetages();
    }

     public void showEtageWindow() {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Gestion des Étages");

        // Création du TabPane pour les étages
        TabPane tabPane = new TabPane();

       
        for (int etage = 1; etage <= nbEtages; etage++) {
            Tab etageTab = createEtageTab(etage, tabPane);
            tabPane.getTabs().add(etageTab);
        }

        BorderPane root = new BorderPane(tabPane);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Tab createEtageTab(int etageNum, TabPane tabPane) {
        Tab etageTab = new Tab("Étage " + etageNum);
        VBox etageContent = new VBox(10);
        etageContent.setPadding(new Insets(10));

        // Champ de saisie pour le nombre d'appartements dans cet étage
        TextField nbAppartField = new TextField();
        nbAppartField.setPromptText("Nombre d'appartements");
        etageContent.getChildren().add(nbAppartField);

        // Bouton pour créer les appartements
        Button createAppartButton = new Button("Valider");
        createAppartButton.setOnAction(e -> {
            String nbAppartText = nbAppartField.getText();
            try {
                int nbAppart = Integer.parseInt(nbAppartText);
                AppartTabsCreator.createAppartTabs(etageNum, nbAppart, tabPane); // Appel à la création des appartements
            } catch (NumberFormatException ex) {
                // Gestion de l'erreur si la saisie n'est pas un nombre valide
                System.err.println("Veuillez saisir un nombre valide pour les appartements.");
            }
        });
        etageContent.getChildren().add(createAppartButton);

        etageTab.setContent(etageContent);
        return etageTab;
    }
}
