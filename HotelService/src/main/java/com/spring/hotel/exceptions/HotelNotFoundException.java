package com.spring.hotel.exceptions;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException()
    {
        super("Hotel Not Found in DataBase..");
    }

    public  HotelNotFoundException(String message)
    {
        super(message);
    }
}
