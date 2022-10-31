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
    
    public ArrayList<City> cityList;
    public ArrayList<String> cityDDList;
    public ArrayList<CommunityAdmin> communityAdminList;
    public ArrayList<Community> communityList;
    public ArrayList<HospitalAdmin> hospitalAdminList;
    public ArrayList<Hospital> hospitalList;
    public ArrayList<Doctor> doctorList;
    public ArrayList<Patient> patientList;
    public ArrayList<Encounter> encounterList;

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

    public ArrayList<CommunityAdmin> getCommunityAdminList() {
        return communityAdminList;
    }

    public void setCommunityAdminList(ArrayList<CommunityAdmin> communityAdminList) {
        this.communityAdminList = communityAdminList;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public ArrayList<HospitalAdmin> getHospitalAdminList() {
        return hospitalAdminList;
    }

    public void setHospitalAdminList(ArrayList<HospitalAdmin> hospitalAdminList) {
        this.hospitalAdminList = hospitalAdminList;
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Hospital getHospitalById(int hospitalId) {
        return hospitalList.stream().
                filter(a -> a.getHospitalId() == (hospitalId)).findAny().orElse(null);
    }
    
    public HospitalAdmin getHospitalAdminById(int hospitalAdminId) {
        return hospitalAdminList.stream().
                filter(a -> a.getPersonId() == (hospitalAdminId)).findAny().orElse(null);
    }
    
    public CommunityAdmin getCommunityAdminById(int communityAdminId) {
        return communityAdminList.stream().
                filter(a -> a.getPersonId() == (communityAdminId)).findAny().orElse(null);
    }
    
    public Community getCommunityById(int communityId) {
        return communityList.stream().
                filter(a -> a.getCommId() == (communityId)).findAny().orElse(null);
    }
    
}
