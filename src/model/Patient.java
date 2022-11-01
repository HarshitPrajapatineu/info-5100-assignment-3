/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author dell
 */
public class Patient extends Person {
    
    public static int len = 0;
    public Patient(){
        patientId = ++len;
    }
    
    private int patientId;
    private int hospitalId;
    private LocalDate date;
    private String statusOfAppointment;
    private String patientIssue;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPatientIssue() {
        return patientIssue;
    }

    public void setPatientIssue(String patientIssue) {
        this.patientIssue = patientIssue;
    }

    public String getStatusOfAppointment() {
        return statusOfAppointment;
    }

    public void setStatusOfAppointment(String statusOfAppointment) {
        this.statusOfAppointment = statusOfAppointment;
    }
    
    
}
