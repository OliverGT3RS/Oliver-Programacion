package Reto3;

import Reto3.Process.Diccionario;
import Reto3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        CLI cli = new CLI(diccionario);
        cli.iniciar();
    }
}