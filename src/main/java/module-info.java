module com.olebas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.olebas to javafx.fxml;
    exports com.olebas;
}