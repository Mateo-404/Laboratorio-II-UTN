/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_8;
import java.util.*;
import utilidades.*;

/**
 *
 * @author Gary
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        //Probar TODOS los metodos
        Scanner scanner = new Scanner(System.in);
        String opcion, aux;
        int i;
        do{
            System.out.println("Ingrese el ejercicio: a) d) \n De ser necesario pulse \"Salir\" ");
            opcion = scanner.nextLine();
            switch (opcion){
                case "a":
                    //Funciona Bien!
                    System.out.println("1. ArrayList 2. LinkedList");
                    opcion = scanner.nextLine();
                    switch (opcion){
                        case "1":
                            utilidades.List.crearlista();
                            break;
                        case "2":
                            //El 2 no lo entendí xD
                            utilidades.List.crearlistaLinkedList();
                            break;
                    }
                    break;
                case "d":
                    //Con el usuario ideal funciona!
                    PilaEspecial pila = new PilaEspecial();
                    while(!(opcion.equalsIgnoreCase("salir"))){
                        System.out.println("1. Apilar\n 2. Desapilar\n 3. Cantidad\n 4. Eliminar\n 5. Desapilar varios \n \"Salir\"");
                        opcion = scanner.nextLine();
                        switch (opcion){
                            case "1":
                                System.out.println("Ingrese el string a añadir: ");
                                aux = scanner.nextLine();
                                pila.apilar(aux);
                                break;
                            case "2":
                                pila.desapilar();
                                break;
                            case "3":
                                pila.cantidad();
                                break;
                            case "4":
                                System.out.println("Ingrese el numero de la posicion del elemento a eliminar: ");
                                i = scanner.nextInt();
                                pila.eliminar(i);
                                break;
                            case "5":
                                System.out.println("Ingrese hasta que elemento eliminar: ");
                                i = scanner.nextInt();
                                pila.desapilarVarios(i);
                                break;
                        }
                    }
                    break;
                case "e":
                    //Diccionario
                default:
                    if (!(opcion.equalsIgnoreCase("salir"))){
                        System.out.println("Ingrese un valor correcto!");
                    }
                break; 
            }
        }while(!(opcion.equalsIgnoreCase("salir")));
    }
}
