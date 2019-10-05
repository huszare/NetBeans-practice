/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktor;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faktoriális számítás.");
        System.out.print("n= ");       
        int fakt = 1;
        int sz = sc.nextInt();
        if (sz < 0)
            System.out.println(sz + " faktoriálisát nem értelmezzük.");
        else {
            
            for (int i = sz; i >= 1; i--) {
            fakt*=i;
        }
        System.out.println(sz + "!= " + fakt);
    }}
    
}
