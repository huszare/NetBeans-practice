/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author
 */
public class TicTacToe {

    public static int[][] tableInit() {
        return new int[3][3];
    }

    public static void drawTable(int[][] table) {
        System.out.println("+-+-+-+");
        System.out.println("|" + table[0][0] + "|" + table[0][1] + "|" + table[0][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[1][0] + "|" + table[1][1] + "|" + table[1][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[2][0] + "|" + table[2][1] + "|" + table[2][2] + "|");
        System.out.println("+-+-+-+");
    }

    public static int[] getValidMove(Scanner sc, int[][] table, int currentPlayer) {
        int[] move = new int[2];
        boolean vissza = true;
        System.out.printf("A(z) %d-es játékos következik.%n", currentPlayer);
        while (vissza) {
            System.out.println("Melyik sor?");
            move[0] = sc.nextInt();
            System.out.println("Melyik oszlop?");
            move[1] = sc.nextInt();
            int row = move[0];
            int column = move[1];
            if (row < 0 || row > 2) {
                System.out.println("Hibás mezőszám!");
            } else 
                if (column < 0 || column > 2) {
                    System.out.println("Hibás mezőszám!");
            }   else 
                    if (table[row][column] != 0) {
                        System.out.println("Hibás mezőszám!");
            }       else {
                        vissza = false;
            }
        }
        return move;
    }

    public static void makeMove(int[][] table, int[] move, int currentPlayer) {
        int row = move[0];
        int column = move[1];
        table[row][column] = currentPlayer;
    }

    public static int checkWinner(int[][] table) {
        int win = 0;
        int j;
        for (int i = 0; i < 3; i++) {
            j = 0;
            while (j < 2) {
                if (table[i][j] != table[i][j + 1]) {
                    j = 4;
                } else {
                    j++;
                }
            }
            if (j == 2) {
                win = table[i][j];
                if (win != 0) {
                    return win;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            j = 0;
            while (j < 2) {
                if (table[j][i] != table[j + 1][i]) {
                    j = 4;
                } else {
                    j++;
                }
            }
            if (j == 2) {
                win = table[j][i];
                if (win != 0) {
                    return win;
                }
            }
        }
        if (table[0][0] == table[1][1]) {
            if (table[1][1] == table[2][2]) {
                win = table[2][2];
                if (win != 0) {
                    return win;
                }
            }
        }
        if (table[0][2] == table[1][1]) {
            if (table[1][1] == table[2][0]) {
                win = table[1][1];
                if (win != 0) {
                    return win;
                }
            }
        }
        return 0;
    }

    public static int nextPlayer(int currentPlayer) {
        if (currentPlayer == 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void displayWinner(int result) {
        if (result == 1) {
            System.out.println("Az 1-es játékos győzött.");
        } else if (result == 2) {
            System.out.println("A 2-es játékos győzött.");
        } else {
            System.out.println("Döntetlen!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] table;
        int currentPlayer = 1;
        int result;
        int[] move;
        table = tableInit();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            drawTable(table);
            move = getValidMove(sc, table, currentPlayer);
            makeMove(table, move, currentPlayer);
            result = checkWinner(table);
            currentPlayer = nextPlayer(currentPlayer);
            i++;
        } while (result == 0 && i < 9);
        drawTable(table);
        displayWinner(result);
    }

}
