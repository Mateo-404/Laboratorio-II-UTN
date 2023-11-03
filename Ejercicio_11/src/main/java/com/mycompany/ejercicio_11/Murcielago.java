package com.mycompany.ejercicio_11;

import com.mycompany.ejercicio_11.Interfaces.Ivolar;

public class Murcielago extends Animal implements Ivolar{

    
    public Murcielago(String nombre, int edad) {
        super(nombre, edad);
        //TODO Auto-generated constructor stub
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
    //Metodos
    @Override
    public void emitirSonido() {
        System.out.println(" * chilla *, soy un murcielago");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }
    
}
