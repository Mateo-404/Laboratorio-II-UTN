package com.mycompany.ejercicio_5;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

public class Ejercicio_5 {

    public static void main(String[] args) {
        /*
        Ejercicio 5
        Persona persona = new Persona();
        Persona pers = new Persona("Mateo", "._.", "3425370985", 1, 8, 2004, true);
        System.out.println("Mi edad es: " + pers.obtenerEdad(1, 9, 2023));
        System.out.println(pers.datosString());
        */
        //Ejer 6
        Vehiculo miauto = new Vehiculo(4, "Rojo", tipo_vehiculo.AUTO, 2003, 2015, "AAA213BB", LocalDate.of(2020, Month.MARCH, 1));
        System.out.println(miauto.datosString());
    }
}
