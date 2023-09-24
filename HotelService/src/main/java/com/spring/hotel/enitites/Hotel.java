package com.spring.hotel.enitites;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Hotels")
public class Hotel {

    @Id
    @Column(name = "ID")
    private String hotelId;
    @Column(name = "NAME",unique = true)
    private String hotelName;
    @Column(name = "LOCATION")
    private String hotelLocation;
    @Column(name = "ABOUT")
    private String aboutHotel;
}
