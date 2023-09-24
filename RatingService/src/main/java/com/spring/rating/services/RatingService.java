package com.spring.rating.services;

import com.spring.rating.entities.Rating;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    // creating a rating
    Rating createRating(Rating rating);

    // get all ratings
    List<Rating> getAllRatings();

    // get all ratings by user id
    List<Rating> getRatingByUserId(String userId);

    // get all rating by hotel id
    List<Rating> getRatingByHoteld(String hotelId);

}
