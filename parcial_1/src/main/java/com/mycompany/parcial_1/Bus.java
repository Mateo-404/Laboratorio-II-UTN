/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_1;

import java.time.LocalDate;
/**
 *
 * @author Gary
 */
import Utilidades.*;
enum marca{
    MERCEDES_BENZ
}
public class Bus {
    private marca marca;
    private String patente;
    private double kilometraje;
    LocalDate ultimaRtv, anioPatentamiento;
    
    public Bus() {
    }

    public Bus(com.mycompany.parcial_1.marca marca, String patente, double kilometraje, LocalDate ultimaRtv,LocalDate anioPatentamiento, Control control) {
        this.marca = marca;
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.ultimaRtv = ultimaRtv;
        this.anioPatentamiento = anioPatentamiento;
        //Agregar a la lista de buses
        control.getBuses().add(this);
    }
    public marca getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public LocalDate getUltimaRtv() {
        return ultimaRtv;
    }

    public LocalDate getAnioPatentamiento() {
        return anioPatentamiento;
    }
    

}
