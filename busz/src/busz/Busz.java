/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busz;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Busz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a(z) 1. megállónál felszálló utasok számát! ");
        int utas = sc.nextInt();
        boolean to = true;
        if (utas > 40) {
            System.out.println("Túl sok utas a(z) 1. megállónál.");
            to = false;
        }
        int fel;
        int le;
        int felMin = utas;
        int allMin = 1;
        int utasMax = utas;
        int allMax = 1;
        double atlag = utas;
        for (int i = 2; (i <= 4 && to); i++) {
            System.out.printf("Kérem a(z) %d. megállónál leszálló utasok számát! ", i);
            le = sc.nextInt();
            System.out.printf("Kérem a(z) %d. megállónál felszálló utasok számát! ", i);
            fel = sc.nextInt();
            utas += (fel - le);
            atlag += utas;
            if (utas > 40) {
                System.out.printf("Túl sok utas a(z) %d. megállónál.%n", i);
                to = false;
            } else {
                if (utas < 0) {
                    System.out.printf("Negatív utasszám a(z) %d. megállónál.%n", i);
                    to = false;
                } else {
                    if (fel < felMin) {
                        felMin = fel;
                        allMin = i;
                    }
                    if (utas > utasMax) {
                        utasMax = utas;
                        allMax = i;
                    }
                }
            }
        }
        if (to) {
            System.out.print("Kérem a(z) 5. megállónál leszálló utasok számát! ");
            le = sc.nextInt();
            utas -= le;
            if (utas != 0) {
                System.out.println("Fennmaradó utas a végállomás után.");
            } else {
                atlag = atlag / 4.0;
                System.out.printf("A 4. megálló elhagyása után %d utas volt a buszon.%n", le);
                System.out.println("Az adatok helyesek.");
                System.out.printf("A(z) %d. megállónál volt a legkevesebb a felszállók száma: %d utas.%n", allMin, felMin);
                System.out.println("A buszon átlagosan " + atlag + " utas tartózkodott.");
                System.out.printf("A legtöbb utas a(z) %d. megálló után volt: %d%n", allMax, utasMax);

            }
        }
    }

}
