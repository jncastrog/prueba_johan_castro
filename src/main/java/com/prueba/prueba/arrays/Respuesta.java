/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.arrays;

import java.util.List;

/**
 *
 * @author Johan Castro - 2023/24/01
 */
public class Respuesta {
    private List<Integer> valoresB;
    private List<Integer> valoresRestantes;

    public Respuesta(List<Integer> valoresB, List<Integer> valoresRestantes) {
        this.valoresB = valoresB;
        this.valoresRestantes = valoresRestantes;
    }

    public List<Integer> getValoresB() {
        return valoresB;
    }

    public List<Integer> getValoresRestantes() {
        return valoresRestantes;
    }

    public void setValoresB(List<Integer> valoresB) {
        this.valoresB = valoresB;
    }

    public void setValoresRestantes(List<Integer> valoresRestantes) {
        this.valoresRestantes = valoresRestantes;
    }

    
}
