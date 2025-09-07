package com.example.patientmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PatientConsultationApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                PatientConsultationApplication.class.getResource("/fxml/consultation-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Gestion des Consultations");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
