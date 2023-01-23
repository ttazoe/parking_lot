package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParkingSpotService {
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpot> listParkingSpots(){
        return parkingSpotRepository.findAll();
    }

    public ParkingSpot getOneParkingSpot(int id){
        ParkingSpot currentParkingSpot = parkingSpotRepository.getOne(id);
        return currentParkingSpot;
    }


}
