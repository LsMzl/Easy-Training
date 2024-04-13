package com.louismzl.easyTraining.service;

import com.louismzl.easyTraining.model.*;

import java.security.SecureRandom;
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


    public Parking initParking() {
        // Initialisation du Parking Building
        Parking building = new Parking();
        building.setType(ParkingTypeEnum.BUILDING);
        building.setNumber(1);

        // Initialisation des Parking Etage
        for (int i = 0; i <= 50; i++) {
            Parking floor = new Parking();
            floor.setType(ParkingTypeEnum.FLOOR);
            floor.setNumber(i);
            // Ajout des étages au building
            building.getSubParkings().add(floor);

            // Initialisation des Parking Salles
            for (int j = 0; j <= 30; j++) {
                Parking hall = new Parking();
                hall.setType(ParkingTypeEnum.HALL);
                hall.setNumber(j);
                // Ajout des salles aux étages
                floor.getSubParkings().add(hall);

                // Initialisation des Parking places
                for (int k = 0; k <= 20; k++) {
                    Parking spot = new Parking();
                    spot.setType(ParkingTypeEnum.SPOT);
                    spot.setNumber(k);
                    // Ajout de vehicules
                    Vehicles vehicle = new Vehicles();
                    vehicle.setRegistrationNumber(String.valueOf(new SecureRandom().nextInt(10000)));
                    // Attribution d'un place de parking aux véhicules
                    vehicle.setParkingSpotNumber("B1-F" + i + "-H" + j + "-S" + k);
                    spot.setVehicle(vehicle);
                    // Ajout des salles aux étages
                    hall.getSubParkings().add(spot);
                }
            }
        }
        return building;
    }
}
