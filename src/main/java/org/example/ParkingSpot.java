package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class ParkingSpot {
    private int id;
    private boolean isFree;

    public ParkingSpot(){

    }
}
