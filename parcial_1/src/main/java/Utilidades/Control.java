/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import com.mycompany.parcial_1.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gary
 */
public class Control {
    /*
    private HashMap<Bus, ArrayList<Viaje>> viajesColectivo = new HashMap<>();
    * 
    */
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Viaje> viajes = new ArrayList<>();

    public Control() {
    }

    public void controlSemanal(Bus bus) {
        boolean flag = true;
        //La RTV se actualiza cada 2 si la antigüedad del vehículo es entre 3 y 7 años y cada 1 si es mayor que 7
        if (patenteValida(bus.getPatente())) {
            if ((LocalDate.now().getYear() - bus.getUltimaRtv().getYear()) <= 7){
                //Entre 3 y 7 años
                if (bus.getUltimaRtv().plusYears(2).isBefore(LocalDate.now())) {
                  System.out.println("Bus patente: " + bus.getPatente() + "Marca: " + bus.getMarca() + " esta cumpliendo con la fecha de RTV");
                  flag = false;   
                }
            }else {
                //Mas de 7 años
                if (bus.getUltimaRtv().plusYears(1).isBefore(LocalDate.now())) {
                    System.out.println("Bus patente: " + bus.getPatente() + "Marca: " + bus.getMarca() + " esta cumpliendo con la fecha de RTV");
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Bus patente: " + bus.getPatente() + " Marca: " + bus.getMarca() + " Realizar RTV");
        }
    }
    public boolean patenteValida(String patente) {
        for (Bus aux : buses) {
            if (aux.getPatente().equalsIgnoreCase(patente)) {
                return true;
            }
        }
        return false;
    }
    /*
        public void listadoViajesBusTotales() {
            for (Viaje aux : viajes) {
                System.out.println("---------------------------------------");
                System.out.println(aux.getBus().getPatente() + " - " + aux.getOrigen() + " - " + aux.getDestino() + " - " + aux.getKmRecorridos());
                System.out.println("---------------------------------------");
            }
        }
     * 
     */
    public void listadoViajesBus(String patente) {
        if (patenteValida(patente)) {
            for (Viaje aux : viajes) {
                if (aux.getBus().getPatente().equalsIgnoreCase(patente)) {
                    System.out.println("---------------------------------------");
                    System.out.println(aux.getBus().getPatente() + " - " + aux.getOrigen() + " - " + aux.getDestino() + " - " + aux.getKmRecorridos());
                    System.out.println("---------------------------------------");
                }
            }
        }else{
            System.out.println("Patente no valida");
        }
    }
    public static boolean service(Bus bus) {
        return bus.getKilometraje() > 10000;
    }

    //Reveer
    /*
     * 
     public void agregarViajeBus(Bus bus, Viaje viaje) {
         if (patenteValida(bus, buses)) {
             viajesColectivo.get(bus).add(viaje);
         }
     }
     */

    //Setters y Getters
    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
    


    
    
}
