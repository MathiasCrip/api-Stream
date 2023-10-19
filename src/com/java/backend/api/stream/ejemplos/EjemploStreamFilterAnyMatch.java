package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(4));

        //map -> Convertimos el flujo de datos de tipo String a uno de tipo Usuario
        //anyMatch -> retorna un booleano, si existe el elemento buscado, en este caso, el ID

        System.out.println(existe);

 //MANERA IPERATIVA DE HACER LO MISMO QUE CON EL API STREAM ☝️

        /*List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Guzman"),
                new Usuario("Paco", "Gonzalez"),
                new Usuario("Pepa", "Gutierrez"),
                new Usuario("Pepe", "Mena"),
                new Usuario("Pepe", "Garcia"));

        boolean resultado = false;
        for(Usuario u: lista){
            if(u.getId().equals(4)){
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);

         */
    }
}
