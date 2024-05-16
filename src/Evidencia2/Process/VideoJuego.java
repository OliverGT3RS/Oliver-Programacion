package Evidencia2.Process;

/* Esta es una subclase de la clase base Producto */
public class VideoJuego extends Producto{

    /* Aquí se define nuestro producto Videojuego base */
    public VideoJuego(String nombre, String genero, boolean esEstreno) {
        super(nombre, "Videojuego", 5.0, genero, esEstreno);
    }

    /* Aquí se sobreescribe el método de calcularCosto para adaptarlo a los requerimientos de este producto */
    @Override
    public double calcularCosto() {
        if (esEstreno) {
            return costoBase + 10.0;
        } else {
            return costoBase;
        }
    }
}

