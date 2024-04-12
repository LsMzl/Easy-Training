package com.louismzl.easyTraining.service;

import com.louismzl.easyTraining.model.Tickets;
import com.louismzl.easyTraining.model.Vehicles;
import com.louismzl.easyTraining.model.VehicleModelEnum;

import java.util.Date;

public class ParkingServices {

    /**
     * Récupère les information d'un véhicule afin de générer un ticket.
     * @param vehicle vehicle Véhicule pour lequel on récupère les informations.
     * @return
     */
    public Tickets processIncomingVehicle(Vehicles vehicle){

        // Instanciation d'un ticket
        Tickets ticket = new Tickets();
        Date now = new Date();

        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicle);

        return ticket;
    }

    /**
     * Calcul le prix du ticket selon l'heure de sortie et la catégorie du véhicule
     * @param ticket
     * @return
     */
    public Tickets processExitingVehicle(Tickets ticket){

        long now = new Date().getTime();
        now += 60 * 60 * 1000;

        // Définition de l'heure de sortie
        Date exitTime = new Date(now);
        ticket.setExitTime(exitTime);

        // Définition du véhicule
        Vehicles vehicle = ticket.getVehicule();
        VehicleModelEnum category = vehicle.getCategory();

        // Définition des prix selon la catégorie du véhicule
        double pricePerMinForCitadine = 0.08;
        double pricePerMinForBycicle = 0.02;
        double defaultPricePerMin = 0.05;

        // Calcul de la durée de stationnement en minutes
        long durationInMinutes = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);

        double finalPrice = 0;

        switch (category) {
            case CITADINE:
                finalPrice = durationInMinutes * pricePerMinForCitadine;
                break;
            case DEUXROUES:
                finalPrice = durationInMinutes * pricePerMinForBycicle;
                break;
            default:
                finalPrice = durationInMinutes * defaultPricePerMin;
                break;
        }

        ticket.setAmount(finalPrice);

        return ticket;
    }
}
