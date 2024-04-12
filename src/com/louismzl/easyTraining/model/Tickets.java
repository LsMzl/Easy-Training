package com.louismzl.easyTraining.model;

import java.util.Date;

public class Tickets {

    private double amount;
    private Vehicles vehicule;
    private Date enteringTime;
    private Date exitTime;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Vehicles getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicles vehicule) {
        this.vehicule = vehicule;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Ticket d'un montant de: " + amount + " € pour le véhicule de type " + vehicule.getCategory() +
                " immatriculé " + vehicule.getRegistrationNumber() + ", entré à " + enteringTime + " et sorti à "
                + exitTime + " .";
    }
}
