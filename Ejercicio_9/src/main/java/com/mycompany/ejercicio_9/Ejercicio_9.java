/*
 * a) Se solicita diseñar y programar una estructura de clases que permita el manejo de las siguientes figuras geométricas, rectángulos, triangulo rectángulo, círculos (En el futuro se
    pueden incorporar más).
    Cada una de las figuras geométricas tiene que tener los siguientes atributos de lectura/escritura:
     Color (valor string)
     Posición X, Y en un mapa cartesiano (Dos valores enteros)
     Ángulo (Valor decimal de 0 a 360)
    Y el siguientes de solo lectura:
     Identificador numérico único por cada figura de cualquier tipo que es creada (Valor
    entero)
    A su vez debe de permitir los siguientes métodos los cuales no reciben parámetros
     retornar área.
     retornar perímetro.
    NOTAS:
     El constructor de la o las clases no debe recibir parámetros
     Queda a criterio del desarrollador incorporar los métodos privados que crea conveniente
     Agregar los atributos que sean requeridos según el tipo de figura geométrica.
    b) Genere una clase denominada ManejoDeFiguras que contenga los siguientes métodos:
    I. AgregarFigura(cualquier figura geométrica) Este método recibe como parámetro una figura
    geométrica de cualquier tipo y debe almacenarla internamente en alguna estructura de colección.
    Debe permitir agrega n figuras.
    II. SumatoriaAreaPerimetroString() Retorna una lista de string, donde cada línea específica el
    nombre del tipo de figura geométrica y la sumatoria de área y de perímetros por separado,
    de todas las ocurrencias de cada tipo de figura (Tomar como origen de datos la colección
    del punto I).
    Ej: si se carga dos círculos de área 10 y perímetro 5, otro de área 20 y perímetro 10 y un
    rectángulo de área 50 y perímetro 20 este método retornaría:
    Circulo: Sumatoria Áreas 30, Sumatoria Perímetros 15 Rectángulo: Sumatoria Áreas 50, Sumatoria Perímetros 25Ejercicio 09
    Tecnicatura Superior en Programación
    Página 2
    III. ListadoPerimetrosPorFigura(Figura geométrica) Este método debe retornar un listado de
    doubles de todos los perímetros de un tipo de figura determinado (Tomar como origen de
    datos la colección del punto I) Siguiendo con el ejemplo del punto anterior
    Si se coloca ListadoPerimetrosPorFigura(Circulo) retornaría
    5
    10
    IV. ListadoAreasPorFigura(Figura geométrica) Este método debe retornar un listado de doubles de todas las áreas de un tipo de figura determinado (Tomar como origen de datos la
    colección del punto I)
    Si se coloca ListadoPerimetrosPorFigura(Circulo) retornaría
    10
    20
 */

package com.mycompany.ejercicio_9;

/**
 *
 * @author Gary
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        // <- Falta testear td ->
        //Testeo
        ManejoDeFigura m = new ManejoDeFigura();
        //Figuras de ejemplo
        Circulo circulo1 = new Circulo();
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        Triangulo triangulo1 = new Triangulo();
        circulo1.setRadio(100);
        circulo1.setDiametro(99);

        rectangulo1.setHorizontal(51);
        rectangulo1.setVertical(13);
        
        rectangulo2.setHorizontal(32);
        rectangulo2.setVertical(21);
        
        triangulo1.setAngulo(90);
        triangulo1.setAngulo(21);
        triangulo1.setAltura(591);
        triangulo1.setBase(12);
        triangulo1.setLado1(40);
        triangulo1.setLado2(90);
        
        m.agregarFigura(circulo1);
        m.agregarFigura(rectangulo1);
        m.agregarFigura(rectangulo2);
        m.agregarFigura(triangulo1);
        //Funciona bien
        System.out.println("Listado de areas y perimetros");
        for (String string : m.areaPerimetroString()) {
            System.out.println(string);
        }

        //Funciona bien, en perimetro por figura se le pasa un ejemplar ya creado
        System.out.println("Listado de perimetros por figura");
        for (double a : m.ListadoPerimetrosPorFigura(rectangulo1)) {
            System.out.println("  " + a);
        }

        //Funciona bien!
        System.out.println("Listado de areas por figura");
        for (double a : m.ListadoAreaPorFigura(circulo1)) {
            System.out.println("  " + a);
        }
    }
}
