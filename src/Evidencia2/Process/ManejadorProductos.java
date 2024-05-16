package Evidencia2.Process;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Esta clase nos permite manejar los productos, teniendo un método que crea un
listado aleatorio de 20 productos variados (de los 4 tipos), y un método que
nos permite calcular el costo total por los 20 productos. */
public class ManejadorProductos {

    /* Aquí se declara el método que genera un listado de 20 productos aleatorios,
    utilizando un ArrayList y la variable Random, junto con un switch-case, que
    diferencia los distintos productos. */
    public static List<Producto> generarProductosAleatorios() {

        /* Aquí declaramos nuestro ArrayList */
        List<Producto> productos = new ArrayList<>();

        Random random = new Random();

        /* Aquí definimos unos listados de los tipos y géneros de nuestros
        productos, además si son estrenos o no. */
        String[] tipos = {"Cancion", "Videojuego", "Libro", "Pelicula"};
        String[] generos = {"Pop", "Rock", "Aventura", "Terror", "Ciencia Ficcion",
                "Romantica", "Novela", "Tecnologia"};
        boolean[] estrenos = {true, false};

        /* Aquí se crea un bucle que se repetirá 20 veces, generando 20 productos aleatorios. */
        for (int i = 0; i < 20; i++) {

            /* Aquí se generarán atributos aleatorios. */
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean esEstreno = estrenos[random.nextInt(estrenos.length)];

            Producto producto;

            /* En este switch-case se diferencian nuestros productos por tipo y se
            les agregan los atributos de género, y estreno/noEstreno.
            Esto se repite, uno por uno, por cada uno de los 20 productos, generando así la aleatoriedad. */
            switch (tipo) {
                case "Cancion":
                    producto = new Cancion("Cancion " + i, genero, esEstreno);
                    break;
                case "Videojuego":
                    producto = new VideoJuego("Videojuego " + i, genero, esEstreno);
                    break;
                case "Libro":
                    producto = new Libro("Libro " + i, genero, esEstreno);
                    break;
                case "Pelicula":
                    producto = new Pelicula("Pelicula " + i, genero, esEstreno);
                    break;
                default:
                    producto = new Producto("Producto " + i, tipo, 5.0, genero, esEstreno);
            }

            /* Aquí se agrega el producto a la lista */
            productos.add(producto);
        }
        return productos;
    }

    /* Este método calcula el costo total basado en la lista de productos consumidos. */
    public static double calcularCostoTotal(List<Producto> productos) {
        double costoTotal = 0;
        for (Producto producto : productos) {
            costoTotal += producto.calcularCosto();
        }
        return costoTotal;
    }
}
