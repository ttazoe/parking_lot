package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;


    public List<Vehicle> listVehicles(){
        return vehicleRepository.findAll();
    }
    public Vehicle getOneVehicle(int id){
        Vehicle currentParkingSpot = vehicleRepository.getOne(id);
        return currentParkingSpot;
    }
}
