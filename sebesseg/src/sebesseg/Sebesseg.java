/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebesseg;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Sebesseg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány km/h-val ment? ");
        int seb = sc.nextInt();
        if (seb < 51)
               System.out.println("Ön szabályosan hajtott. ");
        else {
            if (seb < 66)
                System.out.println("Az Ön büntetése 0,- Ft. ");
                 else {
            if (seb < 76)
                System.out.println("Az Ön büntetése 30000,- Ft.");
                 else {
            if (seb < 86)
                System.out.println("Az Ön büntetése 45000,- Ft.");
                 else {
            if (seb < 96)
                System.out.println("Az Ön büntetése 60000,- Ft.");
                 else {
            if (seb < 106)
                System.out.println("Az Ön büntetése 90000,- Ft.");
                 else {
            if (seb < 116)
                System.out.println("Az Ön büntetése 130000,- Ft.");
                 else {
            if (seb < 126)
                System.out.println("Az Ön büntetése 200000,- Ft.");
            else 
                System.out.println("Az Ön büntetése 300000,- Ft.");}}}}}}
            
            
            
            
        }
    }
    
}
