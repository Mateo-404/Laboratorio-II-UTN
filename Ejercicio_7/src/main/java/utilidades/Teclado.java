/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author Gary
 */
public class Teclado {
    public static void imprimirCadena(String a){
        System.out.println(a);
    }
    //Chatgpt
    // Un método que reciba como parámetro un texto y retorne si el valor ingresado es o no del tipo entero
    /*
    public static void esEntero(String texto) {
      try {
        // Intenta convertir el texto a un entero usando la clase Integer
        Integer.parseInt(texto);
        // Si no hay ninguna excepción, el texto es un entero válido
        System.out.println("Es entero");
      } catch (NumberFormatException e) {
        // Si hay una excepción, el texto no es un entero válido
        System.out.println("No es entero");
      }
    }

    // Un método que reciba como parámetro un texto y retorne si el valor ingresado es o no del tipo Double
    public static void esDouble(String texto) {
      try {
        // Intenta convertir el texto a un double usando la clase Double
        Double.parseDouble(texto);
        // Si no hay ninguna excepción, el texto es un double válido
        System.out.println("Es Double");
      } catch (NumberFormatException e) {
        // Si hay una excepción, el texto no es un double válido
          System.out.println("No es Double");
      }
    }
    */
    //Yo:
    public static void esEntero(String a){
        int i; boolean flag = true;
        for(i=0; i < a.length(); i++){
            if(a.charAt(i)>'9'){
                System.out.println("El String no es un Entero");
                flag = false;
                break;
            }
            if(a.charAt(i) == '.'){
                System.out.println("El String no es un Entero");
                flag = false;
                break;
            }   
        }
        if(flag){
            System.out.println("El String es un Entero");
        }
    }
    
        public static void esDouble(String a){
        int i; boolean flag = true;
        for(i=0; i < a.length(); i++){
            if(a.charAt(i)>'9'){
                System.out.println("El String no es un Double");
                flag = false;
                break;
            }
            if(a.charAt(i) == ','){
                System.out.println("El String no es un Double");
                flag = false;
                break;
            }   
        }
        if(flag){
            System.out.println("El String es un Double");
        }
    }

    public static void estaEntre(char a, char b, char c){
        int i; boolean flag = true;
        for(i = a; i < b; i++){
            if(i == c){
                System.out.println("La letra " + c + " está dentro del recorrido");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("La letra " + c + " no está entre " + a + " y " + b);
        }
    }
}
