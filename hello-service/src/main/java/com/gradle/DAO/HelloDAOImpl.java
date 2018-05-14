/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.DAO;

import com.gradle.DAO.HelloDAO;
import com.gradle.model.ItemDTO;
import com.pms.jdbc.orm.RowMapperUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vinh
 */
@Service
public class HelloDAOImpl implements HelloDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public Object getData() {
        String sql = "Select * from items";
        List<ItemDTO> allItem = jdbcTemplate.query(sql, RowMapperUtils.getRowMapper(ItemDTO.class));
        
        return allItem;
    }
    
}
