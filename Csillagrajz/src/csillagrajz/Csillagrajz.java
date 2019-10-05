/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csillagrajz;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Csillagrajz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cs; 
        int i = 1;
        System.out.print("Hány csillagot rajzoljak? ");
        cs = sc.nextInt();
        while (i <= cs) {
            System.out.print("*");
            i++;
                        }
        System.out.println("");
    }
    
}
