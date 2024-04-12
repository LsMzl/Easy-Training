package com.louismzl.easyTraining.model;

import java.util.Date;

public class Tickets {

    private String amount;
    private Vehicles vehicule;
    private Date enteringTime;
    private Date exitTime;


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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
        return "Tickets{" +
                "amount='" + amount + '\'' +
                ", vehicule=" + vehicule +
                ", enteringTime=" + enteringTime +
                ", exitTime=" + exitTime +
                '}';
    }
}
