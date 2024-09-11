package com.primepro.booking.controller;

import com.primepro.booking.model.Amenities;
import com.primepro.booking.model.HotelSearchData;
import com.primepro.booking.model.RoomService;
import com.primepro.booking.service.HotelService;
import com.primepro.booking.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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
    @PostMapping("/loadHotelAmenities")
    public ResponseEntity<List<Amenities>> loadHotelAmenities(){
        return ResponseEntity.ok(Arrays.asList(Amenities.GYM,Amenities.SPA,Amenities.SWIMMING_POOL,Amenities.KIDS_PLAY_AREA));
    }
    @PostMapping("/loadHotelServices")
    public ResponseEntity<List<RoomService>> loadHotelServices(){
        return ResponseEntity.ok(Arrays.asList(RoomService.WIFI,RoomService.KITCHEN,RoomService.AIR_CONDITIONING));
    }
}
