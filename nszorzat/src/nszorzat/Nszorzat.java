/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nszorzat;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Nszorzat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szorzatszámoló.");
        System.out.println("Hány számot ad be?");       
        int szorzat = 1;
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("Az 'n' értékének pozitívnak kell lennie.");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". szám: n= ");
                int szam = sc.nextInt();
                szorzat*=szam;
        }
        System.out.println("A beírt számok szorzata " + szorzat);
    }
    }
    
}
