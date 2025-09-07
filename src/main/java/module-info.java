module com.example.patientmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.patientmanager.controller to javafx.fxml;
    exports com.example.patientmanager;
}
