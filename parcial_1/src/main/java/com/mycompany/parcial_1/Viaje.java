/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_1;
import java.time.*;

import Utilidades.Control;
/**
 *
 * @author Gary
 */
public class Viaje {
    private Bus bus;
    private String origen, destino;
    private double kmRecorridos;
    

    public Viaje(Bus bus, String origen, String destino, double kmRecorridos) {
        this.bus = bus;
        this.origen = origen;
        this.destino = destino;
        this.kmRecorridos = kmRecorridos;
        
    }
    public static void agregarLista(Viaje viaje, Control control) {
        control.getViajes().add(viaje);
    }

    public static void cargarViaje(Bus bus, String origen, String destino, double kmRecorridos) {
        Viaje viajee = new Viaje(bus, origen, destino, kmRecorridos);
        System.out.println("Viaje cargado");
    }
    public Bus getBus() {
        return bus;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public double getKmRecorridos() {
        return kmRecorridos;
    }

    

}
