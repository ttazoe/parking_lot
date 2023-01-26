package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response {
    private int id;
    private boolean isFree;
    @JsonProperty("parkedVehicle")
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean a) {
        isFree = a;
    }
}
