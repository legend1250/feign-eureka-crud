/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.DAO;

import com.gradle.model.ItemDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Vinh
 */
@Component
public interface ItemDAO {
    Object getData();
    Object insertOne(ItemDTO item);
    Object deleteOneById(int id);
}
