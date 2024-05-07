/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

/**
 *
 * @author Elève
 */

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneWelcome {

    private Stage primaryStage;

    public SceneWelcome(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setupWelcomeWindow() {
        
        primaryStage.setTitle("");

        Sceneoutil.setAppIcon(primaryStage);

        Label welcomeLabel = new Label("Bonjour ! Cliquez pour démarrer");
        welcomeLabel.getStyleClass().add("welcome-label");

        Button startButton = new Button("Start");
        startButton.getStyleClass().add("start-button");
        startButton.setOnAction(e -> {
            SceneSecond sceneSecond = new SceneSecond(primaryStage);
            sceneSecond.showSecondWindow();
            primaryStage.close();
        });

        Image image = new Image(getClass().getResource("/logo_porjet.png").toExternalForm());
        ImageView logoView = new ImageView(image);
        logoView.setFitWidth(300);
        logoView.setPreserveRatio(true);

        VBox welcomeLayout = new VBox(20);
        welcomeLayout.getStyleClass().add("welcome-layout");
        welcomeLayout.getChildren().addAll(logoView, welcomeLabel, startButton);

        Scene welcomeScene = new Scene(welcomeLayout, 600, 400);
        welcomeScene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        primaryStage.setScene(welcomeScene);
        primaryStage.show();
    }

}
