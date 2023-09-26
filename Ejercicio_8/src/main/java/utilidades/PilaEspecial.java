package utilidades;
import java.util.*;
/**
 *
 * @author Gary
 */
public class PilaEspecial {
    private ArrayList<String> a = new ArrayList<>();
    //Es solo un arrayList
    
    public PilaEspecial() {
    }
    
    public void apilar(String e){
        a.add(e);
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
        if (var > a.size()){
            System.out.println("Ingrese una cantidad válida!");
        }else{
            for(i = 0; i < var; i++){
                System.out.println("Elemento n°" + var + " que contiene" + a.get(i));
                a.remove(i);
                System.out.println("Removido con éxito!");
            }
            System.out.println("Todos los elementos fueron removidos!");   
            }
    }
    
}
