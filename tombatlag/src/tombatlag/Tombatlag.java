/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombatlag;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Tombatlag {

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
            System.out.println("Az átlag feletti számok:");
            double atlag = 0;
            for (int i = 0; i < n; i++)
                atlag += numbers[i];
            atlag = atlag / n;
            for (int i = 0; i < n; i++)
                if (numbers[i] > atlag)
                    System.out.print(numbers[i] + " ");
            System.out.println("");
        }
    }
    
}
