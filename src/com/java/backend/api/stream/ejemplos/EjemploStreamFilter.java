package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equalsIgnoreCase("Pepe"))
                .peek(System.out::println);

        //map -> Convertimos el flujo de datos de tipo String a uno de tipo Usuario
        //filter -> metodo que filtra mediante una condicion, en este caso, filtra todos los nombres iguales a 'pepe'

        //Convertimos el Stream en una lista con toList()
        List<Usuario> lista = nombres.toList();
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
