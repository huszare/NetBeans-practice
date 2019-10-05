/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paros50;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Paros50 {
public static boolean evenAndGreaterThan50 (int[] array) {
        boolean paros = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50) {
                if ((array[i] % 2) == 0)
                    paros = true;}
        }
        return paros;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tömb elemszámát: ");
        int n = sc.nextInt();
        int[] ma = new int[n]; 
        System.out.println("Kérem a tömb elemeit:");
        for (int i = 0; i < n; i++)
            ma [i] = sc.nextInt();
        if (evenAndGreaterThan50(ma))
            System.out.println("igen");
        else
            System.out.println("nem");
    }
    
}
