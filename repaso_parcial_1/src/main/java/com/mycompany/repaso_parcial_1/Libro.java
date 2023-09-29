/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_parcial_1;

/**
 *
 * @author Grary
 */
public class Libro {
    //Consultar profe
    private String titulo, autor;
    private int anio;
    private double id;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anio, double id) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public double getId() {
        return id;
    }
    
    
}
