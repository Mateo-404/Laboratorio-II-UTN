/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.time.LocalDate;

/**
 *
 * @author Gary
 */
public class Fechas {
    public static void calculoFecha(LocalDate fechaActual, int dias){
        if(dias >= 0){
            System.out.println(fechaActual.plusDays(dias));
        }else{
            System.out.println(fechaActual.minusDays(dias));
        }
    }
    public static void difereciaFecha(LocalDate fecha1, LocalDate fecha2){
        System.out.println(fecha1.compareTo(fecha2));
    }
}
