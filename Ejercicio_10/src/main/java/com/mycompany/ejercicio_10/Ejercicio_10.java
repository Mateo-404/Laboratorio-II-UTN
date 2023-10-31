/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_10;
import java.util.*;


/**
 *
 * @author Gary
*/


public class Ejercicio_10 {
    public static void menu() throws ArithmeticException, PersonalizadaExeption{
        Scanner sc = new Scanner(System.in);
        String aa, bb;
        boolean flag = true;
        int a, b;
        a = b = 0;

        // <-- Menú -->
        do{
            System.out.println("Ingrese el 1er valor: ");
            try{
                aa = sc.nextLine();
                a = Integer.parseInt(aa);
                System.out.println("Primer número cargado!");
            }catch(Exception e){
                System.out.println(" - SOLO se perimite el ingreso de numeros \n - Volvé a ingresar los datos");
                flag = false;
                menu();
                break;
            }
    
            System.out.println("Ingrese el 2do valor: ");
            try{
                bb = sc.nextLine();
                b = Integer.parseInt(bb);
                System.out.println("Segundo número cargado!");
            }catch(Exception e){
                System.out.println("SOLO se perimite el ingreso de numeros \n Volvé a ingresar los datos");
                flag = false;
                menu();
                break;
            }
    
            try{
                System.out.println(Calculo.dividir(a, b));
            }catch (PersonalizadaExeption e){
                System.out.println("VOLVÉ a ingresar los valores");
                menu();
            }catch(ArithmeticException e){
                System.out.println("VOLVÉ a ingresar los valores");
                menu();
            }
            flag = false;
        }while(flag);
    }

    public static void main(String[] args) throws PersonalizadaExeption {
        //<-- Menu -->
        menu();
    }
}
