package com.louismzl.easyTraining;

public class Main {

    public static void main(String[] args) {

        int length = 180;
        int width = 120;

        int perimeter = (length + width) * 2;
        int surface = (length * width);
        // CAST - Convertion de type d'une variable
        float ratio = (float) width / length;

        System.out.println("Le perimètre de la voiture est de : " + perimeter + " cm");
        System.out.println("La surface de la voiture est de : " + surface + " cm²");
        System.out.println("La ratio de la voiture est de : " + ratio);

    }
}