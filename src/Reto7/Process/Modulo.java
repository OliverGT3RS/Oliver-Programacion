package Reto7.Process;

import Reto7.ui.Textos;

import static Reto7.ui.Textos.*; // Importamos la variable textos para imprimir errores en el idioma elegido por el usuario.

/**
 * Esta clase es una extensión de la clase Resta y permite obtener el módulo o residuo.
 */
public class Modulo extends Resta {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Si el divisor es 0, no se puede realizar la operación y se lanza una excepción.
        if (valor2 == 0) throw new ArithmeticException(Textos.ERROR_DIVIDIR_ENTRE_0);

        // Variable para el residuo.
        int residuo = Math.abs(valor1);

        // Bucle: mientras el residuo sea mayor o igual al divisor, se resta el divisor al dividendo.
        while (residuo >= Math.abs(valor2)) {
            residuo = super.calcular(residuo, valor2);
        }

        // Retorna el residuo.
        return residuo;
    }
}
