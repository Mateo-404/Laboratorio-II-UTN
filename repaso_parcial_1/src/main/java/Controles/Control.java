package Controles;
import com.mycompany.repaso_parcial_1.*;
import java.util.*;

public class Control {
    static public boolean verificarExistencia(double id, Biblioteca biblio){
        boolean flag = false;
        ArrayList<Libro> array = new ArrayList<>();
        array = biblio.getLista();
        //No se si tomar el array de Libros desde acá o pedir desde el main el objeto Biblioteca, consultar al profe
        for(Libro aux : array){
            if(aux.getId()==id){
                flag = true;
            }
        }
        if(flag){
            return true;
        }else{
            return false;
        }
    }
    
    static public void eliminarLibro(double id, Biblioteca biblio){
        boolean flag = true;
        ArrayList<Libro> listaaa = new ArrayList<>();
        listaaa = biblio.getLista();
        for(Libro lib : listaaa){
            if(lib.getId() == id){
                listaaa.remove(lib);
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println("Libro no encontrado :(");
        }else{
            biblio.setLista(listaaa);
            System.out.println("Libro eliminado exitosamente!");
        }
    }
    
    static public void tomarPrestado(String persona, double id, Biblioteca biblio){
        ArrayList<Libro> listaaa = new ArrayList<>();
        ArrayList<String> personass = new ArrayList<>();
        boolean a = false;
        
        personass = biblio.getUsuariosconLibros();
        listaaa = biblio.getLista();
        if(verificarExistencia(id, biblio)){
            listaaa.remove(biblio.buscarLibro(id, a));
            System.out.println("Libro alquilado exitosamente!");
            personass.add(persona);
            System.out.println("Persona añadida");
            
            biblio.setLista(listaaa);
            biblio.setUsuariosconLibros(personass);
            System.out.println("Cambios aplicados :)");
        }else{
            System.out.println("Libro no encontrado :(, no fue posible su eliminación");
        }
    }
    
    public static boolean verificarLongitudId(double id){
        //Terminar y conectar a la estructura
        return false;
    }
    
    public static String verificarAutor(String nombre_sucio){
        //Terminar y conectar a la estructura
        String a  = "hola";
        return a;
    }
    
    
}
