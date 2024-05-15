package Reto4.ui;

import java.util.ArrayList;

public class RegistroDeVenta {
    private final String nombreComprador;
    private final int cantidadBoletos;
    private final ArrayList<String> pasajerosAdicionales;
    private final double importeVenta;

    public RegistroDeVenta(String nombreComprador, int cantidadBoletos, ArrayList<String> pasajerosAdicionales, double importeVenta) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadBoletos;
        this.pasajerosAdicionales = pasajerosAdicionales;
        this.importeVenta = importeVenta;
    }

    // Métodos de acceso para obtener información de la venta
    public String getNombreComprador() {
        return nombreComprador;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public ArrayList<String> getPasajerosAdicionales() {
        return pasajerosAdicionales;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public String nombreComprador() {
        return null;
    }

    public String cantidadBoletos() {
        return null;
    }

    public String importeVenta() {
        return null;
    }
}
