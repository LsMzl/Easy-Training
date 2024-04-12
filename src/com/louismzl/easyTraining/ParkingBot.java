package com.louismzl.easyTraining;


import java.security.SecureRandom;

public class ParkingBot {

    static String[] customers =
            {"Tom", "Ethan", "Louis", "Camille", "Alex", "Océane", "Gabriel", "Bruce"};
    
    // Génération d'un nombre entre 0 et 7
    static int parkingSize = new SecureRandom().nextInt(10);


    /**
     * Fonction principale du programme.
     * @param args Tableau de données passées en paramètre lors du lancement du programme.
     */
    public static void main(String[] args) {
        // Boucle for classique
        /*for (int i = 0; i < customers.length; i++) {
            sayHello(customers[i] );
        }*/

        // Boucle for améliorée
        /*for (String customer:customers) {
            sayHello(customer);
        }*/

        // Boucle while
        System.out.println("Il y a " + parkingSize + " places restante(s).");
        int customerNumber = 0;

        while (parkingSize > 0) {
            parkingSize--;

            // Si le client = Alex
            if("Alex".equals(customers[customerNumber])) {
                customerNumber++;
                // On ignore Alex et on passe au client suivant (on "saute" une itération)
                parkingSize++;
                continue;
            }
            // Si le client = Gabriel
            if("Gabriel".equals(customers[customerNumber])) {
                System.out.println("Attention, le client Gabriel est ici ! \nFermeture du parking...");
                // On stoppe la boucle
                break;
            }
            sayHello(customers[customerNumber]);
            customerNumber++;
        }

    }

    /**
     * Affiche les messages d'accueil au visiteur.
     */
    private static void sayHello(String customer) {
        String welcomeMessage = "Bonjour et bienvenue " + customer;
        System.out.println(welcomeMessage);
    }

    /**
     * Affiche les messages d'au revoir au visiteur.
     */
    private static void sayBye() {
        String goodbyeMessage = "Au revoir et à bientôt ";
        System.out.println(goodbyeMessage);
    }


}