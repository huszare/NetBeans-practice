/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzetszamok2;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Negyzetszamok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz; 
        int i = 1;
        System.out.print("Kérem a négyzetszámok határszámát! ");
        sz = sc.nextInt();
        while (i * i <= sz) {
            System.out.print(i * i + " ");
            i++;
                        }
        System.out.println("");
    }
    
}
