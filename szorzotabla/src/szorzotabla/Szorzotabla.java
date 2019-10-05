/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szorzotabla;

/**
 *
 * @author
 */
public class Szorzotabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i*j);
                if (j < 9)
                    System.out.print(" ");
    }
            System.out.println("");}
        System.out.println("");
    }
}
