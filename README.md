# JavaRoadmapPractice

Este proyecto fue creado como parte del seguimiento del roadmap de Java.  
El objetivo es practicar de forma progresiva los temas vistos en clase y reforzar los conceptos principales del lenguaje Java mediante un programa sencillo de consola.

## Objetivo del proyecto

Desarrollar un sistema básico de registro de estudiantes utilizando conceptos fundamentales de Java, como variables, tipos de datos, condicionales, ciclos, arreglos y métodos.

El proyecto se irá mejorando semana a semana, agregando nuevos temas del roadmap de Java.

## Temas aplicados hasta el commit 6

Hasta este punto del proyecto se han aplicado los siguientes temas:

- Sintaxis básica de Java.

- Variables y tipos de datos.

- Operaciones matemáticas.

- Conversión de tipos.

- Uso de cadenas de texto.

- Condicionales con `if` y `switch`.

- Ciclos con `do while` y `for`.

- Arreglos para almacenar datos.

- Métodos para organizar el código.

- Entrada de datos con `Scanner`.

## Descripción del programa

El programa permite administrar una lista básica de estudiantes desde la consola.

Actualmente incluye las siguientes opciones:

1. Registrar estudiante.

2. Listar estudiantes.

3. Mostrar cantidad de estudiantes registrados.

4. Buscar estudiante.

5. Salir del programa.

## Estructura del proyecto

```text
JavaRoadmapPractice
└── src
    └── app
        └── Main.java
```

## Avances realizados

### Commit 1

Se creó la estructura inicial del proyecto Java.

### Commit 2

Se agregó el archivo README.md con el plan de trabajo basado en el roadmap de Java.

### Commit 3

Se implementaron ejemplos de variables, tipos de datos, operaciones básicas y conversión de tipos.

### Commit 4

Se agregó un menú interactivo utilizando condicionales y ciclos.

### Commit 5

Se implementó un arreglo para almacenar nombres de estudiantes.

### Commit 6

Se organizaron las acciones principales del programa en métodos separados para mejorar el orden del código.

## Ejemplo de ejecución

```text
========== MENU PRINCIPAL ==========
1. Registrar estudiante
2. Listar estudiantes
3. Mostrar cantidad de estudiantes
4. Buscar estudiante
0. Salir
Seleccione una opcion:
```

## Avances del día 2

Durante el segundo día se continuó el proyecto aplicando conceptos de programación orientada a objetos y manejo de estructuras de datos en Java.

Se creó la clase `Estudiante`, la cual contiene atributos como nombre, carnet y nota.  
También se agregó un método para mostrar la información del estudiante.

Se aplicó encapsulamiento en la clase `Estudiante`, utilizando atributos privados y métodos `get` y `set`.



Se agregó herencia mediante la clase `Persona`.  
La clase `Estudiante` ahora hereda de `Persona`, reutilizando el atributo nombre y el método para mostrar información.



Se reemplazó el arreglo de estudiantes por un `ArrayList<Estudiante>`.  
Esto permite manejar la lista de estudiantes de una forma más flexible.



Se agregó un `HashMap<String, Estudiante>` para buscar estudiantes usando el carnet como clave.



Se implementó manejo de errores con `try catch`, principalmente para validar entradas numéricas y evitar que el programa se cierre cuando el usuario ingresa datos incorrectos.

## Temas aplicados

- Clases y objetos.
- Atributos y métodos.
- Encapsulamiento.
- Getters y setters.
- Herencia.
- Sobrescritura de métodos.
- ArrayList.
- HashMap.
- Manejo de excepciones con `try catch`.

## Ejemplo de ejecución del día 2

```text

```

1. Registrar estudiante
2. Listar estudiantes
3. Mostrar cantidad de estudiantes
4. Buscar estudiante por carnet
5. Buscar estudiante por nombre
6. Salir
   Seleccione una opcion:

## Conclusión

Este proyecto representa una primera práctica de Java siguiendo una ruta de aprendizaje estructurada.  
Aunque el programa todavía es sencillo, permite aplicar conceptos importantes como variables, arreglos, ciclos, condicionales y métodos.

En las siguientes semanas se planea agregar programación orientada a objetos, clases, encapsulamiento, herencia, colecciones, manejo de excepciones y almacenamiento en archivos.
