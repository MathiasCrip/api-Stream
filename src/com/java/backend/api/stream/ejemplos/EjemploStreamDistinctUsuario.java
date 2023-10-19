package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        /*
         * Transformamos un Stream de tipo String a uno de tipo Usuario
         */

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        /*El metodo split(),retorna un arreglo, dado un determinado patrón, en este caso al poner nombre.split(" ")[0],lo
        que estamos haciendo es leer el String hasta que encuentre un caracter vacio " ", y lo ponemos en a posicion [0],
        y de igual manera el apellido, lo guardamos en la posición [1]
        */
        nombres.forEach(System.out::println);

        //El operador distinct(),en este caso, elimina los NOMBRES duplicados

    }
}
