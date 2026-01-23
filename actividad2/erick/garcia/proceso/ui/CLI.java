package actividad2.erick.garcia.proceso.ui;

import actividad2.erick.garcia.proceso.Division;
import actividad2.erick.garcia.proceso.Logaritmo;
import actividad2.erick.garcia.proceso.Modulo;
import actividad2.erick.garcia.proceso.Multiplicacion;
import actividad2.erick.garcia.proceso.Potencia;
import actividad2.erick.garcia.proceso.Raiz;
import actividad2.erick.garcia.proceso.Resta;
import actividad2.erick.garcia.proceso.Suma;

import java.util.Scanner;

public class CLI {

    /**
     * Muestra un menú interactivo y ejecuta la operación seleccionada.
     * El programa se mantiene en ejecución hasta que el usuario elige salir.
     */
    public static void showMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nElige una opción:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Módulo");
                System.out.println("6. Potencia");
                System.out.println("7. Raíz (entera)");
                System.out.println("8. Logaritmo (entero)");
                System.out.println("9. Salir");

                int opcion = scanner.nextInt();

                try {
                    switch (opcion) {
                    case 1: {
                        System.out.println("Ingresa el operando 1:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el operando 2:");
                        int op2 = scanner.nextInt();
                        System.out.printf("El resultado %d + %d es: %d%n", op1, op2, Suma.realizarOperacion(op1, op2));
                        break;
                    }
                    case 2: {
                        System.out.println("Ingresa el operando 1:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el operando 2:");
                        int op2 = scanner.nextInt();
                        System.out.printf("El resultado %d - %d es: %d%n", op1, op2, Resta.realizarOperacion(op1, op2));
                        break;
                    }
                    case 3: {
                        System.out.println("Ingresa el multiplicando:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el multiplicador:");
                        int op2 = scanner.nextInt();
                        System.out.printf("El resultado %d * %d es: %d%n", op1, op2, Multiplicacion.realizarOperacion(op1, op2));
                        break;
                    }
                    case 4: {
                        System.out.println("Ingresa el dividendo:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el divisor:");
                        int op2 = scanner.nextInt();
                        System.out.printf("El resultado %d / %d es: %d%n", op1, op2, Division.realizarOperacion(op1, op2));
                        break;
                    }
                    case 5: {
                        System.out.println("Ingresa el dividendo:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el divisor:");
                        int op2 = scanner.nextInt();
                        System.out.printf("El residuo %d %% %d es: %d%n", op1, op2, Modulo.realizarOperacion(op1, op2));
                        break;
                    }
                    case 6: {
                        System.out.println("Ingresa la base:");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el exponente (>= 0):");
                        int op2 = scanner.nextInt();
                        System.out.printf("El resultado %d ^ %d es: %d%n", op1, op2, Potencia.realizarOperacion(op1, op2));
                        break;
                    }
                    case 7: {
                        System.out.println("Ingresa el grado de la raíz (ej. 2 para cuadrada):");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el número (>= 0):");
                        int op2 = scanner.nextInt();
                        System.out.printf("La raíz es: %d%n", Raiz.realizarOperacion(op1, op2));
                        break;
                    }
                    case 8: {
                        System.out.println("Ingresa la base (> 1):");
                        int op1 = scanner.nextInt();
                        System.out.println("Ingresa el argumento (> 0):");
                        int op2 = scanner.nextInt();
                        System.out.printf("El logaritmo es: %d%n", Logaritmo.realizarOperacion(op1, op2));
                        break;
                    }
                    case 9:
                        System.out.println("Adiós");
                        return;
                    default:
                        System.out.println("Opción inválida");
                    }
                } catch (RuntimeException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }
}
