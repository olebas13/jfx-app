package com.olebas.jfxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField countryField;

    @FXML
    private Button submitRegisterButton;

    @FXML
    private RadioButton maleGenderRadioButton;

    @FXML
    private RadioButton femaleGenderRadioButton;

    @FXML
    void initialize() {


    }


}
