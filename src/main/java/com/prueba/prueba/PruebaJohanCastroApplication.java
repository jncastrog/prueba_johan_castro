package com.prueba.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Johan Castro - 2023/24/01
 * 
 * PARA HAER USO DE LA API, INGRESAR A LA RUTA api/v1/bartender, INGRESAR LA
 * CANTIDAD DE ITERACIONES Y EL ID DE LA PILA CON LA QUE SE VA A TRABAJAR
 * 
 * CONECTAR LA DB EN EL ARCHIVO DE "application.properties" EL CUAL SE ENCUENTRA
 * EN LA RUTA: \prueba_johan_castro\com.prueba_prueba_johan_castro\src\main\resources\application.properties
 */

@SpringBootApplication
public class PruebaJohanCastroApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaJohanCastroApplication.class, args);
    }

    

}
