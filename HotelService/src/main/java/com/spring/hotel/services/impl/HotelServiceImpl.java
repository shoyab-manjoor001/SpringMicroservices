package com.spring.hotel.services.impl;

import com.spring.hotel.enitites.Hotel;
import com.spring.hotel.repositories.HotelRepository;
import com.spring.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.hotel.exceptions.HotelNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {

        String randomHotelId = UUID.randomUUID().toString();
        hotel.setHotelId(randomHotelId);
        return this.hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String hotelId) {
       return this.hotelRepository.findById(hotelId).orElseThrow(()-> new HotelNotFoundException("Hotel with the given id is not found :"+hotelId));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return this.hotelRepository.findAll() ;
    }
}
