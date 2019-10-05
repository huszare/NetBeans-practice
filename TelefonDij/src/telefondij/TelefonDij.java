/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefondij;
import java.util.Scanner;
/**
 *
 * @author
 */
public class TelefonDij {
public static int callCost (int ora, int perc, int masodperc, int percDij ){
    int mp = masodperc/60;
    int sum = 60*ora + perc + mp;
    if (masodperc%60 > 0)
        sum++;
    return sum*=percDij;
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meddig tartott a hívás?");
        System.out.print("óra: ");
        int ora = sc.nextInt();
        System.out.print("perc: ");
        int perc = sc.nextInt();
        System.out.print("másodperc: ");
        int mp = sc.nextInt();
        System.out.print("Mennyi a percdíj? ");
        int dij = sc.nextInt();
        int sum = callCost(ora, perc, mp, dij);
        System.out.printf("A hívás díja: %d Ft volt.%n", sum);
        
    }
    
}
