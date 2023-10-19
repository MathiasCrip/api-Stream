package com.java.backend.api.stream.ejemplos;

import com.java.backend.api.stream.ejemplos.models.Factura;
import com.java.backend.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        /*
         * Obtenemos los datos de las facturas, atraves de los usuarios
         */

//        creamos usuarios
        Usuario u1 = new Usuario("German", "Zamora");
        Usuario u2 = new Usuario("Pepe", "Pérez");
//        agregamos una factura x cada usuario
        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

//        Generamos una lista de Usuarios con los dos usuarios creados
        List<Usuario> usuarios = Arrays.asList(u1, u2);

//        Creamos un Stream de usuarios, aplicamos flatMap para recorrer las facturas apartir del usuario y devolvemos el stream() nuevo, de tipo factura
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));

//        MANERA IMPERATIVA SIN USAR EL API STREAM DE RECORRER LOS USUARIOS, Y ATRAVES DE ÉSTOS, RECORRER SUS FACTURAS

        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
