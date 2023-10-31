Ejercicio 10
Tecnicatura Superior en Programación

<-- Excepciones -->

a) Declare un método que reciba como parámetro 2 valores entero y retorne un valor double
con el resultado solo si la división da como resultado un número par.

En el caso que la división de un error lanzar la excepción ArithmeticException con el mensaje “Error aritmético”

En el caso que la división no dé como resultado un número par, lanzar una excepción del tipo ExceptionPersonalizada, 
la cual va a heredar de Exception, con el mensaje “Operación no realizada”.
Utilizar la cláusula throws.

b) Desde el método main o desde cualquier otro método que quiera crear, solicite al usuario
que ingrese por teclado 2 valores enteros, para luego pasarlos como parámetro al método
creado en el punto anterior y finalmente mostrar en pantalla el resultado. Deberá manejar
las excepciones que lanza el método del punto A utilizando el bloque try – catch, mostrando
en pantalla no se pudo completar la operación por XXXX. Siendo XXXX el mensaje lanzado
por el punto A

c) En el caso de que se produzca alguna excepción, el método del punto B deberá informárselo
al usuario para que el mismo pueda ingresar otros valores sin que el programa termine de
manera forzada.

d) Dentro del método en donde está utilizando un objeto de la clase Scanner para obtener los
valores numéricos que el usuario ingresa por teclado, utilice el bloque try - catch para controlar las excepciones que se puedan producir en la lectura en el caso de que el usuario
ingrese otro tipo de valores que no sean números.

- Emplee la clase Vehículo de los ejercicios anteriores y genere una excepción en el constructor en el
caso que alguno de los parámetros ingresados no sea correcto.