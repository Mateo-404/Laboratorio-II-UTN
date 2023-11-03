package com.mycompany.ejercicio_11;

import com.mycompany.ejercicio_11.Interfaces.Icomer;
import com.mycompany.ejercicio_11.Interfaces.Inadar;

public class Delfin extends Animal implements Icomer, Inadar {
    public Delfin(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public int getEdad() {
        
        return super.getEdad();
    }

    @Override
    public String getNombre() {
        
        return super.getNombre();
    }

    @Override
    public void setEdad(int edad) {
        
        super.setEdad(edad);
    }
    
    @Override
    public void setNombre(String nombre) {
        
        super.setNombre(nombre);
    }
    //Metodo
    @Override
    public void emitirSonido() {
        System.out.println("Glup, soy un delfin");
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando wiii");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo");
    }
}
