/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katikonyvei;
import java.util.Scanner;
/**
 *
 * @author
 */
public class KatiKonyvei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szia Kati!");
        int n = 0;
        while (n <= 0) {
            System.out.print("Kérlek írd be, hány könyvet szeretnél elolvasni! ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Kati, a projekted biztosan legalább 1 könyvet tartalmaz!");
        }
        int sumOldal = 0;
        int minOldal = 0;
        int sumRovid = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("A(z) %d. könyv hány oldalas? ", i);
            int oldal = sc.nextInt();
            sumOldal += oldal;
            if (oldal > sumOldal)
                sumOldal = oldal;
            if (i == 1)
                minOldal = oldal;
            else {
            if (oldal < minOldal)
                minOldal = oldal;}
            if (oldal <= 120)
                sumRovid++;
         }
        double ora = sumOldal / 20.0;
        double nap = ora / 2.5;
        System.out.printf("Összesen %d oldalt akarsz elolvasni.%n", sumOldal);
        System.out.printf("A projekt %.1f óráig fog tartani, és %.2f napot vesz igénybe.%n", ora, nap);
        System.out.printf("A legrövidebb könyv %d oldalas.%n", minOldal);
        System.out.printf("A könyvek között %d db. 120 oldalnál rövidebb könyv van.%n", sumRovid);   
    }
    
}
