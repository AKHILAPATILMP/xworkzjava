package com.xworkz.dto;

import java.io.Serializable;

public class TourismDTO implements Serializable {
    private  String applicantName;
    private  String destination;
    private  String travelDate;
    private  String returnDate;
    private  String guideName;

    public TourismDTO() {
        System.out.println("No-arg constructor");
    }

    public TourismDTO(String applicantName, String destination, String travelDate, String returnDate, String guideName) {
        this.applicantName = applicantName;
        this.destination = destination;
        this.travelDate = travelDate;
        this.returnDate = returnDate;
        this.guideName = guideName;
    }

    // Getters and Setters
    public   String getApplicantName() {
        return applicantName;
    }
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public   String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public   String getTravelDate() {
        return travelDate;
    }
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public   String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public   String getGuideName() {
        return guideName;
    }
    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }
}
