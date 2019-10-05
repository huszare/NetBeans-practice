/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenyofa;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Fenyofa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Fenyőfarajzoló program.");
        System.out.print("Kérem a magasságot: ");
        int n = sc.nextInt();
        if (n <= 2)
            System.out.println("A magasság csak 2-nél nagyobb lehet.");
        else {
        System.out.print("Kérem a szintek számát: ");
        int sz = sc.nextInt();
        if (sz <= 0)
            System.out.println("A szintek száma csak pozitív lehet.");
        else {
           for (int l = 1; l <= sz; l++) {
            for (int i = 1; i <= n; i++) {
               for (int j = 1; j<= 2*n; j++) {
                   if (j<=(n-i)) 
                       System.out.print(" ");
                   else {
                       if (j>(2*n-2*i+1))
                       System.out.print("*"); 
                   }
               }
               System.out.println("");
           }
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < (n-1); j++) {
            System.out.print(" ");
            }
        System.out.println("***");
        }
                
            }
        }}
    }
    
