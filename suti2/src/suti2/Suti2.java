/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suti2;


import java.util.Scanner;
/**
 *
 * @author
 */
public class Suti2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Hány deka liszt kell a sütihez? ");
        int li_k = sc.nextInt();
        System.out.print("Hány tojás kell a sütihez? ");
        int to_k = sc.nextInt();
        System.out.print("Hány deka cukor kell a sütihez? ");
        int cu_k = sc.nextInt();
        System.out.print("Hány deka liszt van otthon? ");
        int li_v = sc.nextInt();
        System.out.print("Hány tojás van otthon? ");
        int to_v = sc.nextInt();
        System.out.print("Hány deka cukor van otthon? ");
        int cu_v = sc.nextInt();
        double adag = (double) li_v / (double) li_k;
        if (((double) cu_v / (double) cu_k) > adag)
            adag = (double) cu_v / (double) cu_k;       
          if (((double) to_v / (double) to_k) > adag)
            adag = (double) to_v / (double) to_k;
            adag = Math.ceil(adag);
          System.out.printf("Összesen %.0f adagot készítünk.\n", adag);
          int a = (int) adag;
          int li_b = a * li_k - li_v;
          int to_b = a * to_k - to_v;
          int cu_b = a * cu_k - cu_v;
          System.out.println("Venni kell még " + li_b + " deka lisztet, " + to_b + " db. tojást és " + cu_b + " deka cukrot.");
          
    }
    
}
