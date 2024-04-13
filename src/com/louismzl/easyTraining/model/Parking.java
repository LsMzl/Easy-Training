package com.louismzl.easyTraining.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<Parking> subParkings = new ArrayList<>();
    // Véhicules du parking
    Vehicles vehicle;
    // Numéro du parking
    int number;
    // Types de parking
    ParkingTypeEnum type;


    public List<Parking> getSubParkings() {
        return subParkings;
    }

    public void setSubParkings(List<Parking> subParkings) {
        this.subParkings = subParkings;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingTypeEnum getType() {
        return type;
    }

    public void setType(ParkingTypeEnum type) {
        this.type = type;
    }





}
