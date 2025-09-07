package com.example.patientmanager.controller;

import com.example.patientmanager.model.Consultation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ConsultationController {

    @FXML private TextField patientField;
    @FXML private DatePicker datePicker;
    @FXML private TextField doctorField;
    @FXML private TextField remarksField;
    @FXML private ListView<Consultation> consultationListView;

    private ObservableList<Consultation> consultations;

    @FXML
    public void initialize() {
        consultations = FXCollections.observableArrayList();
        consultationListView.setItems(consultations);
    }

    @FXML
    public void addConsultation() {
        String patient = patientField.getText();
        String doctor = doctorField.getText();
        String remarks = remarksField.getText();
        if (patient.isEmpty() || doctor.isEmpty() || datePicker.getValue() == null) {
            showAlert("Erreur", "Veuillez remplir tous les champs obligatoires.");
            return;
        }

        Consultation consultation = new Consultation(patient, datePicker.getValue(), doctor, remarks);
        consultations.add(consultation);

        patientField.clear();
        doctorField.clear();
        remarksField.clear();
        datePicker.setValue(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
