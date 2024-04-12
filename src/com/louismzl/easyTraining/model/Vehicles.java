package com.louismzl.easyTraining.model;

public class Vehicles {

    private String registrationNumber;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Vehicules{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
