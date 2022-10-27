/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Enum;
/**
 *
 * @author dell
 */
public class Person {
    private String personId;
    private String FirstName;
    private String LastName;
    private String dob;
    private Enum.Gender gender;
    private String phone;
    private String emailId;
    private Address address;
    private Enum.UserRole userRole;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Enum.Gender getGender() {
        return gender;
    }

    public void setGender(Enum.Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Enum.UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(Enum.UserRole userRole) {
        this.userRole = userRole;
    }
    
}
