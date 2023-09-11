/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5;

/**
 *
 * @author Gary
 */
import java.util.*;
import java.time.LocalDate;

enum tipo_vehiculo{
    AUTO,PICKUP,MOTO,CAMION
}
    
public class Vehiculo {
   
    private int cant_ruedas;
    private String color;
    private tipo_vehiculo tipo;
    private int anio;
    private int tecnica;
    private String patente;

    public Vehiculo(tipo_vehiculo tipo, String patente) {
        this.tipo = tipo;
        this.patente = patente_valida(patente); // Hay que cambiarlo por la funcion que valide la patente
    }
    

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        Scanner scanner = new Scanner(System.in);
        while ((anio < 1900) || (anio > LocalDate.now().getYear())){
            System.out.println("Ingrese un año [1900 - Fecha actual]");
            anio = scanner.nextInt();
        }
        this.anio = anio;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }
    
    private String patente_valida(String patente){
        Scanner scanner = new Scanner(System.in);
        int i;
        switch (patente.length()){
            case 6:
                for(i=0;i<3;i++){
                    if ((patente.charAt(0)>="A"))
                }
            default:
                System.out.println("La patente escrita no es valida, ingresela nuvamente");
                patente = scanner.nextLine();
            break;
        }
    
    
}
