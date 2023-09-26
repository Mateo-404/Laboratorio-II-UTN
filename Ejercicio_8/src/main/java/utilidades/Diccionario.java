
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
    Map<String, ArrayList<String>> midiccionario = new TreeSet<>();
    
    //EN - ES
    public void aniadir (String palabra){
        String aux;
        //Palabra nueva en el diccionario
        if(!(midiccionario.containsKey(palabra))){
            System.out.println("Palabra nueva ingresada! Ahora ingrese el significado: ");
            do{
                System.out.println("Ingrese el significado de la palabra, pulse \"Salir\" para dejar de agregar");
                aux = scanner.nextLine();
                if(!(aux.equalsIgnoreCase("Salir")){
                    //!Terminar
                }
            }while(!(aux.equalsIgnoreCase("Salir")));
        }else{
            //Palabra previamente existente
            do{
                System.out.println("Ingrese el significado de la palabra, pulse \"Salir\" para dejar de agregar");
                aux = scanner.nextLine();
                if(!(aux.equalsIgnoreCase("Salir")){
                    //!Terminar
                }
            }while(!(aux.equalsIgnoreCase("Salir")));
        }
    }
    public void traducir (String palabra, enum INGLES_ESPANIOL){
        palabra.toUpperCase();
    }
}
