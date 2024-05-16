package Reto7.Process;

/**
 * Esta es nuestra clase base y es una clase abstracta en la que se define un método que indicará lo que harán las extensiones de esta clase.
 */
public abstract class OperacionAritmetica {

    /**
     * Método abstracto calcular, que se sobreescribirá en las extensiones de esta clase.
     * @param valor1 El primer valor para la operación.
     * @param valor2 El segundo valor para la operación.
     * @return El resultado de la operación aritmética.
     */
    public abstract int calcular(int valor1, int valor2);
}
