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
import java.time.Period;

enum tipo_vehiculo {
    AUTO, PICKUP, MOTO, CAMION
}

public class Vehiculo {

    private int cant_ruedas;
    private String color;
    private tipo_vehiculo tipo;
    private int anio;
    private int tecnica;
    private String patente;
    private LocalDate patente_fecha;

    public Vehiculo() {
    }

    public Vehiculo(tipo_vehiculo tipo, String patente) {
        this.tipo = tipo;
        this.patente = patente_valida(patente); // Hay que cambiarlo por la funcion que valide la patente
    }

    public Vehiculo(int cant_ruedas, String color, tipo_vehiculo tipo, int anio, int tecnica, String patente, LocalDate patente_fecha) {
        this.cant_ruedas = cant_ruedas;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.tecnica = tecnica;
        this.patente = patente_valida(patente);
        this.patente_fecha = patente_fecha;
    }
    

    //Metodos
    private int verificarAnio(int anio) {
        Scanner scanner = new Scanner(System.in);
        while ((anio < 1900) || (anio > LocalDate.now().getYear())) {
            System.out.println("Ingrese un año [1900 - Fecha actual]");
            anio = scanner.nextInt();
        }
        return anio;
    }

    private String patente_valida(String patente) {
        //Problema con la flag, nunca cambia a true
        Scanner scanner = new Scanner(System.in);
        int i;
        boolean flag = true, flag2 = true;
        while (flag) {
            switch (patente.length()) {
                case 6:
                    for (i = 0; i < 3; i++) {
                        if ((patente.charAt(i) < 'A')){
                            System.out.println("ERROR, PRIMEROS 3 SIN NUMEROS TIENEN QUE SER");
                            flag2 = false;
                            break;
                        }
                    }
                    for (i = 3; i < patente.length(); i++) {
                        if ((patente.charAt(i) > 'A')){
                            System.out.println("ERROR, ULTIMOS 3 NUMEROS TIENEN QUE SER");
                            flag2 = false;
                            break;
                        }
                    }
                    // Si todo esta bien se rompe el ciclo
                    if (flag2) {
                        flag = false;
                        break;
                    } else {
                        System.out.println("Ingrese nuevamente la patente");
                        patente = scanner.nextLine();
                    }
                    break;
                case 7:
                    for (i = 0; i < 2; i++) {
                        if ((patente.charAt(i) < 'A')) {
                            System.out.println("ERROR, PRIMEROS 2 SIN NUMEROS TIENEN QUE SER");
                            flag2 = false;
                            break;
                        }
                    }
                    for (i = 2; i < 5; i++) {
                        if ((patente.charAt(i) > 'A')) {
                            System.out.println("ERROR, 3 DEL MEDIO SOLO NUMEROS TIENEN QUE SER");
                            flag2 = false;
                            break;
                        }
                    }
                    for (i = 5; i < 7; i++) {
                        if ((patente.charAt(i) < 'A')) {
                            System.out.println("ERROR, ULTIMOS 2 SIN NUMEROS TIENEN QUE SER");
                            flag2 = false;
                            break;
                        }
                    }
                    // Si todo esta bien se rompe el ciclo
                    if (flag2) {
                        flag = false;
                    }else{
                        System.out.println("Ingrese nuevamente la patente");
                        patente = scanner.nextLine();
                    }
                    break;

                default:
                    System.out.println("La patente escrita no es valida, ingresela nuvamente");
                    patente = scanner.nextLine();
            }
        }
        return patente;
    }
    public boolean revisionTecnicaAlDia(LocalDate patente_fecha) {
        if (Period.between(this.patente_fecha, LocalDate.now()).getYears() >= 2) {
            return false;
        } else {
            return true;
        }
    }
    
    public String datosString(){
        String valida;
        if(revisionTecnicaAlDia(this.patente_fecha)){
            valida = "Valida";
        }else{
            valida = "No valida";
        }
        String cadena = "Patente: " + this.patente + "- Tipo de vehiculo: " + this.tipo + "- Modelo: " + this.anio + "- Revisión Técnica: " + valida;
        return cadena;
    }
}