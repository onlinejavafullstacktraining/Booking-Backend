package com.primepro.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public void addHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
