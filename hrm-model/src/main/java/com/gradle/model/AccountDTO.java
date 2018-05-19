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
 * @author mark.intern
 */

public class AccountDTO {
    
    @Key(value = "id")
    private int id;
    @Key(value = "first_name")
    private String first_name;
    @Key(value = "last_name")
    private String last_name;
    @Key(value = "email")
    private String email;
    @Key(value = "birthdate")
    private Date birthdate;
    @Key(value = "added")
    private Date added;

    
    public AccountDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }
}