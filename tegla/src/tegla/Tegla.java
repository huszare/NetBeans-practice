/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tegla;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Tegla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Téglatest térfogat- és felszínszámoló");
        System.out.print("a=");
        double a = sc.nextDouble();
        System.out.print("b=");
        double b = sc.nextDouble();
        System.out.print("c=");
        double c = sc.nextDouble();
        System.out.printf("Felszín: %.1f\n", 2*a*b+2*a*c+2*b*c);
        System.out.printf("Térfogat: %.1f\n", a*b*c);

        
        
    }
    
}
