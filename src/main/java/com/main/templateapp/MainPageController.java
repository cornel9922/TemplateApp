package com.main.templateapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signInButton;

    @FXML
    private TextField signIn_login;

    @FXML
    private PasswordField signIn_pass;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {

        signInButton.setOnAction(event -> {
            System.out.println("Hello new customer!");
        });
    }

}
