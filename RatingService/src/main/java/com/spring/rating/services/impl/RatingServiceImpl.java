package com.spring.rating.services.impl;

import com.spring.rating.entities.Rating;
import com.spring.rating.respositories.ReatingRepository;
import com.spring.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.random.RandomGenerator;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    ReatingRepository reatingRepository;
    @Override
    public Rating createRating(Rating rating) {
        String randomRatingId = UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return this.reatingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return this.reatingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return this.reatingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHoteld(String hotelId) {
        return this.reatingRepository.findByHotelId(hotelId);
    }
}
