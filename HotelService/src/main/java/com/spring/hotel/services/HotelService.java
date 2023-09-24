package com.spring.hotel.services;

import com.spring.hotel.enitites.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public Hotel createHotel(Hotel hotel);
    public Hotel getHotel(String hotelId);
    public List<Hotel> getAllHotels();
}
