package Reto2;

import Reto2.Process.ControlDeCajas;
import Reto2.ui.CLI;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        String usuario;
        String contrasena;
        do {
            usuario = cli.solicitarUsuario();
            contrasena = cli.solicitarContrasena();
        } while (!usuario.equals("admin") || !contrasena.equals("1234"));

        ControlDeCajas controlDeCajas = new ControlDeCajas();

        int opcion;
        do {
            opcion = cli.mostrarMenu();
            switch (opcion) {
                case 1:
                    int cantidadCompra = cli.solicitarCantidad();
                    double costoCompra = cli.solicitarCostoPrecio();
                    controlDeCajas.comprarCajas(cantidadCompra, costoCompra);
                    break;
                case 2:
                    int cantidadVenta = cli.solicitarCantidad();
                    double precioVenta = cli.solicitarCostoPrecio();
                    controlDeCajas.venderCajas(cantidadVenta, precioVenta);
                    break;
                case 3:
                    controlDeCajas.mostrarReporte();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        // Mostrar resumen
        System.out.println("\n--- Resumen ---");
        System.out.println("Cantidad total de operaciones realizadas: " + controlDeCajas.getCantidadTotalOperaciones());
        System.out.println("Cantidad total de ventas: " + controlDeCajas.getCantidadTotalVentas());
        System.out.println("Cantidad total de compras: " + controlDeCajas.getCantidadTotalCompras());
        System.out.println("Monto en la caja: " + controlDeCajas.getMontoCaja());
        System.out.println("Ingresos generados por ventas: " + controlDeCajas.getIngresosPorVentas());
        System.out.println("Egresos generados por compras: " + controlDeCajas.getEgresosPorCompras());

        cli.mostrarDespedida();
    }
}