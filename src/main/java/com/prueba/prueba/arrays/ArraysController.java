/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;


/**
 *
 * @author Johan Castro - 2023/24/01
 */
//CONTROLADOR DE LA API BARTENDER - USAR RUTA api/v1/bartender PARA INTRODUCIR DATOS
@RequestMapping("api/v1/bartender")

@Controller
public class ArraysController {

    private final ArraysService arraysService;

    @Autowired
    public ArraysController(ArraysService arraysService) {
        this.arraysService = arraysService;
    }

    @GetMapping
    public String mostrarFormulario() {
        
        return "formulario";//RENDERIZA EL FORMULARIO HTML DE INGRESO DE DATOS
    }

    @PostMapping("/post")
    public String manejarPost(@ModelAttribute DTO dto, Model model) {

        List<Integer> respuesta = new ArrayList<>();

        int iteraciones = dto.getIteraciones();
        int id = dto.getId();
        Long longaux = (long) id;
        
        Arrays arreglo = this.arraysService.getArray(longaux).get();//BUSCA EL ID DE LA PILA EN LA DB
        String[] numberArray = arreglo.getInput_array().split("\\s*,\\s*");

        respuesta = this.arraysService.getAns(iteraciones, numberArray);// REALIZA LA LOGICA RELACIONADA CON EL REQUERIMIENTO DE LA API, REFERIRCE A LA CLASE "ArraysService"

        model.addAttribute("resultado", respuesta);

        return "resultado"; //RENDERIZA EL HTML CON LA RESPUESTA
    }

} 
