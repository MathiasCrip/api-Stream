package com.java.backend.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> NOMBRES =  Stream.of(5, 10, 15, 20);
        
        int resultado = NOMBRES.reduce(0, Integer::sum);
        System.out.println(resultado);



    }
}
