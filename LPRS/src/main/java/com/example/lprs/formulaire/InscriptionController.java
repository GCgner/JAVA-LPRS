package appli.accueil;

import java.net.URL;
import java.util.ResourceBundle;
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
    void OnActionInscription(ActionEvent event) {

    }

    @FXML
    void OnActionRetour(ActionEvent event) {

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

}
