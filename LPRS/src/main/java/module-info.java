module com.example.lprs {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.lprs to javafx.fxml;
    exports com.example.lprs;
    exports com.example.lprs.formulaire;
    exports com.example.lprs.Controller.HomeController;
    opens com.example.lprs.Controller.HomeController to javafx.fxml;
    opens com.example.lprs.formulaire to javafx.fxml;
}