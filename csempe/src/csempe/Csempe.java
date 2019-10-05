/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csempe;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Csempe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A szoba magassága: ");
        double m = sc.nextDouble();
        System.out.print("A szoba szélessége: ");
        double sz = sc.nextDouble();
        System.out.print("A szoba hosszúsága: ");
        double h = sc.nextDouble();
        double cs = 2 * Math.ceil(m * 4) * Math.ceil(h * 4) + 2 * Math.ceil(m * 4) * Math.ceil(sz * 4);
        System.out.printf("A szoba kicsempézéséhez %.0f csempe kell.\n", cs);
    }
    
}
