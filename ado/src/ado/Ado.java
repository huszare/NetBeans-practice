/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bevétel: ");
        int be = sc.nextInt();
        System.out.print("Kiadás: ");
        int ki = sc.nextInt();
        System.out.printf("Iparűzési adó: %.0f Ft\n", be / 100.0 *2);
        System.out.printf("Nyereség: %.0f Ft\n", (double) (be - ki));
        System.out.printf("ÁFA: %.0f Ft\n",(be - ki) / 100.0 * 20);
        double nny = (be - ki) - (be - ki) / 100.0 * 20;
        System.out.printf("Nettó nyereség: %.0f Ft\n", nny);
        System.out.printf("Társasági adó: %.0f Ft\n", nny/100.0*15);

 
    }
    
}
