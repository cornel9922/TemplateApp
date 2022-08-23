package com.main.templateapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

        signUpButton.setOnAction(event -> {
            signUpButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainPage.class.getResource("signUp-view.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        signInButton.setOnAction(event -> {
            String loginText = signIn_login.getText().trim();
            String loginPassword = signIn_pass.getText().trim();

            if (!loginText.equals("") && !loginPassword.equals(""))
                loginUser(loginText, loginPassword);
            else
                System.out.println("Login or Password is empty!");

        });
    }

    private void loginUser(String loginText, String loginPassword) {
    }

}
