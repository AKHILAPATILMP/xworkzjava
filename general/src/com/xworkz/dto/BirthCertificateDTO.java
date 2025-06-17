package com.xworkz.dto;

import java.io.Serializable;

public class BirthCertificateDTO implements Serializable {
    private static String birthId;
    private static String hospitalName;
    private static String fatherName;
    private static String motherName;
    private static String birthDateTime;
    private static String doctorName;
    private static String nurseName;
    private static String hospitalType;

    public BirthCertificateDTO(String birthId, String hospitalName, String fatherName, String motherName, String birthDateTime, String doctorName, String nurseName, String hospitalType) {
        this.birthId=birthId;
        this.hospitalName=hospitalName;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.birthDateTime=birthDateTime;
        this.doctorName=doctorName;
        this.nurseName=nurseName;
        this.hospitalType=hospitalType;
    }
public BirthCertificateDTO(){
    System.out.println("no arg const");
}
    // Getters and Setters

    public static String getBirthId() {
        return birthId;
    }

    public void setBirthId(String birthId) {
        this.birthId = birthId;
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public static String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public static String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public static String getBirthDateTime() {
        return birthDateTime;
    }

    public void setBirthDateTime(String birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    public static String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public static String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public static String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }
}
