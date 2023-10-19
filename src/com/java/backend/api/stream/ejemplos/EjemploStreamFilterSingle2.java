package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

//        Otra manera de implementar el findFirst() en el mismo flujo de datos, si existe se imprime, sino, se crea un usuario por defecto 'John' 'Doe'

        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(1))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(usuario);

    }
}
