package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class ParkingSpot {
    private int id;
    private boolean isFree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean a) {
        isFree = a;
    }

    public ParkingSpot(){

    }
}
