package com.louismzl.easyTraining.model;

public class Vehicles {

    private String registrationNumber;
    private String parkingSpotNumber;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleModelEnum getCategory() {
        return VehicleModelEnum.VEHICULE;
    }
}
