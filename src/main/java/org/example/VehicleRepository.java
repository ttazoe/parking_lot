package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class VehicleRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Vehicle> findAll(){
        String sql = "select * from vehicle";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Vehicle>(Vehicle.class));
    }
    public Vehicle getOne(int id){
        String sql = "select * from vehicle where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Vehicle>(Vehicle.class), new Object[] {id});
    }
}
