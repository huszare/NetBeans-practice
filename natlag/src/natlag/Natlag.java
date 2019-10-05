/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natlag;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Natlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Átlagszámoló.");
        System.out.println("Hány számot ad be?");       
        int atlag = 0;
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("Az \"n\" értékének pozitívnak kell lennie.");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". szám: ");
                int szam = sc.nextInt();
                atlag += szam ;
        }
            double atl = (double) atlag / n;
            System.out.print("A beírt számok átlaga " + atl);
            System.out.println("");
            
    }
    }
    
}
