/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamatlag;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Szamatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int be = 0;
        int osszeg = 0;
        int db = 1;
        double atlag = 0;
        System.out.println("Kérem a számokat (-1-re kilép):");
        be = sc.nextInt(); 
        if (be == -1) {
            System.out.println("Az átlag: NaN");
            }
        else {
        osszeg = be;
        atlag = (double) be;  
        db++;
        while (be != -1) {
            be = sc.nextInt(); 
            if (be == -1) {
            System.out.printf("Az átlag: %.2f\n", atlag);
            }
            else {
            osszeg = osszeg + be;
            atlag = (double) osszeg / db++;
            }
             }}
    }
    
}
