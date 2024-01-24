/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.arrays;

/**
 *
 * @author Johan Castro - 2023/24/01
 * DTO = DATA TRANSFER OBJECT, usado para recibir los datos del formulario
 */
public class DTO {
    
    private int iteraciones;
    private int id;

    public DTO(int iteraciones, int id) {
        this.iteraciones = iteraciones;
        this.id = id;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public int getId() {
        return id;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
