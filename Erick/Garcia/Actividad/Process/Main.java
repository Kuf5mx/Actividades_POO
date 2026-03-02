package Erick.Garcia.Actividad.Process;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase principal con el menu
 */
public class Main {
    // Scanner para leer del teclado
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Iniciando programa de cálculo...");
        runCalculadora();
        scanner.close();
    }

    /**
     * Metodo que corre el menu
     */
    public static void runCalculadora() {
        int opcion = 0;
        do {
            try {
                mostrarMenu();
                opcion = leerOpcion();
                ejecutarOpcion(opcion);
                
                if (opcion != 3) {
                    pausar();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                pausar();
            } catch (IllegalArgumentException e) {
                System.out.println("Error de validación: " + e.getMessage());
                pausar();
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                pausar();
            }
        } while (opcion != 3);
    }

    /**
     * Aqui mostramos las opciones del menu
     */
    private static void mostrarMenu() {
        // Limpieza de "pantalla" simulada con líneas en blanco
        System.out.println("\n\n----------------------------");
        System.out.println("           M E N U");
        System.out.println("----------------------------");
        System.out.println("1. Calcular Factorial");
        System.out.println("2. Serie Fibonacci");
        System.out.println("3. Salir");
        System.out.println("----------------------------");
        System.out.print("Selecciona una opción: ");
    }

    private static int leerOpcion() {
        return scanner.nextInt();
    }

    /**
     * Switch para elegir la opcion
     */
    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("\n--> Ingresa el número para calcular el factorial: ");
                int numF = scanner.nextInt();
                // Creamos el objeto y lo imprimimos
                Factorial factorialObj = new Factorial(numF);
                System.out.println(factorialObj); 
                break;
            case 2:
                System.out.print("\n--> ¿Cuántos términos de Fibonacci deseas ver?: ");
                int numFib = scanner.nextInt();
                // Creamos el objeto y lo imprimimos
                Fibonacci fibonacciObj = new Fibonacci(numFib);
                System.out.println(fibonacciObj);
                break;
            case 3:
                System.out.println("\nSaliendo del sistema...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    /**
     * Pausa para que no se borre la pantalla rapido
     */
    private static void pausar() {
        System.out.println("\nPresiona Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}
