module com.olebas.jfxapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.olebas.jfxapp to javafx.fxml;
    exports com.olebas.jfxapp;
}