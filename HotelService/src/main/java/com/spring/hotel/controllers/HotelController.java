package com.spring.hotel.controllers;

import com.spring.hotel.enitites.Hotel;
import com.spring.hotel.services.HotelService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createNewHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = this.hotelService.createHotel(hotel);
        return new ResponseEntity<Hotel>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id)
    {
        Hotel hotel = this.hotelService.getHotel(id);
        return  ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getListOfHotels()
    {
        return ResponseEntity.ok(this.hotelService.getAllHotels());
    }
}
