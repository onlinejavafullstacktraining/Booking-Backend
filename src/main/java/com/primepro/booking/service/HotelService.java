package com.primepro.booking.service;

import com.primepro.booking.model.Hotel;
import com.primepro.booking.model.HotelRoom;
import com.primepro.booking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private HotelRoomService hotelRoomService;

    public Hotel addHotel(Hotel hotel) {
        Hotel save = hotelRepository.save(hotel);
        for (HotelRoom room : hotel.getRooms()) {
            hotelRoomService.saveHotelRoom(room);
        }
        return save;
    }
}
