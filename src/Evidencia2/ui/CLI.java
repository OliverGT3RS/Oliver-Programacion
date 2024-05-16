package Evidencia2.ui;


import Evidencia2.Process.Producto;

import java.util.List;
import java.util.Scanner;

/* Aquí importamos la clase producto para poder crear la lista de productos. */
/* Aquí se importa la list de java para crear la lista de productos. */
/* Aquí se importa el scanner de java para poder reconocer los datos que ingrese el usuario. */
/* Aquí importamos los métodos de la clase ManejadorProductos, para poder utilizarlos */
import java.util.ArrayList;

import static Evidencia2.Process.ManejadorProductos.calcularCostoTotal;
import static Evidencia2.Process.ManejadorProductos.generarProductosAleatorios;

/* Esta clase se encarga de mostrar el menú de idioma al usuario, de pedirle su
inicio de sesión y de mostrarle el saldo que tiene que pagar. */
public class CLI {

    /* Aquí declaramos una variable para llamar a las variables de la clase Textos,
    además asignamos el idioma español como predeterminado */
    public static Textos textos = new Spanish();

    /* Este método sirve para mostrar el menú de idioma al usuario y que pueda elegir el idioma que prefiera.
    Las opciones son las siguientes:
    1- Español
    2- English */
    public static void showIdiomMenu() {
        System.out.println("------------------Idioma------------------");
        System.out.println("Escoja un idioma (Choose a language)");
        System.out.println("1- Español");
        System.out.println("2- English");
        System.out.println("------------------------------------------");
    }

    /* Este método sirve para iniciar la aplicación, mostrando el menú y
    leyendo el idioma que seleccione el usuario; y, en base en esa selección,
    poder imprimir los textos en ese idioma; esto utilizando un "switch case".
    Además, se pide al usuario que ingrese el usuario y contraseña correctos
    para poder ingresar y, poder mostrarle su saldo a pagar. */
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);

        showIdiomMenu();
        int idioma = scanner.nextInt();

        /* Este switch lee la opción que seleccione el usuario y permite que todos
        los textos que se muestren estén en el idioma seleccionado por el usuario. */
        switch (idioma) {
            /* Este case se activa cuando el usuario elige la opción "1" (Español). */
            case 1:
                textos = new Spanish();
                break;
            /* Este case se activa cuando el usuario elige la opción "2" (English). */
            case 2:
                textos = new English();
                break;
        }
        System.out.println();

        System.out.println(textos.INICIO_SECION);

        /* Aquí definimos el usuario y contraseña correctos. */
        String usuarioCorrecto = "Profe";
        String contrasenaCorrecta = "1234";

        boolean credencialesCorrectas = false;

        /* Este es un ciclo que le pregunta al usuario el usuario y contraseña, y este
        ciclo se repite hasta que el usuario ingrese el usuario y contraseña correctos. */
        while (!credencialesCorrectas) {
            System.out.println(textos.USUARIO);
            scanner.nextLine();
            String usuario = scanner.nextLine();
            System.out.println(textos.CONTRASENA);
            String contrasena = scanner.nextLine();

            if(usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)){
                credencialesCorrectas = true;
            } else {
                System.out.println(textos.DATOS_INCORRECTOS);
            }
        }

        System.out.println();
        System.out.println(textos.INICIO_EXITOSO);

        /* Aquí generamos de manera aleatoria el consumo del usuario (20 productos) */
        List<Producto> productosConsumidos = generarProductosAleatorios();

        /* Aquí calculamos el costo total que tiene que pagar el usuario. */
        double costoTotal = calcularCostoTotal(productosConsumidos);

        /* Aquí imprimimos el saldo que el usuario tiene que pagar. */
        System.out.println();
        System.out.println(textos.SALDO_PAGAR + costoTotal);
    }
}
