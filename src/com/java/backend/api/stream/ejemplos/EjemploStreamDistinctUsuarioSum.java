package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        /*
         * IntStream es un tipo Stream, pero que solo trabaja con flujos numericos, ademas de contar con metodos propios
         * del api Stream, cuenta con los metodos propios de IntStream. Esta es la especialización int primitiva de Stream.
         * Asi como existe el IntStream, tambien existen el LongStream y DoubleStream.
         */

        //Mediante un stream con valores Strings (nombres), retornamos la cantidad de caracteres de cada nombre completo

        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);
        /*
        peek -> Cumple la misma función que el forEach, imprime por consola, pero tambien retorna sus valores. Distinto el forEach, es un método void, de manera que, este ejemplo, no
         funcionaria, porque estamos retornando un valor de tipo IntStream
         */

        //mapToInt -> itera por cada nombre completo y retorna la cantidad total de carateres con length()


        //IntSummaryStatistics -> Es objeto de estado para recopilar estadísticas como recuento, mínimo, máximo, suma y promedio.

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("total: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("promedio :" + stats.getAverage());
    }
}
