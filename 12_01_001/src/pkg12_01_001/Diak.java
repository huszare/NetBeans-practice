/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_01_001;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Diak {
        String nev;
        int szuletesiEv;
        double atlag; 
    
    
    public void beolvas(Scanner sc) {
        System.out.println("Kérem a diák nevét!");
        this.nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        this.szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        this.atlag = sc.nextDouble();
        }     
    public void kiir() { 
        System.out.println(this.nev + " (" + this.szuletesiEv + "; "        + this.atlag + ")");
} 
}


