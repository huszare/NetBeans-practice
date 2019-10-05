/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerekit;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Kerekit {
public static int round (int a){
        int kerek;
        int marad = a % 10;
        if (marad < 3) 
            kerek = a - marad;
        else {
            if (marad > 7) 
                kerek = a - marad +10;
        else
            kerek = a - marad +5;}
        return kerek;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az összeget: ");
        int a = sc.nextInt();
        System.out.println("Kerekítve: " + round(a));
    }
    
}
