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
        circulo1.setRadio(0.5f);
        circulo1.setDiametro(0.5f);



    }
}
