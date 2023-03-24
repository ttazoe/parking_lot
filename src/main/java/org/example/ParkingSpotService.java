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
        if (currentParkingSpot == null){
            throw new ParkingSpotNotFoundException("Parking spot with id {" + id + "} not found");
        }
        return currentParkingSpot;
    }

    public int addParkingSpot(ParkingSpot parkingSpot){
        return parkingSpotRepository.addParkingSpot(parkingSpot);
    }

    public ParkingSpot updateParkingSpot(int id, ParkingSpot parkingSpot) {
        return parkingSpotRepository.updateParkingSpotStatus(id, parkingSpot);
    }

    public int deleteParkingSpot(int id){
        return parkingSpotRepository.deleteParkingSpot(id);
    }

}
