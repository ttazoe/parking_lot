package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ParkingSpotController {
    @Autowired
    private ParkingSpotService parkingSpotService;

    @GetMapping("/park")
    public ResponseEntity<List<ParkingSpot>> getAllParkingSpots(){
        List<ParkingSpot> body = parkingSpotService.listParkingSpots();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
