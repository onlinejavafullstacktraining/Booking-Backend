package com.primepro.booking.controller;

import com.primepro.booking.model.HotelSearchData;
import com.primepro.booking.service.HotelService;
import com.primepro.booking.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping("/addHotel")
    public ResponseEntity<String> addHotel(@RequestBody Hotel hotel){
        hotelService.addHotel(hotel);
        return null;
    }

    @PostMapping("/searchHotel")
    public ResponseEntity<String> searchHotel(@RequestBody HotelSearchData hotelSearchData){
        //based on location and check-in, check-out and guests load the data
        return null;
    }

    @PostMapping("/loadHotelLocations")
    public ResponseEntity<String> loadHotelLocations(){
        //
        return null;
    }
    @PostMapping("/bookingHotel")
    public ResponseEntity<String> bookingHotel(){
        //
        return null;
    }
}
