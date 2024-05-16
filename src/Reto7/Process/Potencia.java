package Reto7.Process;

// Importamos la variable textos para imprimir errores en el idioma elegido por el usuario.

import Reto7.ui.Textos;

/**
 * Esta clase es una extensión de la clase Multiplicacion y permite realizar la operación de potencia.
 */
public class Potencia extends Multiplicacion {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Si el exponente es negativo, no se puede realizar la operación y se lanza una excepción.
        if (valor2 < 0) throw new ArithmeticException(Textos.ERROR_EXPONETE_NEGATIVO);

        // Variable para la potencia.
        int potencia = 1;

        // Bucle: por cada valor en valor2, se multiplica el valor1 por nuestra potencia y se guarda en la potencia.
        for (int i = 0; i < Math.abs(valor2); i++) {
            potencia = super.calcular(potencia, Math.abs(valor1));
        }

        // Calculamos el residuo de valor2 para determinar si es par o impar.
        int residuo = Math.abs(valor2) % 2;

        // Si valor1 es negativo y valor2 es impar, el resultado es negativo.
        if (valor1 < 0 && residuo != 0) {
            potencia = -potencia;
        }

        // Retorna el resultado de la potencia.
        return potencia;
    }
}
