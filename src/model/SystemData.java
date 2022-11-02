/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author dell
 */
public class SystemData {
    
    public ArrayList<City> cityList = new ArrayList<>();
    public ArrayList<String> cityDDList = new ArrayList<String>();
    public ArrayList<CommunityAdmin> communityAdminList = new ArrayList<CommunityAdmin>();
    public ArrayList<Community> communityList = new ArrayList<Community>();
    public ArrayList<HospitalAdmin> hospitalAdminList = new ArrayList<HospitalAdmin>();
    public ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
    public ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
    public ArrayList<Patient> patientList = new ArrayList<Patient>();
    public ArrayList<Encounter> encounterList = new ArrayList<Encounter>();
    public ArrayList<VitalSign> vitalSignList = new ArrayList<VitalSign>();
    public Patient patient = new Patient();

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
        return hospitalList != null ? hospitalList.stream().
                filter(a -> a.getHospitalId() == (hospitalId)).findAny().orElse(null) : null;
    }
    
    public HospitalAdmin getHospitalAdminById(int hospitalAdminId) {
        return hospitalAdminList != null ? hospitalAdminList.stream().
                filter(a -> a.getPersonId() == (hospitalAdminId)).findAny().orElse(null) : null;
    }
    
    public HospitalAdmin getHospitalAdminByHospitalId(int hospitalId) {
        return hospitalAdminList != null ? hospitalAdminList.stream().
                filter(a -> a.getHospitalId()== (hospitalId)).findAny().orElse(null) : null;
    }
    
    public CommunityAdmin getCommunityAdminById(int communityAdminId) {
        return communityAdminList != null ? communityAdminList.stream().
                filter(a -> a.getPersonId() == (communityAdminId)).findAny().orElse(null) : null;
    }
    
    public Community getCommunityById(int communityId) {
        return communityList != null ? communityList.stream().
                filter(a -> a.getCommId() == (communityId)).findAny().orElse(null) : null;
    }
    public Doctor getDoctorByHospitalId(int hospId){
        return doctorList.stream().filter(a -> a.getHospitalId() == (hospId)).findAny().orElse(null);
    }
    
    public Encounter getEncounterByPatientId(int patientId){
        return encounterList.stream().filter(a -> a.getPatientId() == (patientId)).findAny().orElse(null);
    }

    public Hospital getHospitalByCommId(int commId){
        return hospitalList.stream().filter(a -> a.getCommId()== (commId)).findAny().orElse(null);
    }
    
    public Encounter getVitalSignsByPatientId(int patientId){
        return encounterList.stream().filter(a -> a.getPatientId()== (patientId)).findAny().orElse(null);
    }
    
    public Patient getPatientById(int patientId){
        return patientList != null ? patientList.stream().filter(a -> a.getPatientId()== (patientId)).findAny().orElse(null) : null;
    }
    
    public String getPatientFullNameById(int patientId) {
        return getPatientById(patientId).getFirstName() + " " + getPatientById(patientId).getLastName();  
    }
    
    public boolean isPatientExists(int patId) {
        return patientList.stream().anyMatch(a -> a.getPatientId()== (patId));
    }
    

    public Doctor getDoctorById(int hospitalId) {
        return doctorList.stream().
                filter(a -> a.getEmpId() == (hospitalId)).findAny().orElse(null);
    }
    
    public boolean isDoctorExists(int doctorId) {
        return doctorList.stream().anyMatch(a -> a.getEmpId()==(doctorId));
    }
    
    public ArrayList<Encounter> getEncounterListByPatientId(int patientId) {
        if(encounterList != null)
        {
            ArrayList<Encounter> list = (ArrayList<Encounter>) encounterList.stream().
                    filter(a -> a.getPatientId() == (patientId)).collect(toList());
            return (ArrayList<Encounter>)list;
        } else {
            return encounterList;
        }
    }
    
    public ArrayList<Encounter> getEncounterListByDocId(int docId) {
        if(encounterList != null)
        {
            ArrayList<Encounter> list = (ArrayList<Encounter>) encounterList.stream().
                    filter(a -> a.getDoctorId() == (docId)).collect(toList());
            return (ArrayList<Encounter>)list;
        } else {
            return encounterList;
        }
    }
}
