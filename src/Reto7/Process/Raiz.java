package Reto7.Process;

import Reto7.ui.Textos;

import static Reto7.ui.Textos.*; // Importamos la variable textos para imprimir errores en el idioma elegido por el usuario.

/**
 * Esta clase es una extensión de la clase Multiplicacion y permite realizar la operación de raíz.
 */
public class Raiz extends Reto7.Process.Multiplicacion {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Si el radical es negativo, no se puede realizar la operación y se muestra un error.
        if (valor1 < 0) throw new ArithmeticException(Textos.ERROR_RADICAL_NEGATIVO);

        // Si el índice es negativo, no se puede realizar la operación y se muestra un error.
        if (valor2 < 0) throw new ArithmeticException(Textos.ERROR_INDICE_NEGATIVO);

        // Variables necesarias para la operación de raíz.
        int raiz;
        int pruebaPotencias = 0;
        int validacion = 0;
        int aproximacion = 1;

        // Bucle: mientras la potencia de la raíz sea menor que el valor del radical, se busca el valor de la raíz.
        while (pruebaPotencias < valor1) {
            validacion = aproximacion;
            pruebaPotencias = 1;
            for (int i = 0; i < valor2; i++) {
                pruebaPotencias = super.calcular(pruebaPotencias, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        // Comprobación de la aproximación de la raíz.
        int potencia = 1;
        for (int i = 0; i < valor2; i++) {
            potencia = super.calcular(potencia, raiz);
        }
        if (potencia != valor1) {
            System.out.println(Textos.APROXIMACION_RAIZ);
            System.out.println(Textos.RADICAL_EXACTO_RAIZ + potencia);
        }

        // Retorna el resultado de la raíz.
        return raiz;
    }
}
