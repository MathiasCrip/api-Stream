package com.java.backend.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

//        Genera una secuencia de numeros de 5(inclusive) a 20(no-inclusive) y se imprimen los valores
        IntStream num = IntStream.range(5, 20).peek(System.out::println);


//        Instanciamos un objecto de tipo IntSummaryStatistics y pasamos el objeto num por instancia, para que se
//        podamos usar las estadisticas sobre este objeto

        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());


    }
}
