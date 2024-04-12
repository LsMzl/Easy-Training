package com.louismzl.easyTraining;


import com.louismzl.easyTraining.model.Tickets;
import com.louismzl.easyTraining.model.Vehicles;
import com.louismzl.easyTraining.service.ParkingServices;

public class ParkingBot {

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
        // Instanciation d'un véhicule
        Vehicles peugeot = new Vehicles();
        peugeot.setRegistrationNumber("FF-014-JN");
        peugeot.setCategory("BERLINE");

        // Instanciation d'un parkingServices
        ParkingServices parkingService = new ParkingServices();

        // Création d'un ticket avec les informations du véhicule peugeot
        Tickets ticket = parkingService.processIncommingVehicle(peugeot);
        System.out.println(ticket);
    }


}