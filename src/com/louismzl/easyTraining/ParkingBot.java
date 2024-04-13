package com.louismzl.easyTraining;

import com.louismzl.easyTraining.model.Bicycles;
import com.louismzl.easyTraining.model.Cars;
import com.louismzl.easyTraining.model.Tickets;
import com.louismzl.easyTraining.model.Vehicles;
import com.louismzl.easyTraining.service.ParkingServices;

import java.util.*;

public class ParkingBot {

    static ParkingServices parkingService = new ParkingServices();

    /**
     * Fonction principale du programme.
     * @param args Tableau de données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        processVehicles();
        //Passage par valeur
       /* int a = 10;
        int b = a;
        System.out.println("a = " + a + "\nb = " + b);

        a = 15;
        System.out.println("a = " + a + "\nb = " + b);*/
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