package com.weather;

public class WeatherDTO {
    private String location;
    private String capturedBy;
    private String temp;
    private String recordedDate;

    // Constructor
    public WeatherDTO(String location, String capturedBy, String temp, String recordedDate) {
        this.location = location;
        this.capturedBy = capturedBy;
        this.temp = temp;
        this.recordedDate = recordedDate;
    }

    // Getters
    public String getLocation() {
        return location;
    }

    public String getCapturedBy() {
        return capturedBy;
    }

    public String getTemp() {
        return temp;
    }

    public String getRecordedDate() {
        return recordedDate;
    }
}
