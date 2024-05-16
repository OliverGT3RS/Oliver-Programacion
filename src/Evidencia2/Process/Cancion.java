package Evidencia2.Process;

/* Esta es una subclase de la clase base Producto */
public class Cancion extends Producto{

    /* Aquí se define nuestro producto Canción base. */
    public Cancion(String nombre, String genero, boolean esEstreno) {
        super(nombre, "Cancion", 5.0, genero, esEstreno);
    }

    /* Aquí se sobreescribe el método calcularCosto para adaptarlo a los requerimientos de este producto. */
    @Override
    public double calcularCosto() {
        double costoTotal = costoBase;
        if (esEstreno) {
            costoTotal += 1.50;
        } else {
            costoTotal += 0.50;
        }
        return costoTotal;
    }
}
