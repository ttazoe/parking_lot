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


    @GetMapping("/park")
    public ResponseEntity<List<ParkingSpot>> getAllParkingSpots(){
        List<ParkingSpot> body = parkingSpotService.listParkingSpots();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    // TODO : 全車両取得、id 取得で同じ動作をするためにはどこに動作を定義する必要があるか？
    @GetMapping("/park/{id}")
    public ResponseEntity<ParkingSpot> getOneParkingSpot(@PathVariable int id){
        ParkingSpot body = parkingSpotService.getOneParkingSpot(id);
        // TODO : body から vehicle_id を抽出して、車両情報を取得する。
        // TODO : Parking spot と組み合わせて通知する。
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
