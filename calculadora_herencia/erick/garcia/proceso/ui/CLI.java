package erick.garcia.proceso.ui;

import erick.garcia.proceso.Division;
import erick.garcia.proceso.Logaritmo;
import erick.garcia.proceso.Modulo;
import erick.garcia.proceso.Multiplicacion;
import erick.garcia.proceso.Operacion;
import erick.garcia.proceso.Potencia;
import erick.garcia.proceso.Raiz;
import erick.garcia.proceso.Resta;
import erick.garcia.proceso.Suma;

import java.util.Scanner;

public class CLI {

    /**
     * Muestra el menú para elegir qué hacer.
     * Cicla hasta que el usuario quiera salir.
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

                if (opcion == 9) {
                    System.out.println("Adiós");
                    return;
                }


                try {
                    switch (opcion) {
                        case 1:
                            ejecutarOperacion(new Suma(), "Ingresa el operando 1:", "Ingresa el operando 2:", scanner);
                            break;
                        case 2:
                            ejecutarOperacion(new Resta(), "Ingresa el operando 1:", "Ingresa el operando 2:", scanner);
                            break;
                        case 3:
                            ejecutarOperacion(new Multiplicacion(), "Ingresa el multiplicando:", "Ingresa el multiplicador:", scanner);
                            break;
                        case 4:
                            ejecutarOperacion(new Division(), "Ingresa el dividendo:", "Ingresa el divisor:", scanner);
                            break;
                        case 5:
                            ejecutarOperacion(new Modulo(), "Ingresa el dividendo:", "Ingresa el divisor:", scanner);
                            break;
                        case 6:
                            ejecutarOperacion(new Potencia(), "Ingresa la base:", "Ingresa el exponente (>= 0):", scanner);
                            break;
                        case 7:
                            ejecutarOperacion(new Raiz(), "Ingresa el grado de la raíz:", "Ingresa el número (>= 0):", scanner);
                            break;
                        case 8:
                            ejecutarOperacion(new Logaritmo(), "Ingresa la base (> 1):", "Ingresa el argumento (> 0):", scanner);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                } catch (RuntimeException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

    /**
     * Metodo genérico para ejecutar cualquier operación.
     * Aquí se ve el polimorfismo, porque recibe una "Operacion"
     * y no importa si es suma, resta, etc. funciona igual.
     * 
     * @param operacion La operación que vamos a hacer como Suma o Resta
     * @param msg1 Texto para pedir el primer dato
     * @param msg2 Texto para pedir el segundo dato
     * @param scanner Para leer del teclado
     */
    private static void ejecutarOperacion(Operacion operacion, String msg1, String msg2, Scanner scanner) {
        System.out.println(msg1);
        int op1 = scanner.nextInt();
        System.out.println(msg2);
        int op2 = scanner.nextInt();
        
        int resultado = operacion.realizarOperacion(op1, op2);
        System.out.printf("El resultado es: %d%n", resultado);
    }
}

