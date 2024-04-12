package com.louismzl.easyTraining.model;

public class Bicycles extends Vehicles {

    // Redéfinition de la méthode getCategory.
    @Override
    public VehicleModelEnum getCategory() {
        return VehicleModelEnum.DEUXROUES;
    }
}
