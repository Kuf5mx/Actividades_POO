package actividad1.erick.garcia.proceso.ui;

import actividad1.erick.garcia.proceso.concesionaria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase de inicio del programa.
 */
public class CLI {

    public static void iniciar() {
        concesionaria app = new concesionaria();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Concesionaria ===");

            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()) {
                nombre = "Cliente";
            }
            app.setNombreCliente(nombre);

            boolean salir = false;
            while (!salir) {
                System.out.println();
                System.out.println("Cliente: " + app.getNombreCliente());
                System.out.println("Autos seleccionados: " + (app.isHayAuto1() ? "1" : "0") + "/" + (app.isHayAuto2() ? "2" : "1"));
                System.out.println("1) Ver catálogo");
                System.out.println("2) Seleccionar auto");
                System.out.println("3) Ver resumen");
                System.out.println("4) Reiniciar compra");
                System.out.println("0) Salir");
                System.out.print("Opción: ");

                int opcion = leerEntero(scanner);
                switch (opcion) {
                    case 1:
                        mostrarCatalogo(app);
                        break;
                    case 2:
                        seleccionarAuto(scanner, app);
                        break;
                    case 3:
                        mostrarResumen(app);
                        break;
                    case 4:
                        app.reiniciarCompra();
                        System.out.println("Compra reiniciada.");
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            }
        }
    }

    private static void mostrarCatalogo(concesionaria app) {
        String[] nombres = app.getNombreAutos();
        double[] precios = app.getPrecioAutos();

        System.out.println();
        System.out.println("--- Catálogo ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%d) %s - $%.2f%n", i + 1, nombres[i], precios[i]);
        }
    }

    private static void seleccionarAuto(Scanner scanner, concesionaria app) {
        if (app.isHayAuto1() && app.isHayAuto2()) {
            System.out.println("Ya seleccionaste 2 autos. Usa 'Reiniciar compra' para empezar de nuevo.");
            return;
        }

        mostrarCatalogo(app);
        System.out.print("Número de auto a seleccionar: ");
        int numeroAuto = leerEntero(scanner);

        String[] nombres = app.getNombreAutos();
        if (numeroAuto < 1 || numeroAuto > nombres.length) {
            System.out.println("Número inválido.");
            return;
        }

        System.out.print("Color elegido: ");
        String color = scanner.nextLine().trim();
        if (color.isEmpty()) {
            color = "Sin especificar";
        }

        int guardado = app.seleccionarAuto(numeroAuto, color);
        if (guardado == 1) {
            System.out.println("Auto 1 seleccionado: " + app.getAuto1() + " (" + app.getColor1() + ")");
        } else if (guardado == 2) {
            System.out.println("Auto 2 seleccionado: " + app.getAuto2() + " (" + app.getColor2() + ")");
        } else {
            System.out.println("No se pudo seleccionar (ya hay 2 autos).");
        }
    }

    private static void mostrarResumen(concesionaria app) {
        System.out.println();
        System.out.println("--- Resumen de compra ---");
        System.out.println("Cliente: " + app.getNombreCliente());

        double total = 0.0;
        if (app.isHayAuto1()) {
            System.out.printf("Auto 1: %s | Color: %s | Precio: $%.2f%n", app.getAuto1(), app.getColor1(), app.getPrecio1());
            total += app.getPrecio1();
        } else {
            System.out.println("Auto 1: (no seleccionado)");
        }

        if (app.isHayAuto2()) {
            System.out.printf("Auto 2: %s | Color: %s | Precio: $%.2f%n", app.getAuto2(), app.getColor2(), app.getPrecio2());
            total += app.getPrecio2();
        } else {
            System.out.println("Auto 2: (no seleccionado)");
        }

        System.out.printf("Total: $%.2f%n", total);
    }

    private static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException ex) {
                scanner.nextLine();
                System.out.print("Ingresa un número válido: ");
            }
        }
    }
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        iniciar();
    }
}