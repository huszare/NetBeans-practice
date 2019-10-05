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
     System.out.println(         "|"+table[0][0]+"|"+table[0][1]+"|"+table[0][2]+"|");
     System.out.println("+-+-+-+");     
     System.out.println(         "|"+table[1][0]+"|"+table[1][1]+"|"+table[1][2]+"|");     
     System.out.println("+-+-+-+");     
     System.out.println(         "|"+table[2][0]+"|"+table[2][1]+"|"+table[2][2]+"|");     
     System.out.println("+-+-+-+");
 } 


public static int[] getValidMove (Scanner sc, int [][] table, int currentPlayer){
    int[] move = new int[2];
    boolean vissza = true;
       while (vissza) {
            System.out.printf("A(z) %d-es játékos következik.%n", currentPlayer);
            System.out.println("Melyik sor?");
            move [0] = sc.nextInt();
            System.out.println("Melyik oszlop?");
            move [1]= sc.nextInt();
            int sor = move [0] -1;
            int oszlop = move[1] -1;
            if (table[sor][oszlop] != 0)
                System.out.println("Hibás mezőszám!");
            else
                vissza = false;}
         return move;
}
         
public static void makeMove (int[][] table, int[] move, int currentPlayer) {
    int sor = move [0] -1;
    int oszlop = move[1] -1;
    table [sor][oszlop] = currentPlayer;
} 

public static int checkWinner(int[][] table) { 
    int win = 0;
    boolean out = false;
    for (int i = 0; i < 3 || out; i++)
        for (int j = 0; (j < 2 && out); j++) {
            if (table [i][j] != table [i][j+1])
                    out = true;
            else 
                win = table [i][j]; 
        }
    if (out)                    
        return win;
    else
        for (int i = 0; i < 3 || out; i++)
        for (int j = 0; (j < 2 && out); j++) {
            if (table [j][i] != table [j][i+1])
                    out = true;
            else 
                win = table [i][j]; 
        }
    if (out)                    
        return win;
    else
        return 0;
    
}

public static int nextPlayer(int currentPlayer) {
     if (currentPlayer == 1)
         return 2;
     else
         return 1;
 }
public static void displayWinner(int result) {
    if (result == 1)
        System.out.println("Az 1-es játékos győzött.");
    else
        if (result == 2)
            System.out.println("A 2-es játékos győzött.");
        else
            System.out.println("Döntetlen!");
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
         int i = 1;
              do {
                  drawTable(table);
                  move = getValidMove(sc, table, currentPlayer);
                  makeMove(table, move, currentPlayer);
                  result = checkWinner(table);
                  currentPlayer = nextPlayer(currentPlayer);
                  i++;
              }
              while (result == 0 || i < 10);
              drawTable(table);
              displayWinner(result);
    }
        
        
        }
        

