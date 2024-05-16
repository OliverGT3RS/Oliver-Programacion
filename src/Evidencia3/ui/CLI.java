package Evidencia3.ui;

import Evidencia3.Process.TicTacToeGame;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToeGame game = new TicTacToeGame();

        System.out.println("¡Bienvenido al juego de Tic-Tac-Toe!");
        System.out.println("Jugador X empieza.");

        while (!game.isGameOver()) {
            char currentPlayer = game.getCurrentPlayer();
            System.out.println("\nTurno de " + currentPlayer);
            System.out.print("Ingrese fila (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                displayBoard(game);
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }
        }

        char winner = game.getCurrentPlayer() == 'X' ? 'O' : 'X';
        System.out.println("\n¡Juego terminado! El ganador es el jugador " + winner);
        scanner.close();
    }

    private static void displayBoard(TicTacToeGame game) {
        char[][] board = game.getBoard();
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
