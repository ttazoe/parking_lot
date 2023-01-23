package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean a) {
        isFree = a;
    }

    public ParkingSpot(){

    }

}
