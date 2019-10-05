/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korosztaly;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Korosztaly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány éves? ");
        int kor = sc.nextInt();
        if (kor < 0) 
            System.out.println("Hibás bevitel.");
        else {
        if (kor < 6) 
            System.out.println("A foglalkozás:gyerek");
        else {
        if (kor < 19)        
            System.out.println("A foglalkozás:iskolás");
        else {
        if (kor < 65) 
            System.out.println("A foglalkozás:dolgozó");
        else {
        if (kor <= 130) 
            System.out.println("A foglalkozás:nyugdíjas");
        else    
            System.out.println("Hibás bevitel.");}}}}
        
    }   
    
}
