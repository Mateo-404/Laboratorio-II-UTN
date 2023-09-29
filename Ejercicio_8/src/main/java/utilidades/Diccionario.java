
package utilidades;
import java.util.*;

/**
 *
 * @author Gary
 */
enum idiomas{
    INGLES_ESPANIOL,ESPANIOL_INGLES;
}
public class Diccionario {
    Scanner scanner = new Scanner(System.in);
    //<---Atributos-->
    HashMap<String, ArrayList<String>> midiccionario = new HashMap<>();
    
    public void aniadir (String palabra){
        String aux; 
        ArrayList<String> momentaneo = new ArrayList<>();

        //Se trabaja todo en mayusculas
        palabra.toUpperCase();
        //Palabra nueva en el diccionario
        if(!(midiccionario.containsKey(palabra))){
            System.out.println("Palabra nueva ingresada! Ahora ingrese el significado: ");
            do{
                System.out.println("Ingrese el significado de la palabra, pulse \"Salir\" para dejar de agregar");
                aux = scanner.nextLine();
                if(!(aux.equalsIgnoreCase("Salir"))){
                    momentaneo.add(aux);
                }
            }while(!(aux.equalsIgnoreCase("Salir")));
        }else{
            //Palabra previamente existente
            do{
                System.out.println("Ingrese el significado de la palabra, pulse \"Salir\" para dejar de agregar");
                aux = scanner.nextLine();
                if(!(aux.equalsIgnoreCase("Salir"))){
                    momentaneo.add(aux);
                }
            }while(!(aux.equalsIgnoreCase("Salir")));
        }
        //Asignacion de nuevos significados al objeto
        midiccionario.put(palabra, momentaneo);
    }
    public void traducir (String palabra){
        palabra.toUpperCase();
        if(midiccionario.containsKey(palabra)){
            System.out.println("Palabra encontrada! Sus traducciones son: ");
            System.out.println(midiccionario.get(palabra));
        }
        
    }
}
