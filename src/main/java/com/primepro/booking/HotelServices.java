package com.primepro.booking;

import jakarta.persistence.*;

@Entity
@Table
public class HotelServices {
    //DRY_CLEANING, ROOM_SERVICE,SPECIAL_SERVICE,WAITING_AREA,SMOKING_AREA,CONCIERGE,LAUNDRY_FACILITIES,IRONING_SERVICE,LIFT
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int hotelServiceId;
    private String dryCleaning;
    private String roomService;
    private String specialService;
    private String waitingArea;
    private String smokingArea;
    private String concierge;
    private String laundryFacilities;
    private String ironingService;
    private String lift;
}
