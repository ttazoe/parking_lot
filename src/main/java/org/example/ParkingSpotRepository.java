package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParkingSpotRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ParkingSpot> findAll(){
        String sql = "select * from parking_spot";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<ParkingSpot>(ParkingSpot.class));
    }

    public ParkingSpot getOne(int id){
        String sql = "select * from parking_spot where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<ParkingSpot>(ParkingSpot.class), new Object[] {id});
    }

    public int addParkingSpot(ParkingSpot parkingSpot){
        String sql = "INSERT INTO parking_spot (is_free, vehicle_id) " + "VALUES (?,?)";
        return jdbcTemplate.update(sql, new Object[] {parkingSpot.getIsFree(),parkingSpot.getVehicleId()});
    }

    public int updateParkingSpotStatus(int id, ParkingSpot parkingSpot) {
        ParkingSpot currentParkingSpot = getOne(id);
        currentParkingSpot.setIsFree(parkingSpot.getIsFree());
        currentParkingSpot.setVehicleId(parkingSpot.getVehicleId());
        String sql = "UPDATE parking_spot SET is_free = ?, vehicle_id = ? where id = ?";
        return jdbcTemplate.update(sql, new Object[] {currentParkingSpot.getIsFree(), currentParkingSpot.getVehicleId(), currentParkingSpot.getId()});
    }

    public int deleteParkingSpot(int id) {
        String sql = "DELETE FROM parking_spot where id = ?";
        return jdbcTemplate.update(sql, new Object[] {id});
    }


}
