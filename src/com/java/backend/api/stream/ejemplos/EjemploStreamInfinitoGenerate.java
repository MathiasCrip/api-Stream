package com.java.backend.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {

        /*
        AtomicInteger nos permite usar variables de tipo enteras de manera global, ya que al implementar una función anonima, nos impide
        utilizar variables fuera de la lambda
        */
        AtomicInteger contador = new AtomicInteger(0);

        /*
        Stream.generate() ->Devuelve un flujo secuencial infinito y desordenado donde cada elemento es generado por el proveedor.
        En este ej. le damos un limete de frecuencia de 7 repeticiones
        */
        Stream.generate(() -> {

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return contador.incrementAndGet();
                })
                .limit(7)
                .forEach(System.out::println); //imprimimos cada iteracion cada 2 segundos
    }
}
