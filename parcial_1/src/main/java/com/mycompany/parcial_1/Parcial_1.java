/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
    * Una empresa de turismo solicita un sistema para hacer el seguimiento y mantenimiento a
    sus colectivos, para lo cual va a necesitar que el sistema contenga:
    ● Una clase Bus la cual tiene que tener como mínimo los siguientes atributos: marca
    (tiene que ser como enumerador), patente, kilometraje, ultimaRtv y
    anioPatentamiento (agregar los atributos que crea necesario).
    ● Un método llamado cargarViajes(viaje) que permita cargar los recorridos de la
    empresa, para ello deberá crear una clase Viaje con como mínimo los siguientes
    atributos: Bus, origen, destino, kmRecorridos.
    ● Un paquete de utilidades que debe contener dos clases EntradaSalida y Controles
    ○ EntradaSalida: tiene los métodos ingresoDatos(dato a ingresar) e
    imprimirDatos(dato a imprimir). Tener en cuenta que no se puede usar el
    casteo ni dentro de los métodos ni cuando se utilizan, y siempre que ingrese
    un dato lo tiene que hacer por éste método.
    ○ Controles: contiene dos método llamados controlSemanal(dato) el cual
    controla a qué colectivo se le realiza el service o tiene que actualizar la RTV
    imprimiendo en pantalla si tiene que realizar uno u otro (Imprimir marca,
    patente y acción a realizar, en caso de hacer el service y la RTV imprimirlo en
    una sola línea) Ejemplo: MERCEDES BENZ - AA111AA - Realizar RTV -
    Realizar Service -; y otro método que se llama patenteValida(patente) que
    controla si la patente es existe entre los colectivos y retorna verdadero o
    falso.
    ● Un método que genere un listado de los viajes por colectivo ingresando la patente,
    controlar que la misma sea válida, caso contrario imprimir “Patente inválida”.
    ○ En caso de ser válida imprimir “Bus patente ‘patente’ - Origen: ‘origen’ -
    Destino: ‘destino’ - Km recorridos: ‘km’”
    ● Utilizar en las clases todos los métodos generados
    Información:
    El service se realiza cuando supera los 10.000km de la última vez que se realizó
    La RTV se actualiza cada 2 si la antigüedad del vehículo es entre 3 y 7 años y cada 1 si es
    mayor que 7
    */
package com.mycompany.parcial_1;
import Utilidades.*;

import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author Gary
 */
public class Parcial_1 {

    public static void main(String[] args) {
        Control control = new Control();
        //Testeo
        Bus bus1 = new Bus(marca.MERCEDES_BENZ, "AA111AA", 1000, LocalDate.now(), LocalDate.of(2023, 12, 31), control);
        Bus bus2 = new Bus(marca.MERCEDES_BENZ, "BB222BB", 1000, LocalDate.of(1992, 2, 28), LocalDate.of(2020, 12, 31), control);
        //Cargar viaje
        Viaje.cargarViaje(bus2, "Santa Fe", "Buenos Aires", 11000);
        Viaje.cargarViaje(bus1, "Buenos Aires", "Santa Fe", 11000);
        //Listado viajes
        control.listadoViajesBus("AA111AA");
        control.listadoViajesBus("BB222BB");
        //<---Metodos control --->
        System.out.println(control.patenteValida("AA111AA")); //True
        System.out.println(control.patenteValida("AAAAAAAAAAAAA")); //False
        control.controlSemanal(bus2); //No cumple
        control.controlSemanal(bus1); //Cumple con la fecha de RTV
        //<-----Metodos EntradaSalida---->
        EntradaSalida.ingresoDatos("Hola");
        EntradaSalida.imprimirDatos(7);

    }
}
