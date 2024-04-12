package com.louismzl.easyTraining.service;

import com.louismzl.easyTraining.model.Tickets;
import com.louismzl.easyTraining.model.Vehicles;

import java.util.Date;

public class ParkingServices {

    /**
     * Récupère les information d'un véhicule afin de générer un ticket.
     * @param vehicle vehicle Véhicule pour lequel on récupère les informations.
     * @return
     */
    public Tickets processIncommingVehicle(Vehicles vehicle){

        // Instanciation d'un ticket
        Tickets ticket = new Tickets();
        Date now = new Date();

        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicle);

        return ticket;
    }

}
