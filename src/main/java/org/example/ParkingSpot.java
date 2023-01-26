package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class ParkingSpot {
    private int id;
    private boolean isFree;
    private int vehicleId;

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean a) {
        isFree = a;
    }

    public ParkingSpot(){

    }

}
