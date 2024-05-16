package Reto7.Process;

/**
 * Esta clase es una extensión de la clase base OperacionAritmetica y permite realizar la operación de suma.
 */
public class Suma extends Reto7.Process.OperacionAritmetica {

    /**
     * Sobrescribe el método calcular definido en la clase base OperacionAritmetica para realizar la operación de suma.
     * @param valor1 El primer valor para la suma.
     * @param valor2 El segundo valor para la suma.
     * @return El resultado de la suma entre valor1 y valor2.
     */
    @Override
    public int calcular(int valor1, int valor2) {
        // Realiza la suma de valor1 y valor2.
        return valor1 + valor2;
    }
}
