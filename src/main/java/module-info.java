module com.main.templateapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.main.templateapp to javafx.fxml;
    exports com.main.templateapp;
}