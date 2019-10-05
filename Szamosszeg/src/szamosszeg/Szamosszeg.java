/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamosszeg;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Szamosszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int be = 0;
        int osszeg = 0;
        System.out.println("Kérem a számokat (-1-re kilép):");
        while (be != -1) {
            be = sc.nextInt();
            if (be == -1) {
            System.out.println("Az összeg: " + osszeg);
            }
            else {
            osszeg = osszeg + be;}
             }
    }
    
}
