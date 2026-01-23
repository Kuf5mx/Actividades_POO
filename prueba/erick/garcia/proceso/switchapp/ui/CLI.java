package erick.garcia.proceso.switchapp.ui;

import java.util.Scanner;

import erick.garcia.proceso.switchapp.process.Swit;

public class CLI {

    public static void start() {
        Swit swit = new Swit();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- SwitchApp ---");
                System.out.println("Estado: " + (swit.isOn() ? "ENCENDIDO" : "APAGADO"));
                System.out.println("1) Prender");
                System.out.println("2) Apagar");
                System.out.println("0) Salir");
                System.out.print("> ");

                String option = scanner.nextLine().trim();

                switch (option) {
                    case "1":
                        swit.prender();
                        break;
                    case "2":
                        swit.apagar();
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }
        }
    }
}
