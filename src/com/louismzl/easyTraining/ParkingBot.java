package com.louismzl.easyTraining;

public class ParkingBot {

    /**
     * Fonction principale du programme.
     * @param args Données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        sayHello(args[0]);
    }

    /**
     * Affiche les messages d'accueil au visiteur.
     * @param arg Nom du visiteur.
     */
    private static void sayHello(String arg) {
        String welcomeMessage = "Bonjour " + arg + ", bienvenue au Parking Pinguin";
        String services = "Services proposés: Gardienage, laverie ...";
        String warning = "Dépechez-vous car il n'y aura bientôt plus de place !";

        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }

    /*
    Compilation de la classe (à utiliser après chaque modification):
    javac src/com/louismzl/easyTraining/ParkingBot.java
    Exécution de la classe:
    java --class-path src com.louismzl.easyTraining.ParkingBot <args>
     */
}