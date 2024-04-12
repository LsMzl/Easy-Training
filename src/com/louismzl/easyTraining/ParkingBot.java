package com.louismzl.easyTraining;

import com.louismzl.easyTraining.service.ParkingService;

public class ParkingBot {

    // Variable de type Globale
    static String completion = "de la part des équipes du Parking Pinguin !";
    static ParkingService parkingService = new ParkingService();

    /**
     * Fonction principale du programme.
     * @param args Tableau de données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        sayHello();
        sayBye();
    }

    /**
     * Affiche les messages d'accueil au visiteur.
     */
    private static void sayHello() {
        String welcomeMessage = "Bonjour et bienvenue " + completion;
        System.out.println(welcomeMessage);

        String parkService = parkingService.parking;
        String washService = parkingService.washing;
        System.out.println("Services proposés : " + parkService + " & " + washService);
    }

    /**
     * Affiche les messages d'au revoir au visiteur.
     */
    private static void sayBye() {
        String goodbyeMessage = "Au revoir et à bientôt " + completion;
        System.out.println(goodbyeMessage);
    }


}