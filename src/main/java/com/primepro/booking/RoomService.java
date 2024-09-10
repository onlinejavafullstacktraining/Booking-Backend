package com.primepro.booking;

import jakarta.persistence.*;

@Entity
@Table
public class RoomService {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int roomServiceId;
    private String airConditioning;
    private String wifi;
    private String kitchen;
}
