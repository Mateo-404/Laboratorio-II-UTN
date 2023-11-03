- Ejercicio 11

<-- Clases abstractas / Interfaces -->
A. Actualizar el ejercicio de Herencia, haciendo que Figura sea una clase abstracta.

B. En un nuevo proyecto, crea una clase abstracta llamada Animal con los siguientes atributos y métodos:
    ○ Atributos:
    ○ nombre (String)
    ○ edad (int)
    ○ Constructor que recibe el nombre y la edad del animal.
    ○ Método abstracto emitirSonido() que representará el sonido característico del animal.
    ○ Métodos para obtener los atributos.

C. Crear una clase Perro, Gato, Delfín y Murciélago.

D. Crea cuatro interfaces llamadas Comer, Olfatear, Nadar y Volar con un método cada una.
    ○ Comer:
    Método abstracto comer() que representará la acción de comer del animal
    (imprime en pantalla que está realizando la acción de comer).

    ○ Olfatear:
    Retorna un String con el nombre del animal + “olfateó algo”.
    
    ○ Nadar :
    Método abstracto nadar() que representará la acción de nadar del animal
    (imprime en pantalla que está realizando la acción de nado).
    
    ○ Volar:
    Método abstracto volar() que representará la acción de volar del animal
    (imprime en pantalla que está realizando la acción de volar).
    
    ○ Implementa las interfaces en las clases que sea necesario. Tener en cuenta
    que no todos los animales realizan las mismas acciones.