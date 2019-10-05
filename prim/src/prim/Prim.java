/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Prim {
    public static boolean isPrime (int a){
        boolean prim = true;
        int i = 2;
        while (i <= a/2 && prim) {
        if ((a % i) == 0)
            prim = false;
        else
            i++;}
        return prim;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot, amiről el kell döntenem, hogy prím-e: ");
        int a = sc.nextInt();
        if (isPrime(a))
            System.out.println("A szám prím.");
        else
            System.out.println("A szám nem prím.");
                
    }
    
}
