/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevetelkiadas;
import java.util.Scanner;
/**
 *
 * @author
 */
public class BevetelKiadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány tétel szerepeljen a tömbben? ");
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("A tételek száma pozitív kell legyen!");
        else {
            boolean minusz = false;
            int merleg = 0;
            int[] beki = new int[n]; 
            System.out.println("Kérem a tételeket!");
            for (int i = 0; i < n; i++)
                beki[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                merleg += beki[i];
                if (merleg < 0)
                    minusz = true;
            }
            if (minusz)    
                System.out.println("Volt olyan pillanat, amikor negatívba csúsztunk.");  
            else
                System.out.println("Minden rendben volt.");
        }
    }
    
}
