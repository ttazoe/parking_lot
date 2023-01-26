package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingSpotController {
    @Autowired
    private ParkingSpotService parkingSpotService;

    @Autowired
    private VehicleService vehicleService;


    @PostMapping("/parking-spot")
    public int addParkingSpot(@RequestBody ParkingSpot parkingSpot){
        parkingSpot.setId(0);
        return parkingSpotService.addParkingSpot(parkingSpot);
    }

    @PutMapping("/parking-spot/{id}")
    public int updateParkingSpot(@PathVariable int id, @RequestBody ParkingSpot parkingSpot) {
        return parkingSpotService.updateParkingSpot(id, parkingSpot);
    }

    @GetMapping("/park")
    public ResponseEntity<List<ParkingSpot>> getAllParkingSpots(){
        List<ParkingSpot> body = parkingSpotService.listParkingSpots();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    // TODO : 全車両取得、id 取得で同じ動作をするためにはどこに動作を定義する必要があるか？
    @GetMapping("/park/{id}")
    public ResponseEntity<Response> getOneParkingSpot(@PathVariable int id){
        ParkingSpot body = parkingSpotService.getOneParkingSpot(id);
        Vehicle vBody = vehicleService.getOneVehicle(body.getVehicleId());
        Response rBody = new Response(body.getId(), body.getIsFree(),vBody);
        return new ResponseEntity<>(rBody, HttpStatus.OK);
    }
}
