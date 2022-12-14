/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author dell
 */
public class Enum {
    public enum Gender {
        MALE,
        FEMALE,
        PREFER_NOT_TO_SAY,
        OTHER
    };
    
    public enum City {
        TORONTO,
        SCARBOROUGH,
        MISSISSAUGA,
        HAMILTON,
        WINDSOR,
        LONDON,
        KINGSTON,
        BURLINGTON,
        BARRIE,
        WATERLOO,
        KITCHENER,
        VAUGHAN
    };
    
    public enum UserRole {
        SYSTEM_ADMINISTRATOR,
        COMMUNITY_ADMINISTRATOR,
        HOSPITAL_ADMINISTRATOR,
        DOCTOR,
        PATIENT,
        GUEST
        
    }
}
