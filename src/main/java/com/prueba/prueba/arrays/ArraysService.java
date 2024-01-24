/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.prueba.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Johan Castro - 2023/24/01
 */
@Service
public class ArraysService {

    private final ArraysRepository arraysRepository;

    @Autowired
    public ArraysService(ArraysRepository arraysRepository) {
        this.arraysRepository = arraysRepository;
    }

    public List<Arrays> getInput_array() {

        return this.arraysRepository.findAll();//REALIZA LA CONSULTA: SELECT * FROM bartender.arrays;
    }

    public Optional<Arrays> getArray(Long id) {
        return this.arraysRepository.findById(id);//REALIZA LA CONSULTA: SELECT * FROM bartender.arrays WHERE id =id; 
        
    }
    
    
    /*************FUNCION QUE MANEJA LA LOGICA DE LA API**********/
    public List<Integer> getAns(int iteraciones, String[] numberArray) {

        List<Integer> vasos = new ArrayList<>();
        for (String numberArray1 : numberArray) {
            vasos.add(Integer.valueOf(numberArray1));//CONVIERTE DE TIPO DE DATO INT[] A List<Integer> PARA UN MANEJO MAS SENCILLO
        }

        return evaluar(vasos, iteraciones);

    }

    /*************FUNCION QUE EVALUA EL ARREGLO DADO**********/
    public static List<Integer> evaluar(List<Integer> vasos, int iteraciones) {

        int[] primos = generarPrimos(iteraciones); //LLAMADO DE LA FUNCION PARA GENERAR EL ARREGLO "P"
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> respuesta = new ArrayList<>();

        for (int i = 0; i < primos.length; i++) {//EVALUA SI SE PROCESA RESPECTO AL ARREGLO ORIGINAL O AL ARREGLO "A"
            List<Integer> aux = new ArrayList<>();
            if (i == 0) {
                aux.addAll(vasos);
            } else {
                aux.addAll(A);
            }
            A.clear();
            B.clear();
            

            for (int j = aux.size() - 1; j >= 0; j--) {//REALIZA LA EVALUACION DEL ARREGLO CON EL RESPECTIVO NUMERO PRIMO
                //System.out.println(vasos[i]);
                if (aux.get(j) % primos[i] == 0) {
                    //System.out.println(vasos[i]);
                    B.add(aux.get(j));
                } else {
                    A.add(aux.get(j));
                }
            }
            

            respuesta.addAll(B);

            if (i == iteraciones - 1) {
                respuesta.addAll(A);//EVALUA SI SE ENCUENTRA EN LA ULTIMA ITERACION, PARA AGREGAR EL ARREGLO "A" A LA RESPUESTA
            }

        }

        return respuesta;

    }

    /*************FUNCION QUE GENERA NUMEROS PRIMOS**********/ 
    public static int[] generarPrimos(int cantidad) {
        List<Integer> primosList = new ArrayList<>();
        int numero = 2; // Comienza con el primer número primo

        while (primosList.size() < cantidad) {
            if (esPrimo(numero)) {
                primosList.add(numero);
            }
            numero++;
        }

        // Convierte la lista de primos a un arreglo
        int[] primosArray = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            primosArray[i] = primosList.get(i);
        }

        return primosArray;
    }

    
    /*************FUNCION QUE EVALUA SI UN NUMERO ES PRIMO**********/
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        // Verifica primos potenciales desde 5 hasta la raíz cuadrada de num
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
