package Evidencia2;

/* Aquí se importa la variable textos para imprimir mensajes de error en el idioma que elija el usuario. */


/* Aquí se importa el CLI del package evidencia2.ui para iniciar la aplicación. */


import Evidencia2.ui.CLI;

import static Evidencia2.ui.CLI.textos;

/* Esta clase sirve para llamar el método que inicia la aplicación y maneja errores inesperados. */
public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchApp(); // Llama al método que inicia la aplicación
        } catch (Exception e) {
            /* En caso de error, imprime el mensaje de error inesperado en el idioma seleccionado por el usuario. */
            System.out.println(textos.ERROR_INESPERADO + e);
        }
    }
}
