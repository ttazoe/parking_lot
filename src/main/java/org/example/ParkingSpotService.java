package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParkingSpotService {
    @Autowired
    private ParkingSpotDao parkingSpotDao;

    public List<ParkingSpot> listParkingSpots(){
        return parkingSpotDao.findAll();
    }
}
