/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.DAO;

import com.gradle.model.AccountDTO;
import com.pms.jdbc.orm.RowMapperUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vinh
 */
@Service
public class UserDAOImpl implements UserDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public Object getData() {
        String sql = "select * from `authors` ORDER BY id DESC LIMIT 30";
        List<AccountDTO> allItem = jdbcTemplate.query(sql, RowMapperUtils.getRowMapper(AccountDTO.class));
        
        return allItem;
    }
    
}
