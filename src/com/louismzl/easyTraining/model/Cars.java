package com.louismzl.easyTraining.model;

public class Cars extends Vehicles {

    // Redéfinition de la méthode getCategory.
    @Override
    public String getCategory() {
        return "CAR";
    }
}
