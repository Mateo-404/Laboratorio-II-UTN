/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.*;
import Persona;

/**
 *
 * @author Gary
 */
public class List {
    public static void recorrer(ArrayList<String> listita){
        for (String it : listita){
            System.out.println(it);
        }
    }
    public static boolean crearlista(String a){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> milista = new ArrayList();
        do{
            System.out.println("Ingrese el String: \n Escriba 'salir' en caso de que sea necesario");
            a = scanner.nextLine();
            if(!(a.equalsIgnoreCase("salir"))){
                milista.add(a);
            }
        }while(!(a.equalsIgnoreCase("salir")));
        //Recorrer el array
        recorrer(milista);
        return flag;
    }
    //Ahora con Linkedist, lo voy a hacer con nombre y edad nomás
        public static void recorrerLinkedList(LinkedList<Persona> listita){
        for (String it : listita){
            System.out.println(it);
        }
    }
    public static boolean crearlistaLinkedList(String a){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        LinkedList<Persona> milista = new ArrayList();
        do{
            System.out.println("Ingrese el String: \n Escriba 'salir' en caso de que sea necesario");
            a = scanner.nextLine();
            if(!(a.equalsIgnoreCase("salir"))){
                milista.add(a);
            }
        }while(!(a.equalsIgnoreCase("salir")));
        //Recorrer el array
        recorrer(milista);
        return flag;
    }
}
