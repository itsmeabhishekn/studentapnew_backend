package com.example.studentapnew_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String admnNo;
    private int rollNo;
    private  String clgName;
    private String parentName;
    private String parentMobNo;
    private String username;
    private String password;
    private String cpassword;

    public Students() {
    }

    public Students(int id, String name, String admnNo, int rollNo, String clgName, String parentName, String parentMobNo, String username, String password, String cpassword) {
        this.id =      id;
        this.name =    name;
        this.admnNo =  admnNo;
        this.rollNo =  rollNo;
        this.clgName = clgName;
        this.parentName = parentName;
        this.parentMobNo = parentMobNo;
        this.username = username;
        this.password = password;
        this.cpassword=cpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(String admnNo) {
        this.admnNo = admnNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentMobNo() {
        return parentMobNo;
    }

    public void setParentMobNo(String parentMobNo) {
        this.parentMobNo = parentMobNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
