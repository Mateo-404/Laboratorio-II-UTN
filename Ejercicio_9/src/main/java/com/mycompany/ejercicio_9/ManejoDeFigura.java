
package com.mycompany.ejercicio_9;
import java.util.*;
/**
 *
 * @author Gary
 */
public class ManejoDeFigura {
    private ArrayList<Figura> lista = new ArrayList<Figura>();
    //Metodos
    public void agregarFigura(Figura figura){
        lista.add(figura);
    }
    public ArrayList<String> areaPerimetroString(){
        double area = 0, perimetro = 0;
        String figura_geometrica;
                
        ArrayList<String> retornar = new ArrayList<String>();
        
        //Circulo
        for(Figura figura: lista){
            if(figura.getClass() == Circulo.class){
                area += figura.retornarArea();
                perimetro += figura.retornarPerimetro();
            }
        }
        figura_geometrica = "<- Circulo -> \n Areas: " + area + "\n Perimetros: " + perimetro;
        retornar.add(figura_geometrica);
        area = 0; perimetro = 0;
        
        //Rectangulo
        for(Figura figura: lista){
            if(figura.getClass() == Rectangulo.class){
                area += figura.retornarArea();
                perimetro += figura.retornarPerimetro();
            }
        }
        figura_geometrica = "<- Rectangulo -> \n Areas: " + area + "\n Perimetros: " + perimetro;
        retornar.add(figura_geometrica);
        area = 0; perimetro = 0;

        //Triangulo
        for(Figura figura: lista){
            if(figura.getClass() == Triangulo.class){
                area += figura.retornarArea();
                perimetro += figura.retornarPerimetro();
            }
        }
        figura_geometrica = "<- Triangulo -> \n Areas: " + area + "\n Perimetros: " + perimetro;
        retornar.add(figura_geometrica);
        
        return retornar;
    }
    
    public ArrayList<Double> ListadoPerimetrosPorFigura(Figura figura){
        ArrayList<Double> retornar = new ArrayList<Double>();
        
        for(Figura aux: lista){
            if(figura.getClass() == aux.getClass()){
                retornar.add(aux.retornarPerimetro());
            }
        }
        return retornar;
    }
    public ArrayList<Double> ListadoAreaPorFigura(Figura figura){
        ArrayList<Double> retornar = new ArrayList<Double>();
        
        for(Figura aux: lista){
            if(figura.getClass() == aux.getClass()){
                retornar.add(aux.retornarArea());
            }
        }
        return retornar;
    }
    
    
}
