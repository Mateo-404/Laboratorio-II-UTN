/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso_parcial_1;
import java.util.*;
import Controles.Control;
/**
 *
 * @author Grary
 */
public class Repaso_parcial_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        Biblioteca biblioteca = new Biblioteca();
        do{
            String titulo, autor;
            int anio;
            double id;
            
            System.out.println("| Menu principal | \n 1. Agregar Libro \n 2. Buscar Libro \n 3. Mostrar lista de libros existentes \n 4. Verificar Existencia(isbn) \n 5. Eliminar Libro(isbn) \n 6. Tomar Prestado libro\n\n Digite \" Salir \"");
            opcion = scanner.nextLine();
            switch(opcion){
                case "1":
                    System.out.println("Ingrese titulo del libro: ");
                    titulo = scanner.nextLine();
                    System.out.println("Ingrese autor del libro: ");
                    autor = scanner.nextLine();
                    System.out.println("Ingrese año del libro: ");
                    anio = scanner.nextInt();
                    System.out.println("Ingrese ID del libro: ");
                    id = scanner.nextDouble();
                    Libro lib = new Libro(titulo, autor, anio, id);
                    biblioteca.agregarLibro(lib);
                    break;
                case "2":
                    System.out.println(" 1. Buscar por id \n 2. Buscar por titulo");
                    opcion = scanner.nextLine();
                    switch (opcion){
                        case "1":
                            System.out.println("Igrese el id del libro: ");
                            id = scanner.nextDouble();
                            biblioteca.buscarLibro(id);
                            break;
                        case "2":
                            System.out.println("Ingrese el titulo del libro: ");
                            titulo = scanner.nextLine();
                            biblioteca.buscarLibro(titulo);
                            break;
                    }
                case "3":
                    System.out.println("| Lista de libros existentes |");
                    biblioteca.listarLibros();
                    break;
                case "4":
                    System.out.println("Igrese el id del libro: ");
                    id = scanner.nextDouble();
                    // Ingresar metodo estatico
                    break;
            }
        }while(!(opcion.equalsIgnoreCase("Salir")));
    }
}
