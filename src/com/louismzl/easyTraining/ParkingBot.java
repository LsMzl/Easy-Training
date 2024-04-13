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
    }

    /**
     * Intanciation de chaque véhicule.
     * Génération d'un ticket avec les informations d'un véhicule
     * et la date d'entrée.
     */
    private static void processVehicles() {
        // Déclaration d'une liste de tickets (ensemble d'éléments ordonnés)
        //List<Tickets> tickets = new ArrayList<>();

        //Déclaration d'un ensemble d'éléments non ordonnés mais unique
        Set<Tickets> tickets = new HashSet<>();

        Vehicles vehicle = new Vehicles();
        vehicle.setRegistrationNumber("AZ-244-LV");
        Tickets vehicleTicket = parkingService.processIncomingVehicle(vehicle);
        tickets.add(vehicleTicket);

        Vehicles yamaha = new Bicycles();
        yamaha.setRegistrationNumber("MT-456-YH");
        Tickets bicycleTicket = parkingService.processIncomingVehicle(yamaha);
        tickets.add(bicycleTicket);

        Vehicles peugeot = new Cars();
        peugeot.setRegistrationNumber("FF-014-JN");
        Tickets carTicket = parkingService.processIncomingVehicle(peugeot);
        tickets.add(carTicket);

        // Déclaration d'un tableau contenant 3 tickets
        /*Tickets[] tickets = new Tickets[3];

        tickets[0] = vehicleTicket;
        tickets[1] = bicycleTicket;
        tickets[2] = carTicket;*/


        System.out.println("Traitement des sorties par lot");

        // Récupération de l'index des tickets et de leur données
        Map<Integer, Tickets> exitOrder = new HashMap<>();
        int position = 0;

        // Parcours des tickets
        for (Tickets ticket: tickets) {
            // On ajoute dans la map la position(index) et le ticket
            exitOrder.put(position, ticket);
            // Incrémentation de la position
            position++;
            // Affichage des tickets
            System.out.println(parkingService.processExitingVehicle(ticket));
        }

            // Affichage des positions
            Set<Integer> keySet = exitOrder.keySet();

            for (int key: keySet) {
                System.out.println("Position dans la liste : " + key + " \n " + exitOrder.get(key).getVehicule().getCategory());

            }
        }

        // Parcours du tableau
        /*for (int i = 0; i < tickets.length; i++) {
            System.out.println(parkingService.processExitingVehicle(tickets[i]));
        }*/

        //Parcours d'une liste
        /*for (int i = 0; i < tickets.size(); i++) {
            System.out.println(parkingService.processExitingVehicle(tickets.get(i)));
        }*/
        // ou
        /*for (Tickets ticket : tickets) {
            System.out.println(parkingService.processExitingVehicle(ticket));
        }*/

}