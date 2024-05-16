package Reto7.Process;

/**
 * Esta clase es una extensión de la clase Suma y permite realizar la operación de Multiplicacion.
 */
public class Multiplicacion extends Suma {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica.
     */
    @Override
    public int calcular(int valor1, int valor2) {

        // Variable que guarda el valor de la multiplicacion.
        int multiplicacion = 0;

        // Bucle: por cada valor en valor2, se suma el valor1 a multiplicacion.
        for (int i = 0; i < Math.abs(valor2); i++) {
            multiplicacion = super.calcular(multiplicacion, Math.abs(valor1));
        }

        // Si uno de los valores es negativo y el otro no, el resultado es negativo.
        if ((valor1 < 0 && valor2 > 0) || (valor1 > 0 && valor2 < 0)) {
            multiplicacion = -multiplicacion;
        }

        // Retorna el resultado de la multiplicacion.
        return multiplicacion;
    }
}
