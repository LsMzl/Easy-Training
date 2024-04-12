package com.louismzl.easyTraining;

import com.louismzl.easyTraining.model.Bicycles;
import com.louismzl.easyTraining.model.Cars;
import com.louismzl.easyTraining.model.Tickets;
import com.louismzl.easyTraining.model.Vehicles;
import com.louismzl.easyTraining.service.ParkingServices;

public class ParkingBot {

    static ParkingServices parkingService = new ParkingServices();

    /**
     * Fonction principale du programme.
     * @param args Tableau de données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        processVehicles();
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
        System.out.println(parkingService.processExitingVehicle(vehicleTicket));

        Vehicles yamaha = new Bicycles();
        yamaha.setRegistrationNumber("MT-456-YH");
        Tickets bicycleTicket = parkingService.processIncomingVehicle(yamaha);
        System.out.println(parkingService.processExitingVehicle(bicycleTicket));

        Vehicles peugeot = new Cars();
        peugeot.setRegistrationNumber("FF-014-JN");
        Tickets carTicket = parkingService.processIncomingVehicle(peugeot);
        System.out.println(parkingService.processExitingVehicle(carTicket));

    }

}