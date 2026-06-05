package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static HashMap<String, Estudiante> mapaEstudiantes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarEncabezado();

        int opcion = -1;

        do {
            mostrarMenu();

            try {
                opcion = leerEntero("Seleccione una opcion: ");

                switch (opcion) {
                    case 1:
                        registrarEstudiante();
                        break;

                    case 2:
                        listarEstudiantes();
                        break;

                    case 3:
                        mostrarCantidadEstudiantes();
                        break;

                    case 4:
                        buscarEstudiantePorCarnet();
                        break;

                    case 5:
                        buscarEstudiantePorNombre();
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intente nuevamente.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Ocurrio un error inesperado: " + e.getMessage());
                scanner.nextLine();
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarEncabezado() {
        System.out.println("=====================================");
        System.out.println("     Proyecto Java Roadmap Practice  ");
        System.out.println("=====================================");
        System.out.println("Dia 2: POO, encapsulamiento, herencia, colecciones y excepciones");
    }

    private static void mostrarMenu() {
        System.out.println("\n========== MENU PRINCIPAL ==========");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Mostrar cantidad de estudiantes");
        System.out.println("4. Buscar estudiante por carnet");
        System.out.println("5. Buscar estudiante por nombre");
        System.out.println("0. Salir");
    }

    private static void registrarEstudiante() {
        System.out.println("\n--- Registro de estudiante ---");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
            return;
        }

        System.out.print("Ingrese el carnet del estudiante: ");
        String carnet = scanner.nextLine();

        if (carnet.trim().isEmpty()) {
            System.out.println("El carnet no puede estar vacio.");
            return;
        }

        if (mapaEstudiantes.containsKey(carnet)) {
            System.out.println("Ya existe un estudiante con ese carnet.");
            return;
        }

        double nota = leerDouble("Ingrese la nota del estudiante: ");

        if (nota < 0 || nota > 100) {
            System.out.println("La nota debe estar entre 0 y 100.");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, carnet, nota);

        estudiantes.add(estudiante);
        mapaEstudiantes.put(carnet, estudiante);

        System.out.println("Estudiante registrado correctamente.");
    }

    private static void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\n--- Listado de estudiantes ---");

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }

    private static void mostrarCantidadEstudiantes() {
        System.out.println("Cantidad de estudiantes registrados: " + estudiantes.size());
    }

    private static void buscarEstudiantePorCarnet() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.print("Ingrese el carnet a buscar: ");
        String carnet = scanner.nextLine();

        Estudiante estudiante = mapaEstudiantes.get(carnet);

        if (estudiante != null) {
            System.out.println("\nEstudiante encontrado:");
            estudiante.mostrarInfo();
        } else {
            System.out.println("No se encontro ningun estudiante con ese carnet.");
        }
    }

    private static void buscarEstudiantePorNombre() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine().trim().toLowerCase();

        boolean encontrado = false;

        for (Estudiante estudiante : estudiantes) {
            String nombreActual = estudiante.getNombre().toLowerCase();

            if (nombreActual.contains(nombreBuscado)) {
                System.out.println(estudiante);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ningun estudiante con ese nombre.");
        }
    }

    private static int leerEntero(String mensaje) {
        int numero;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero entero.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        double numero;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero decimal valido.");
            }
        }
    }
}