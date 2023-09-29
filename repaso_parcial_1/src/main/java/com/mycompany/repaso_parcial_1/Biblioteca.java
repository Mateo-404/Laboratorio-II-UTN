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

    public ArrayList<String> getUsuariosconLibros() {
        return usuariosconLibros;
    }

    public void setUsuariosconLibros(ArrayList<String> usuariosconLibros) {
        this.usuariosconLibros = usuariosconLibros;
    }
    
    
    
    public void agregarLibro(Libro libro){
        lista.add(libro);
        System.out.println("Libro agregado con exito!");
    }
    
    public void buscarLibro(double id){
        boolean flag = true;
        for(Libro aux: lista){
            if(aux.getId()==id){
                System.out.println("| Libro encontrado |");
                System.out.println(" Titulo: " + aux.getTitulo() + "\n Autor: " + aux.getAutor() + "\n Año de publicación: " + aux.getAnio() + "\n ID: " + aux.getId());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Libro no encontrado :(");
        }
    }
    
    //Metodo para control
    public Libro buscarLibro(double myid, boolean m){
        boolean flag = true;
        Libro libro = new Libro();
        for(Libro aux: lista){
            if(aux.getId()== myid){
                libro = aux;
            }
        }
        if(flag){
            System.out.println("Libro no encontrado :(");
        }
        return libro;
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
    
    public void listarLibros(){
        int i = 1;
        for(Libro aux: lista){
            System.out.println("| LIBRO N° " + i + " |");
            i++;
            System.out.println(" Titulo: " + aux.getTitulo() + "\n Autor: " + aux.getAutor() + "\n Año de publicación: " + aux.getAnio() + "\n ID: " + aux.getId());
        }
    }
}
