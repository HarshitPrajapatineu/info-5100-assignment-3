/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class SystemData {
    
    private ArrayList<City> cityList;
    private ArrayList<String> cityDDList;
    private CommunityAdminList communityAdminList;
    private CommunityList communityList;
    private HospitalAdminList hospitalAdminList;
    private HospitalList hospitalList;
    private DoctorList doctorList;
    private PatientList patientList;
    private EncounterList encounterList;

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public ArrayList<String> getCityDDList() {
        return cityDDList;
    }

    public void setCityDDList(ArrayList<String> cityDDList) {
        this.cityDDList = cityDDList;
    }

    public CommunityAdminList getCommunityAdminList() {
        return communityAdminList;
    }

    public void setCommunityAdminList(CommunityAdminList communityAdminList) {
        this.communityAdminList = communityAdminList;
    }

    public CommunityList getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityList communityList) {
        this.communityList = communityList;
    }

    public HospitalAdminList getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setHospitalAdminList(HospitalAdminList hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }

    public HospitalList getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalList hospitalList) {
        this.hospitalList = hospitalList;
    }

    public DoctorList getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorList doctorList) {
        this.doctorList = doctorList;
    }

    public PatientList getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }

    public EncounterList getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(EncounterList encounterList) {
        this.encounterList = encounterList;
    }
    
    
    
}
