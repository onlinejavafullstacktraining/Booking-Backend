package com.primepro.booking.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int hotelId;
    private String hotelName;
    private double price;
    private String hotelDescription;
    private int availableRooms;

    private String location;
    @OneToMany(mappedBy = "hotel")
    private Set<HotelRoom> rooms;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<HotelRoom> getRooms() {
        return rooms;
    }

    public void setRooms(Set<HotelRoom> rooms) {
        this.rooms = rooms;
    }
}
