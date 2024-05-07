/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet.gui;

/**
 *
 * @author Elève
 */


import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Sceneoutil {

    public static void setAppIcon(Stage stage) {
        stage.getIcons().add(new Image(Sceneoutil.class.getResourceAsStream("/petit_porjet.png")));
    }
}

