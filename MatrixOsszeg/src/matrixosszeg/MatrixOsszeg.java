/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixosszeg;
import java.util.Scanner;
/**
 *
 * @author
 */
public class MatrixOsszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ma = new int[2][2]; 
        int[][] mb = new int[2][2]; 
        int[][] sum = new int[2][2];
        System.out.println("Kérem az első mátrix elemeit:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                ma[i][j] = sc.nextInt();
        System.out.println("Kérem a második mátrix elemeit:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mb[i][j] = sc.nextInt();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = ma[i][j] + mb[i][j];
        System.out.println("Az eredmény:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j]);
                if (j < 1)
                    System.out.print(" ");
            }
            System.out.println("");}
                
        
        
        
    }
    
}
