/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketjegyukilep;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Ketjegyukilep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int be =1;    
        System.out.println("Írj be számokat! Ha kétjegyű, kilép!");
        while (be < 10 || be >99) {
            be = sc.nextInt();
            be = Math.abs(be);
            if (be < 10 || be >99)
            System.out.println("jó szám");
                        }
    }
    
}
