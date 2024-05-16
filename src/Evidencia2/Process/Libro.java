package Evidencia2.Process;

/* Esta es una subclase de la clase base Producto */
public class Libro extends Producto{

    /* Aquí se define nuestro producto Libro base. */
    public Libro(String nombre, String genero, boolean esEstreno) {
        super(nombre, "Libro", 5.0, genero, esEstreno);
    }

    /* Aquí se sobreescribe el método calcularCosto para adaptarlo a los requerimientos de este producto. */
    @Override
    public double calcularCosto() {
        double costoTotal = costoBase;
        if (esEstreno) {
            costoTotal += 0.50;
        }
        switch (genero) {
            case "Novela":
                costoTotal += 2.0;
                break;
            case "Tecnologia":
                costoTotal += 3.0;
                break;
            default:
                costoTotal += 1.0;
        }
        return costoTotal;
    }
}
