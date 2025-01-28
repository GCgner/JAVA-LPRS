package com.example.lprs;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button connexion;

    @FXML
    private Button inscription;

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        // Implement your logic for the Hello button here
    }

    @FXML
    void onInscriptionButtonClick(ActionEvent event) {
        HelloApplication.changeScene("inscriptionView","Inscription");
    }

    @FXML
    void onConnexionButtonClick(ActionEvent event) {
        HelloApplication.changeScene("loginView","Connexion");
     }

    @FXML
    void initialize() {
        assert connexion != null : "fx:id=\"connexion\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert inscription != null : "fx:id=\"inscription\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'hello-view.fxml'.";
    }
}