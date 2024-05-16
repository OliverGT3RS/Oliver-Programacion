package Reto7.Process;

/**
 * Esta clase es una extensión de la clase base OperacionAritmetica y permite realizar la operación de resta.
 */
public class Resta extends Reto7.Process.OperacionAritmetica {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica para realizar la operación de resta.
     * @param valor1 El primer valor para la resta.
     * @param valor2 El segundo valor para la resta.
     * @return El resultado de la resta entre valor1 y valor2.
     */
    @Override
    public int calcular(int valor1, int valor2) {
        // Realiza la resta de valor1 y valor2.
        return valor1 - valor2;
    }
}
