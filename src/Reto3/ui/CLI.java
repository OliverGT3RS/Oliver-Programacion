package Reto3.ui;

import Reto3.Process.Diccionario;

import java.util.Scanner;

public class CLI {
    private Diccionario diccionario;
    private Scanner scanner;

    public CLI(Diccionario diccionario) {
        this.diccionario = diccionario;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        char opcion;
        do {
            System.out.println("\n---- Diccionario ---");
            System.out.println("A. Listar palabras del diccionario");
            System.out.println("B. Buscar palabra en el diccionario");
            System.out.println("C. Detalle del diccionario");
            System.out.println("D. Finalizar programa");
            System.out.print("Elegir opción: ");
            opcion = scanner.next().charAt(0);

            switch (Character.toUpperCase(opcion)) {
                case 'A':
                    diccionario.listarPalabras();
                    break;
                case 'B':
                    System.out.print("Ingrese la palabra a buscar: ");
                    String palabraBuscar = scanner.next();
                    diccionario.buscarPalabra(palabraBuscar);
                    break;
                case 'C':
                    diccionario.detalleDiccionario();
                    break;
                case 'D':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida.");
            }
        } while (Character.toUpperCase(opcion) != 'D');
        scanner.close();
    }
}
