package Evidencia2.Process;

/* Esta es nuestra clase base en la que definimos los atributos de nuestros productos,
además de los métodos para calcular el costo y visualizar del producto. */
public class Producto {

    /* Aquí definimos los atributos de los productos. */
    protected String nombre;
    protected String tipo;
    protected double costoBase;
    protected String genero;
    protected boolean esEstreno;

    /* Aquí se genera el constructor. */
    public Producto(String nombre, String tipo, double costoBase, String genero, boolean esEstreno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costoBase = costoBase;
        this.genero = genero;
        this.esEstreno = esEstreno;
    }

    /* Este método permite calcular el precio del producto. */
    public double calcularCosto() {
        return costoBase;
    }

    /* Aquí definimos cómo se visualizará el producto. */
    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
