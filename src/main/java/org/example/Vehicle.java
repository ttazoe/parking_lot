package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Vehicle {
    private int id;
    private String name;

    public Vehicle(){
    }
}
