/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gradle.model;

import com.pms.jdbc.orm.Key;
import java.util.Date;

/**
 *
 * @author Vinh
 */
public class ItemDTO {
    @Key(value = "id")
    private int id;
    @Key(value = "name")
    private String name;
    @Key(value = "description")
    private String description;
    @Key(value = "created_by")
    private String created_by;
    @Key(value = "created_date")
    private Date created_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
}
