package com.mycompany.ejercicio_10;

/**
 *
 * @author Gary
 */
public class Calculo {
    public static float dividir(int a, int b) throws ArithmeticException, PersonalizadaExeption{
        try {
            if ((a/b) % 2 == 0){
                return a/b;
            }else{
                throw new PersonalizadaExeption("La division no da resultado par :()");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw new ArithmeticException("Error aritmético, División por 0");
        }
    }
}
