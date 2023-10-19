package com.java.backend.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*
        CREAR UN STREAM A PARTIR DE UNA LISTA
        */

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        Stream<String> nombres2 = lista.stream();
        nombres2.forEach(System.out::println);

        /*------------------------------------------------------------------------*/
        /*
        CREAR UN STREAM AL VUELO
        */

        Stream<String> nombres = Stream.<String>builder()
                .add("Pato")
                .add("paco")
                .add("pepa")
                .add("pepe")
                .build();
        nombres.forEach(System.out::println);


    }
}
