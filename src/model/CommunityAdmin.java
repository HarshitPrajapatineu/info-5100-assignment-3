/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dell
 */
public class CommunityAdmin extends Person{
    private int commId;
    private int commAdminId;

    public int getCommId() {
        return commId;
    }

    public void setCommId(int commId) {
        this.commId = commId;
    }

    public int getCommAdminId() {
        return commAdminId;
    }

    public void setCommAdminId(int commAdminId) {
        this.commAdminId = commAdminId;
    }
    
}
