package utilidades;
import java.util.*;
/**
 *
 * @author Gary
 */
public class PilaEspecial {
    ArrayList<String> a;
    //Es solo un arrayList

    public PilaEspecial(ArrayList<String> a) {
        this.a = a;
    }
    
    public void apilar(String var){
        a.add(var);
        System.out.println("String añadido con éxito!");
    }
    
    public void desapilar(){
        System.out.println("El ultimo elemento es: " + a.get(a.size()));
        a.remove(a.size());
        System.out.println("String eliminado!");
    }
    
    public void cantidad(){
        System.out.println("La cantidad de elementos que contiene el Array es de: " + a.size());
    }
    
    public void eliminar(int i){
        a.remove(i);
        System.out.println("Elemento n°" + i + " Removido!");
    }
    
    public void desapilarVarios(int var){
        int i;
        for(i = 0; i < var; i++){
            System.out.println("Elemento n°" + var + " que contiene" + a.get(i));
            System.out.println("Removido con éxito!");
        }
        System.out.println("Todos los elementos fueron removidos!");
    }
    
}
