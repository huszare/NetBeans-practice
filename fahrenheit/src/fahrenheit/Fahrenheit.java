/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Kérem a Celsius-fok értéket: ");
    double celsius = sc.nextDouble();
    double faren = (double) 9/5*celsius+32;
    
    System.out.printf("Fahrenheitben: %.1f" + " fok.\n", faren);
    
    
    }
    
}
