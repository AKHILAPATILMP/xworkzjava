package com.xworkz.dto;

public class DeathCertificateDTO {
    private String name;
    private String cause;
    private String date;
    private String time;
    private String age;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCause() { return cause; }
    public void setCause(String cause) { this.cause = cause; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getCertifiedBy() { return certifiedBy; }
    public void setCertifiedBy(String certifiedBy) { this.certifiedBy = certifiedBy; }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getMannerOfDeath() { return mannerOfDeath; }
    public void setMannerOfDeath(String mannerOfDeath) { this.mannerOfDeath = mannerOfDeath; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getMarks() { return marks; }
    public void setMarks(String marks) { this.marks = marks; }
}
