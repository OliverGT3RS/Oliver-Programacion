package Reto3.Process;

public class Diccionario {
    private static final int MAX_PALABRAS = 10;
    private String[] palabras;
    private String[] significados;
    private int cantidadPalabras;

    public Diccionario() {
        palabras = new String[MAX_PALABRAS];
        significados = new String[MAX_PALABRAS];
        cantidadPalabras = 0;
    }

    public void agregarPalabra(String palabra, String significado) {
        if (cantidadPalabras < MAX_PALABRAS) {
            palabras[cantidadPalabras] = palabra;
            significados[cantidadPalabras] = significado;
            cantidadPalabras++;
            System.out.println("Palabra agregada al diccionario.");
        } else {
            System.out.println("El diccionario está lleno, no se puede agregar más palabras.");
        }
    }

    public void listarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    public void buscarPalabra(String palabra) {
        boolean encontrada = false;
        for (int i = 0; i < cantidadPalabras; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                encontrada = true;
                System.out.println("Significado de " + palabra + ": " + significados[i]);
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra '" + palabra + "' no existe en el diccionario.");
        }
    }

    public void detalleDiccionario() {
        System.out.println("Cantidad de palabras en el diccionario: " + cantidadPalabras);
        System.out.println("Detalle del diccionario:");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println((i + 1) + ". " + palabras[i] + " - " + palabras[i].length() + " caracteres" + " | " +
                    significados[i].length() + " caracteres");
        }
    }
}