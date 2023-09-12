/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author Gary
 */
public class Pantalla {
    public static void imprimir (String a){
        System.out.println(a);
    }
    public static void imprimirMayuscula(String a){
        System.out.println(a.toUpperCase());
    }
    public static void imprimirMayusculaCuadrito(String a){
        String cadena, horizontal = " --";
        int i;
        for(i=0;i<a.length();i++){
            horizontal = horizontal + "-";
        }
        System.out.println(horizontal + "\n| " + a.toUpperCase() + " |\n" + horizontal);
    }
}
