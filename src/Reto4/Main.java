package Reto4;

import Reto4.Process.VentaDeBoletos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VentaDeBoletos ventaDeBoletos = new VentaDeBoletos();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        // Ciclo principal del programa
        System.out.println("-- Sistema de registro de ventas --");
        do {
            // Mostrar menú de opciones
            System.out.println("A. Realizar venta de boleto");
            System.out.println("B. Mostrar datos de la lista de ventas");
            System.out.println("S. Finalizar programa");
            System.out.print("Elegir opción: ");
            opcion = scanner.nextLine().toUpperCase();

            // Procesar la opción seleccionada
            switch (opcion) {
                case "A":
                    ventaDeBoletos.realizarVenta();
                    break;
                case "B":
                    ventaDeBoletos.mostrarDatos();
                    break;
                case "S":
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (!opcion.equals("S"));

        System.out.println("----- fin del programa -----");
    }
}