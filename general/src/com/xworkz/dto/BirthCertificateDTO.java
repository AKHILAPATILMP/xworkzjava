package com.xworkz.dto;

public class BirthCertificateDTO {
    private String birthId;
    private String hospitalName;
    private String fatherName;
    private String motherName;
    private String birthDateTime;
    private String doctorName;
    private String nurseName;
    private String hospitalType;

    // Getters and Setters
    public String getBirthId() { return birthId; }
    public void setBirthId(String birthId) { this.birthId = birthId; }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }

    public String getMotherName() { return motherName; }
    public void setMotherName(String motherName) { this.motherName = motherName; }

    public String getBirthDateTime() { return birthDateTime; }
    public void setBirthDateTime(String birthDateTime) { this.birthDateTime = birthDateTime; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }

    public String getHospitalType() { return hospitalType; }
    public void setHospitalType(String hospitalType) { this.hospitalType = hospitalType; }
}
