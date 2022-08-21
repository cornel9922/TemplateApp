module com.main.templateapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.templateapp to javafx.fxml;
    exports com.main.templateapp;
}