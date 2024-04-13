package com.louismzl.easyTraining;

import com.louismzl.easyTraining.model.*;
import com.louismzl.easyTraining.service.ParkingServices;

import java.util.*;

import static com.louismzl.easyTraining.model.ParkingTypeEnum.SPOT;

public class ParkingBot {

    static ParkingServices parkingService = new ParkingServices();

    /**
     * Fonction principale du programme.
     * @param args Tableau de données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        //Initialisation d'un parking
        Parking parking = parkingService.initParking();
        listCars(parking);
    }

    /**
     * Parcours tous les types de parking jusqu'à trouver une place de parking
     * Affiche l'immatriculation des véhicules et leur place de stationnement
     * @param parking Parkings à analyser
     */
    static void listCars(Parking parking) {
        // Si c'est une place de parking
        if (SPOT.equals(parking.getType())){
            // Récupération du véhicule
            Vehicles vehicle = parking.getVehicle();
            System.out.println("Véhicule immatriculé " + vehicle.getRegistrationNumber() + " situé à la place " +
                                vehicle.getParkingSpotNumber());
        // Si ce n'est pas une place de parking
        } else {
            // Création d'une liste de sous parking
            List<Parking> subParkings = parking.getSubParkings();
            // Parcours des sous parking
            for (Parking subParking: subParkings) {
                // Appel de la méthode jusqu'à trouver une place de parking
                listCars(subParking);
            }
        }
    }


    /**
     * Intanciation de chaque véhicule.
     * Génération d'un ticket avec les informations d'un véhicule
     * et la date d'entrée.
     */
    private static void processVehicles() {

        Vehicles vehicle = new Vehicles();
        vehicle.setRegistrationNumber("AZ-244-LV");
        Tickets vehicleTicket = parkingService.processIncomingVehicle(vehicle);
        System.out.println(vehicleTicket);
        parkingService.processExitingVehicle(vehicleTicket);
        System.out.println(vehicleTicket);
    }


}