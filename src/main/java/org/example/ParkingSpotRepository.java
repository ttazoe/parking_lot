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
}
