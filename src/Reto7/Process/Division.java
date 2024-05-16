package Reto7.Process;

// Importamos la variable textos para imprimir errores en el idioma elegido por el usuario.

import Reto7.ui.Textos;

/**
 * Esta clase es una extensión de la clase Resta y permite realizar la operación de división.
 */
public class Division extends Resta {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Si el divisor es 0, no se puede realizar la operación y se lanza una excepción.
        if (valor2 == 0) throw new ArithmeticException(Textos.ERROR_DIVIDIR_ENTRE_0);

        // Variables para la división y el residuo.
        int division = 0;
        int residuo = Math.abs(valor1);

        // Bucle: mientras el residuo sea mayor o igual al divisor, resta el divisor al dividendo y aumenta el contador de divisiones.
        while (residuo >= Math.abs(valor2)) {
            residuo = super.calcular(residuo, valor2);
            division++;
        }

        // Si uno de los valores es negativo y el otro no, el resultado es negativo.
        if ((valor1 < 0 && valor2 > 0) || (valor1 > 0 && valor2 < 0)) {
            division = -division;
        }

        // Retorna el resultado de la división.
        return division;
    }
}
