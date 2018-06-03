/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.DAO;

import com.gradle.model.ItemDTO;
import com.pms.jdbc.orm.RowMapperUtils;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vinh
 */
@Service
public class ItemDAOImpl implements ItemDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public static final String created_by = "Mark_Administrator";
    
    @Override
    public Object getData() {
        String sql = "Select * from items ORDER BY id DESC LIMIT 20";
        List<ItemDTO> allItem = jdbcTemplate.query(sql, RowMapperUtils.getRowMapper(ItemDTO.class));
        
        return allItem;
    }

    @Override
    public Object insertOne(ItemDTO item) {
        String sql = "call insert_One_Item(?,?,?)";
        ItemDTO item_response = jdbcTemplate.queryForObject(sql, RowMapperUtils.getRowMapper(ItemDTO.class), item.getName(), item.getDescription(), created_by);
        return item_response;
    }

    @Override
    public Object deleteOneById(int id) {
        String sql = "call delete_One_Item_By_Id(?)";
        HashMap<String, Object> response = new HashMap<String, Object>();
        boolean status_deleted = jdbcTemplate.update(sql, id) > 0;
        response.put("status_deleted", status_deleted);
        
        return response;
    }
    
    
    
}
