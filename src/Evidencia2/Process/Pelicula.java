package Evidencia2.Process;

/* Esta es una subclase de la clase base Producto */
public class Pelicula extends Producto {

    /* Aquí se define nuestro producto Película base */
    public Pelicula(String nombre, String genero, boolean esEstreno) {
        super(nombre, "Pelicula", 5.0, genero, esEstreno);
    }

    /* Aquí se sobreescribe el método calcularCosto para adaptarlo a los requerimientos de este producto */
    @Override
    public double calcularCosto() {
        if (esEstreno) {
            return 15.0;
        } else {
            return 7.0;
        }
    }
}
