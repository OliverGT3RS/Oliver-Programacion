package Reto7.Process;

import Reto7.ui.Textos;

import static Reto7.ui.Textos.*; // Importamos la variable textos para imprimir errores en el idioma elegido por el usuario.

/**
 * Esta clase es una extensión de la clase Multiplicacion y permite realizar la operación de logaritmo.
 */
public class Logaritmo extends Reto7.Process.Multiplicacion {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Si la base es negativa o el argumento es menor o igual a dos, no se puede realizar la operación y se lanza una excepción.
        if (valor1 <= 1 || valor2 <= 0) throw new ArithmeticException(Textos.ERROR_LOGARITMO_NO_DEFINIDO);

        // Variables para el logaritmo y la potencia base.
        int logaritmo = 1;
        int multiplicacion;
        int potenciaBase = valor2;

        // Bucle: mientras la potencia base sea menor o igual al valor1, se multiplica el valor2 por la potencia base y se guarda en la potencia base; aumentando el logaritmo.
        while (potenciaBase <= valor1) {
            multiplicacion = super.calcular(potenciaBase, valor2);
            potenciaBase += multiplicacion;
            logaritmo++;
        }

        // Comprobación de la aproximación del logaritmo.
        int potencia = 1;
        for (int i = 0; i < logaritmo; i++) {
            potencia = super.calcular(potencia, valor2);
        }
        if (potencia != valor1) {
            System.out.println(Textos.APROXIMACION_LOGARITMO);
            System.out.println(Textos.ARGUMENTO_EXACTO_LOGARITMO + potencia);
        }

        // Retorna el resultado del logaritmo.
        return logaritmo;
    }
}
