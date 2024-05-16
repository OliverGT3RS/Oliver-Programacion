package Reto7.Process;

/* Aquí se importa la variable textos, para poder imprimir el mensaje de error de definición del logaritmo,
   y la aproximación del logaritmo, en el idioma que elija el usuario. */
import Reto7.ui.Textos;

import static Reto7.ui.Textos.*;

/* Esta clase es una extensión de la clase Division,
   y permite hacer la operación de logaritmo. */
public class LogaritmoDivision extends Division {

    /* Aquí se sobrescribe el método calcular definido en la clase base OperacionAritmetica. */
    @Override
    public int calcular(int valor1, int valor2) {

        /* Aquí declaramos que si nuestra base es negativa o nuestro argumento es
           menor o igual a dos, no se puede realizar la operación. */
        if (valor1 <= 1 || valor2 <= 0) throw new ArithmeticException(Textos.ERROR_LOGARITMO_NO_DEFINIDO);

        /* Aquí declaramos que mientras nuestro argumento sea mayor a 1, se dividirá ese
           argumento entre la base del logaritmo y el resultado se guardará en el argumento;
           agregando un valor a nuestro logaritmo. */
        int logaritmo = 0;
        int argumento = valor1;
        while (argumento > 1){
            argumento = super.calcular(argumento, valor2);
            logaritmo++;
        }

        /* Aquí definimos que si la potencia de nuestro logaritmo es diferente al valor1, se indique
           que este logaritmo es un aproximado, y se dé el valor con el que el logaritmo sería exacto. */
        Reto7.Process.OperacionAritmetica operacionAritmetica;
        operacionAritmetica = new OperacionAritmetica() {
            @Override
            public int calcular(int valor1, int valor2) {
                return 0;
            }
        };
        int potencia = 1;
        for (int i = 0; i < logaritmo; i++) {
            potencia = operacionAritmetica.calcular(potencia, valor2);
        }
        if (potencia != valor1) {
            System.out.println(Textos.APROXIMACION_LOGARITMO);
            System.out.println(Textos.ARGUMENTO_EXACTO_LOGARITMO + potencia);
        }

        /* Aquí pedimos que nos imprima el resultado del logaritmo. */
        return logaritmo;
    }
}
