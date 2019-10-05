/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmaxindex;
import java.util.Scanner;
/**
 *
 * @author
 */
public class TombMaxIndex {
    public static int maxIndex (double[] array) {
        double maxErt = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > maxErt) {
                maxErt = array[i];
                ind =i;}
        return ind;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tömb elemszámát: ");
        int n = sc.nextInt();
        double[] ma = new double[n]; 
        System.out.println("Kérem a tömb elemeit:");
        for (int i = 0; i < n; i++)
            ma [i] = sc.nextDouble();
        System.out.println("A tömb legnagyobb elemének indexe: " + maxIndex(ma));
        
        
        
        
    }
    
}
