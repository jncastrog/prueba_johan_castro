/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Johan Castro - 2023/24/01
 */
@Entity
@Table
public class Arrays {
    
    @Id
    private int id;
    
    
    private String input_array;

    public Arrays() {
    }

    public Arrays(int id, String input_array) {
        this.id = id;
        this.input_array = input_array;
    }

    public Arrays(String input_array) {
        this.input_array = input_array;
    }

    public int getId() {
        return id;
    }

    public String getInput_array() {
        return input_array;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInput_array(String input_array) {
        this.input_array = input_array;
    }
    
    
    
}


