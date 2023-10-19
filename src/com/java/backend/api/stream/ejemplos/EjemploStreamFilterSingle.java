package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

//       filtra solo los datos con el nombre de 'Pepe', retornando el objeto Usuario

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"));

//        map -> Convertimos el flujo de datos de tipo String a uno de tipo Usuario

//        Buscamos en el stream el primer dato con el nombre 'Pepe', de haber 2 o más, recoje el primero que encuentre y listo con findFirst()

        Optional<Usuario> usuario = nombres.findFirst();

//        Validamos si el objeto existe, sino, de existir, entra al if, sino, al else
        if (usuario.isPresent()) {
            System.out.println(usuario.get().getNombre().concat(" ").concat(usuario.get().getApellido()));
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
