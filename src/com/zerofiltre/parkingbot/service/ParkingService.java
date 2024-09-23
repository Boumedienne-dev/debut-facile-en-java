package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicule;

import java.util.Date;

public class ParkingService {

    public Ticket processIncomingVehicle(Vehicule vehicule) {
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicule);

        return ticket;
    }
}
