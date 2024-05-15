package Reto4.process;

import Reto4.ui.RegistroDeVenta;

import java.util.ArrayList;
import java.util.Scanner;

public class VentaDeBoletos {
    private final ArrayList<RegistroDeVenta> ventas;

    public VentaDeBoletos() {
        this.ventas = new ArrayList<>();
    }

    public void realizarVenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-- Realizar venta de boleto --");

        // Capturar datos del comprador
        System.out.print("Ingresar nombre del comprador: ");
        String nombreComprador = scanner.nextLine();
        System.out.print("Ingresar cantidad de boletos: ");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Capturar nombres de pasajeros adicionales
        ArrayList<String> pasajerosAdicionales = new ArrayList<>();
        for (int i = 0; i < cantidadBoletos - 1; i++) {
            System.out.print("Nombre del pasajero adicional: ");
            pasajerosAdicionales.add(scanner.nextLine());
        }

        // Calcular importe de la venta
        double importeVenta = cantidadBoletos * 1250.50;

        // Crear registro de venta y añadirlo a la lista de ventas
        ventas.add(new RegistroDeVenta(nombreComprador, cantidadBoletos, pasajerosAdicionales, importeVenta));

        // Mostrar ticket de venta
        System.out.println("\n-- Ticket de venta --");
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        System.out.println("Importe de venta: $" + importeVenta);
        System.out.println("Nombre del comprador: " + nombreComprador);
        System.out.println("Pasajeros adicionales: " + pasajerosAdicionales);
        System.out.println("---------------------------");
    }

    public void mostrarDatos() {
        // Mostrar información de ventas
        System.out.println("\n---- Lista de pasajeros ----");
        for (RegistroDeVenta venta : ventas) {
            System.out.println("Pasajero: " + venta.nombreComprador());
            System.out.println("Total de pasajeros: " + venta.cantidadBoletos());
            System.out.println("Monto total de las ventas: $" + venta.importeVenta());
        }
    }
}