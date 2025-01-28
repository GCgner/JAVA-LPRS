package com.example.lprs.formulaire;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.lprs.Entity.Repository.UtilisateurRepository;
import com.example.lprs.Entity.Utilisateur;
import com.example.lprs.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InscriptionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button inscription;

    @FXML
    private Button retour;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtMdp;

    @FXML
    private TextField txtNom;

    @FXML
    private TextField txtPrenom;

    @FXML
    void OnActionRetour(ActionEvent event) {
        HelloApplication.changeScene("hello-view","Start");
    }

    @FXML
    void initialize() {
        assert inscription != null : "fx:id=\"inscription\" was not injected: check your FXML file 'inscriptionView.fxml'.";
        assert retour != null : "fx:id=\"retour\" was not injected: check your FXML file 'inscriptionView.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'inscriptionView.fxml'.";
        assert txtMdp != null : "fx:id=\"txtMdp\" was not injected: check your FXML file 'inscriptionView.fxml'.";
        assert txtNom != null : "fx:id=\"txtNom\" was not injected: check your FXML file 'inscriptionView.fxml'.";
        assert txtPrenom != null : "fx:id=\"txtPrenom\" was not injected: check your FXML file 'inscriptionView.fxml'.";
    }

    @FXML
    void OnActionInscription(ActionEvent event) {
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String email = txtEmail.getText();
        String mdp = txtMdp.getText();

        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || mdp.isEmpty()) {
            System.out.println("All fields are required!");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid email format!");
            return;
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setEmail(email);
        utilisateur.setMdp(mdp);

        UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
        boolean success = utilisateurRepository.inscription(utilisateur);

        if (success) {
            System.out.println("Inscription réussie !");
        } else {
            System.out.println("Inscription échouée !");
        }
    }
    @FXML
    void OnActionConnexion(ActionEvent event) {
        HelloApplication.changeScene("loginView","Start");
    }
}

