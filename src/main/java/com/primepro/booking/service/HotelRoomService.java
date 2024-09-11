package com.primepro.booking.service;

import com.primepro.booking.model.HotelRoom;
import com.primepro.booking.repository.HotelRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomService {
    @Autowired
    private HotelRoomRepository hotelRoomRepository;
    public HotelRoom saveHotelRoom(HotelRoom room){
        return hotelRoomRepository.save(room);

    }

}
