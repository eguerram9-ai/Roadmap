package app;

import java.util.Scanner;

public class Main {

    private static final int MAX_ESTUDIANTES = 10;
    private static String[] estudiantes = new String[MAX_ESTUDIANTES];
    private static int totalEstudiantes = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarEncabezado();
        mostrarEjemplosBasicos();

        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

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
                    buscarEstudiante();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarEncabezado() {
        System.out.println("=====================================");
        System.out.println("     Proyecto Java Roadmap Practice  ");
        System.out.println("=====================================");
    }

    private static void mostrarEjemplosBasicos() {
        String curso = "Java";
        int semana = 1;
        double promedio = 85.5;
        char seccion = 'A';
        boolean estudianteActivo = true;

        double puntosExtra = promedio * 0.10;
        double promedioFinal = promedio + puntosExtra;

        int promedioEntero = (int) promedioFinal;

        System.out.println("\nEjemplos basicos del roadmap de Java:");
        System.out.println("Curso: " + curso);
        System.out.println("Semana: " + semana);
        System.out.println("Promedio inicial: " + promedio);
        System.out.println("Seccion: " + seccion);
        System.out.println("Estudiante activo: " + estudianteActivo);
        System.out.println("Puntos extra: " + puntosExtra);
        System.out.println("Promedio final: " + promedioFinal);
        System.out.println("Promedio convertido a entero: " + promedioEntero);
    }

    private static void mostrarMenu() {
        System.out.println("\n========== MENU PRINCIPAL ==========");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Mostrar cantidad de estudiantes");
        System.out.println("4. Buscar estudiante");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un numero.");
            scanner.nextLine();
            System.out.print("Seleccione una opcion: ");
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    private static void registrarEstudiante() {
        if (totalEstudiantes >= MAX_ESTUDIANTES) {
            System.out.println("No se pueden registrar mas estudiantes.");
            return;
        }

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
            return;
        }

        estudiantes[totalEstudiantes] = nombre.trim();
        totalEstudiantes++;

        System.out.println("Estudiante registrado correctamente.");
    }

    private static void listarEstudiantes() {
        if (totalEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\nListado de estudiantes:");

        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
    }

    private static void mostrarCantidadEstudiantes() {
        System.out.println("Cantidad de estudiantes registrados: " + totalEstudiantes);
        System.out.println("Espacios disponibles: " + (MAX_ESTUDIANTES - totalEstudiantes));
    }

    private static void buscarEstudiante() {
        if (totalEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine().trim().toLowerCase();

        boolean encontrado = false;

        for (int i = 0; i < totalEstudiantes; i++) {
            String nombreActual = estudiantes[i].toLowerCase();

            if (nombreActual.contains(nombreBuscado)) {
                System.out.println("Encontrado: " + estudiantes[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ningun estudiante con ese nombre.");
        }
    }
}