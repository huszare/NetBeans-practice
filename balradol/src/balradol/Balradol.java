/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balradol;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Balradol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balra dőlő háromszöget rajzoló program.");
        System.out.print("Mekkora legyen a magassága? n=");
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("A magasságnak pozitívnak kell lennie.");
        else {
           for (int i = 1; i <= n; i++) {
               for (int j = 1; j<= i; j++) 
                   System.out.print("*"); 
               System.out.println("");
           }
        }
    }
    
}
