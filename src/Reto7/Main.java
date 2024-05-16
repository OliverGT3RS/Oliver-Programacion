package Reto7;

import static Reto7.ui.CLI.textos;

import Reto7.ui.CLI;

/*Esta clase sirve para llamar el metodo que incia la aplicacion;
ademas de que muestra un error concreto al usuario en dado caso de
que ingrese un valor inesperado.*/
public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchCalculadora();
        }catch (Exception e ){
            System.out.println(textos.ERROR_INESPERADO +e);
        }
    }
}