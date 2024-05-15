package Reto2.Process;
public class ControlDeCajas {
    private int cantidadTotalVentas;
    private int cantidadTotalCompras;
    private double ingresosPorVentas;
    private  double egresosPorCompras;
    private double montoCaja;

    public ControlDeCajas() {
        this.cantidadTotalVentas = 0;
        this.cantidadTotalCompras = 0;
        this.ingresosPorVentas = 0.0;
        this.egresosPorCompras = 0.0;
        this.montoCaja = 0.0;
    }

    public void comprarCajas(int cantidad, double costo) {
        this.cantidadTotalCompras += cantidad;
        this.egresosPorCompras += cantidad * costo;
        this.montoCaja -= cantidad * costo;
        System.out.printf("La compra realizada por %d cajas al costo %.2f es igual a %.2f\n", cantidad, costo, cantidad * costo);
    }

    public void venderCajas(int cantidad, double precio) {
        this.cantidadTotalVentas += cantidad;
        this.ingresosPorVentas += cantidad * precio;
        this.montoCaja += cantidad * precio;
        System.out.printf("La venta realizada por %d cajas al precio de %.2f es igual a %.2f\n", cantidad, precio, cantidad * precio);
    }

    public void mostrarReporte() {
        System.out.println("Cantidad total de ventas: " + cantidadTotalVentas);
        System.out.println("Cantidad total de compras: " + cantidadTotalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosPorVentas);
        System.out.println("Egresos generados por compras: " + egresosPorCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }

    // Getters para los puntos a mostrar al finalizar el programa
    public int  getCantidadTotalOperaciones() {
        return cantidadTotalVentas + cantidadTotalCompras;
    }

    public int getCantidadTotalVentas() {
        return cantidadTotalVentas;
    }

    public int getCantidadTotalCompras() {
        return cantidadTotalCompras;
    }

    public double getMontoCaja() {
        return montoCaja;
    }

    public double getIngresosPorVentas() {
        return ingresosPorVentas;
    }

    public double getEgresosPorCompras() {
        return egresosPorCompras;
    }
}
