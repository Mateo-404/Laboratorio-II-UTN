/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_11;

/**
 *
 * @author Gary
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        //Pruebas
        System.out.println("\n <-- Perro -->");
        Perro perro = new Perro("Pompi", 2);
        perro.emitirSonido();
        System.out.println(perro.getEdad());
        System.out.println(perro.getNombre());
        System.out.println(perro.olfatear());
        perro.comer();

        System.out.println("\n <-- Gato -->");
        Gato gato = new Gato("Pelusa", 3);
        gato.emitirSonido();
        System.out.println(gato.getEdad());
        System.out.println(gato.getNombre());
        System.out.println(gato.olfatear());
        gato.comer();

        System.out.println("\n <-- Delfin -->");
        Delfin delfin = new Delfin("Delfi", 4);
        delfin.emitirSonido();
        System.out.println(delfin.getEdad());
        System.out.println(delfin.getNombre());
        delfin.nadar();
        delfin.comer();

        System.out.println("\n <-- Murcielago -->");
        Murcielago murcielago = new Murcielago("Muri", 5);
        murcielago.emitirSonido();
        System.out.println(murcielago.getEdad());
        System.out.println(murcielago.getNombre());
        murcielago.volar();
    }
}
