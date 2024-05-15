package Reto2.ui;

import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

    }

    public String solicitarUsuario() {
        System.out.print("Ingrese su usuario: ");
        return scanner.nextLine();
    }

    public String solicitarContrasena() {
        System.out.print("Ingrese su contraseña: ");
        return scanner.nextLine();
    }

    public int mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Comprar cajas de papel");
        System.out.println("2. Vender cajas de papel");
        System.out.println("3. Mostrar reporte");
        System.out.println("4. Salir del programa");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarDespedida() {
        System.out.println("\n¡Gracias por usar el programa!");
    }

    // Métodos para obtener entrada de datos
    public int solicitarCantidad() {
        System.out.print("Ingrese la cantidad: ");
        return scanner.nextInt();
    }

    public double solicitarCostoPrecio() {
        System.out.print("Ingrese el costo/precio: ");
        return scanner.nextDouble();
    }
}