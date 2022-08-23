package com.main.templateapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField country_field;

    @FXML
    private TextField firstName_field;

    @FXML
    private TextField lastName_field;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField pass_field;

    @FXML
    private Button signUpButton;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> {

            signUpNewUser();


        });

    }

    private void signUpNewUser() {

        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = firstName_field.getText();
        String lastName = lastName_field.getText();
        String userName= login_field.getText();
        String password = pass_field.getText();
        String location = country_field.getText();
        String gender = "";

        if(signUpCheckBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName, password, location, gender);


        dbHandler.signUpUser(user);

    }

}
