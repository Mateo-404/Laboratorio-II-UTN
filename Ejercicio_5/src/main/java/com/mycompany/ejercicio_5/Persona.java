/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

public class Persona {
    String nombre, direccion, telefono;
    int dia, mes, anio;
    boolean sexo;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono, int dia, int mes, int anio, boolean sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.sexo = sexo;
    }
    
    
    
    public int obtenerEdad(int Dia, int Mes, int Anio) {
        int edad;
        edad = Anio - this.anio;
        if (this.mes == Mes){
            if (this.dia < Dia){
                edad--;
            }
        }
        return edad;
    }
    
    public String datosString (){
        return String.format("Nombre: %s | Direccion: %s | Telefono: %s | Fecha de nacimiento: %d/%d/%d", nombre, direccion, telefono, dia, mes, anio);
    }
    
    
    
}
