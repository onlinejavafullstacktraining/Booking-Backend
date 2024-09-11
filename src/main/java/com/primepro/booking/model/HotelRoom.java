package com.primepro.booking.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotelRoom")
public class HotelRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int roomId;
    private String roomName;
    private double roomPrice;
    private boolean isAvailable;
    @ManyToOne
    @JoinColumn(name="hotel_id", nullable=false)
    private Hotel hotel;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
