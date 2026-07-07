package com.naman.learning.SpringJDBC.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.naman.learning.SpringJDBC.model.Alien;

@Repository
public class AlienRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void save(Alien alien){

        String sql = "INSERT INTO alien(id, name, tech) VALUES (?, ?, ?)";
        int rowAffected = template.update(sql, alien.getId(), alien.getName(), alien.getTech());

        System.out.println(rowAffected + " rows affected");
    }

    public List<Alien> findAll(){
        String sql = "SELECT * FROM alien";
        RowMapper<Alien> mapper = new RowMapper<Alien>() {

            @Override
            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTech(rs.getString(3));

                return a;
            }
            
        };
        
        List<Alien> aliens = template.query(sql, mapper);

        return aliens;
    }
}
