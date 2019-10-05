/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsor;
import java.util.Scanner;
/**
 *
 * @author
 */
public class MatrixSor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ma = {{1,4,7,5,3},{3,7,9,10,1},{4,-3,2,-4,1},{5,9,6,4,3},{1,2,3,4,5}};
        int n = -1;
        while (n < 0 || n > 4) {
            System.out.println("Melyik sorát szeretnéd kiíratni (0-4)? ");
            n = sc.nextInt();
            if (n <0 || n >4)
            System.out.println("Nem jó index.");
        }
        System.out.printf("A mátrix %d. indexű sora: %n", n);
        for (int i = 0; i < 5; i++) {
            System.out.print(ma[n][i]);
            if (i < 4)
                    System.out.print(" ");
        }
        System.out.println("");
    }
        
    }
    
