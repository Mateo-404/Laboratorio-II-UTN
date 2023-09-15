/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoras;
import java.util.Scanner;
/**
 *
 * @author Gary
 */
public class Calculadora {
    private Scanner scanner;
    
    public static double sumar (float a, float b){
        return (a + b);
    }
    public static double restar (float a, float b){
        return (a-b);
    }
    public static double multiplicar(float a, float b){
        return(a*b);
    }
    public static double dividir(float a, float b){
        while(b==0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("No se puede dividir por 0, ingresá de vuelta el segundo valor");
            b = scanner.nextFloat();
        }
        return (a/b);
    }
}
