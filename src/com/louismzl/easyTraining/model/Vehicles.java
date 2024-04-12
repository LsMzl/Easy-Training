package com.louismzl.easyTraining.model;

public class Vehicles {

    private String registrationNumber;


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
