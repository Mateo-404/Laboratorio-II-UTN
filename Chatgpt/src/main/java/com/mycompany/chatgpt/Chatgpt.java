/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatgpt;
import java.util.*;
/**
 *
 * @author Gary
 */
public class Chatgpt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Ingrese la accion que desea \n1 - Registrar libro");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre_de_libro/autor/anio_publicacion");
                    
            }
        }while (opcion != 0);
    }
}
