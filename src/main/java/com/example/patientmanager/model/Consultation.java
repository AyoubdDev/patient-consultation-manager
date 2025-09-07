package com.example.patientmanager.model;

import java.time.LocalDate;

public class Consultation {
    private String patientName;
    private LocalDate date;
    private String doctorName;
    private String remarks;

    public Consultation() { }

    public Consultation(String patientName, LocalDate date, String doctorName, String remarks) {
        this.patientName = patientName;
        this.date = date;
        this.doctorName = doctorName;
        this.remarks = remarks;
    }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    @Override
    public String toString() {
        return date + " - " + patientName + " (" + doctorName + ")";
    }
}
