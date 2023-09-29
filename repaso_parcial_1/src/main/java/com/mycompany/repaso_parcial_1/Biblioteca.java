/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso_parcial_1;

import java.util.*;
/**
 *
 * @author Grary
 */
public class Biblioteca {
    private ArrayList<Libro> lista = new ArrayList<>();
    private ArrayList<String> usuarios = new ArrayList<>();
    private ArrayList<String> usuariosconLibros = new ArrayList<>();

    public Biblioteca() {
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }
    
    
    public void agregarLibro(Libro libro){
        lista.add(libro);
        System.out.println("Libro agregado con exito!");
    }
    
    public void buscarLibro(double myid){
        //Terminar
    }
    public void buscarLibro(String titulo){
        boolean flag = true;
        for(Libro aux: lista){
            if(aux.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("| Libro encontrado |");
                System.out.println(" Titulo: " + aux.getTitulo() + "\n Autor: " + aux.getAutor() + "\n Año de publicación: " + aux.getAnio() + "\n ID: " + aux.getId());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Libro no encontrado :(");
        }
    }
}
