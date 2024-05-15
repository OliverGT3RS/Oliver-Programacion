package Reto3.MatrixOfNumbers;

import Reto3.MatrixOfNumbers.ui.CLI;


public class Main {
    public static void main(String[] args) {
        try{
            CLI.LaunchApp();
        }catch (Exception e ){
            System.out.println("Error inesperado "+e);
        }
    }
}