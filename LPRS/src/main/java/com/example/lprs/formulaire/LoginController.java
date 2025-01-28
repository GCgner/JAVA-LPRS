package appli.accueil;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button connexion;

    @FXML
    private Button inscription;

    @FXML
    private Button motDePasseOublie;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtMdp;

    @FXML
    void OnActionConnexion(ActionEvent event) {

    }

    @FXML
    void OnActionInscription(ActionEvent event) {

    }

    @FXML
    void OnActionMdpOublie(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert connexion != null : "fx:id=\"connexion\" was not injected: check your FXML file 'loginView.fxml'.";
        assert inscription != null : "fx:id=\"inscription\" was not injected: check your FXML file 'loginView.fxml'.";
        assert motDePasseOublie != null : "fx:id=\"motDePasseOublie\" was not injected: check your FXML file 'loginView.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'loginView.fxml'.";
        assert txtMdp != null : "fx:id=\"txtMdp\" was not injected: check your FXML file 'loginView.fxml'.";

    }

}
