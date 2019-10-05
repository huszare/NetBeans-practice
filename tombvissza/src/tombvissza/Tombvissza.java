/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombvissza;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Tombvissza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.print("Hány szám lesz? ");
            n = sc.nextInt();
            if (n < 0)
                System.out.println("A számok darabszáma negatív.");
        }
        if (n !=0) {
            double[] numbers = new double[n]; 
            System.out.println("Kérem írja be a számokat:");
            for (int i = 0; i < n; i++)
                numbers[i] = sc.nextDouble();
            System.out.println("A számok fordított sorrendben:");
            for (int i = n; i > 0; i--)
                System.out.print(numbers[i-1] + " ");
            System.out.println("");
        }
    }
    
}
